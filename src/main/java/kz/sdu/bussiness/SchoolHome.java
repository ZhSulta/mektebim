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

public class SchoolHome {

    @PersistenceContext(unitName = "primary")
    EntityManager em;
    @Resource
    UserTransaction ut;

    public ArrayList<School> list() {
        ArrayList<School> allSchools = new ArrayList<School>();

        City city = new City();
        city.setName("Astana");
        
        School school1 = new School();
        school1.setAddress("Bayganin 24");
        school1.setName("Astana");
        school1.setDescription("Some desc");
        school1.setPhoneNumber("8070-12-12");
        school1.setCity(city);
        allSchools.add(school1);

        School school = new School();
        school.setAddress("Bayganin 24");
        school.setName("Aksay");
        school.setDescription("Some desc");
        school.setPhoneNumber("8070-12-12");
        school.setCity(city);
        allSchools.add(school);

        return allSchools;
    }
}
