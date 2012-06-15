package kz.sdu.bussiness;

import java.util.ArrayList;
import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.NotSupportedException;
import javax.transaction.SystemException;
import javax.transaction.UserTransaction;
import kz.sdu.entities.City;
import kz.sdu.entities.School;
import kz.sdu.entities.SchoolClass;
import kz.sdu.entities.Student;
import kz.sdu.presentation.TeacherHome;

public class StudentHome {

    @PersistenceContext(unitName = "primary")
    EntityManager em;
    @Resource
    UserTransaction ut;

    public ArrayList<Student> list() {
        ArrayList<Student> allStudents = new ArrayList<Student>();

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
        myClass.setGrade(10);
        myClass.setDevision('B');



        Student s = new Student();
        s.setFirstNameEN("Sulta");
        s.setLastNameEN("Zhiyenbay");
        s.setSchool(school1);
        s.setSchoolClass(myClass);
        
        System.out.println("1");
        System.out.println(TeacherHome.getCurrentClass().getGrade());
        System.out.println(myClass.getGrade());
        System.out.println(TeacherHome.getCurrentClass().getDevision());
        System.out.println(myClass.getDevision());
        System.out.println("2");
        if ((TeacherHome.getCurrentClass().getGrade() == myClass.getGrade())
                && TeacherHome.getCurrentClass().getDevision() == myClass.getDevision()) {
            allStudents.add(s);
        }

        return allStudents;
    }
}
