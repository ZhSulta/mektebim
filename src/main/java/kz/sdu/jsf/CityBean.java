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
import java.math.BigDecimal;

import javax.annotation.Resource;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.UserTransaction;

import kz.sdu.dao.ICityDAO;
import kz.sdu.entities.City;


@Named
@SessionScoped
public class CityBean implements Serializable,ICityDAO {

    private static final long serialVersionUID = -6239437588285327644L;

    @PersistenceContext(unitName="primary")
    EntityManager em;

    @Resource
    UserTransaction ut;


    @Override
    public boolean save(Object obj) {
        try {
            ut.begin();
            em.persist(obj);
            ut.commit();

        }catch (Exception e) {
            e.printStackTrace();
            return false;
        }

        return  true;
    }

    @Override
    public boolean delete(BigDecimal id) {
        try {
            ut.begin();
            City city= em.find(City.class, id);
            em.remove(city);
            ut.commit();

        }catch (Exception e) {
            e.printStackTrace();
            return false;
        }

        return  true;
    }

    @Override
    public City find(BigDecimal id) {
        City cityEntity;
        try {
            ut.begin();
            cityEntity = em.find(City.class, id);
            ut.commit();

        }catch (Exception e) {
            e.printStackTrace();
            return null;
        }

        return  cityEntity;

    }


    public void doTest(){
        delete(new BigDecimal(2));
    }
}