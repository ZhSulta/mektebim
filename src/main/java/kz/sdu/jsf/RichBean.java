/*
 * JBoss, Home of Professional Open Source
 * Copyright 2012, Red Hat, Inc. and/or its affiliates, and individual
 * contributors by the @authors tag. See the copyright.txt in the 
 * distribution for a full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,  
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package kz.sdu.jsf;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;
import javax.persistence.Transient;
import javax.transaction.NotSupportedException;
import javax.transaction.SystemException;
import javax.transaction.UserTransaction;

import kz.sdu.entities.Users;

/**
 * <p>
 * {@link RichBean} is the JSF backing bean for the application, holding the input data to be
 * re-displayed.
 * </p>
 * 
 */
@Named
@SessionScoped
public class RichBean implements Serializable {

    private static final long serialVersionUID = -6239437588285327644L;
    
    @PersistenceContext(unitName="primary")
    EntityManager em;
    
    @Resource
    UserTransaction ut;
    
    private String name;

    @PostConstruct
    public void postContruct() {
        name = "John";
    }

    public String getName() {
        return name;
    }

    
    public void setName(String name) {
    	
    	
        try {
        	ut.begin();
        	
        	Users user = new Users();
        	user.setPassword("Some text");
        	user.setUsername("ads");
        	
        	em.persist(user);
        	
        	List<Users> list = em.createQuery("Select u From Users u").getResultList();
        	
        	System.out.println(list.size());
        	
        	ut.commit();
        	
        }catch (Exception e) {
			e.printStackTrace();
		} finally {
           // entityManager.close();
        }
    	
        this.name = name;
    }
}
