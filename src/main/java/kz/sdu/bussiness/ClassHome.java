package kz.sdu.bussiness;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.NotSupportedException;
import javax.transaction.SystemException;
import javax.transaction.UserTransaction;

import kz.sdu.entities.City;
import kz.sdu.entities.School;
import kz.sdu.entities.SchoolClass;

public class ClassHome {
    
    @PersistenceContext(unitName = "primary")
    EntityManager em;
    @Resource
    UserTransaction ut;
    
    public ArrayList<SchoolClass> list() {
        ArrayList<SchoolClass> allClasses = new ArrayList<SchoolClass>();
        
        City city = new City();
        city.setName("Astana");
        
        School school1 = new School();
        school1.setAddress("Bayganin 24");
        school1.setName("Astana");
        school1.setDescription("Some desc");
        school1.setPhoneNumber("8070-12-12");
        school1.setCity(city);
        
        SchoolClass myClass = new SchoolClass();
        myClass.setSchool(school1);
        myClass.setGrade(9);
        myClass.setDevision('A');
        allClasses.add(myClass);
        
        SchoolClass myClass1 = new SchoolClass();
        myClass1.setSchool(school1);
        myClass1.setGrade(10);
        myClass1.setDevision('B');
        allClasses.add(myClass1);
        
        
        return allClasses;
    }
}
