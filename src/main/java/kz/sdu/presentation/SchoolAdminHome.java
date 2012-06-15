package kz.sdu.presentation;

import java.util.ArrayList;
import javax.annotation.PostConstruct;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

import kz.sdu.bussiness.SchoolHome;
import kz.sdu.entities.School;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "schoolAdminHome")
@SessionScoped
public class SchoolAdminHome {

//    private final static String LIST = "list.xhtssml";
//    private final static String ADD = "add.xhtml";
    private final static String profile = "profile";
    private DataModel<School> schools = new ListDataModel<School>();
    private SchoolHome schoolHome = new SchoolHome();
    private School currentSchool = new School();

    public School getCurrentSchool() {
        return currentSchool;
    }

    public void setCurrentSchool(School currentSchool) {
        this.currentSchool = currentSchool;
    }

    public SchoolHome getSchoolHome() {
        return schoolHome;
    }

    public void setSchoolHome(SchoolHome schoolHome) {
        this.schoolHome = schoolHome;
    }

    public DataModel<School> getSchools() {
        return schools;
    }

    @PostConstruct
    public void init() {
        reload();
    }

    public void reload() {
        System.out.println("22");
        schools = new ListDataModel<School>();
        schools.setWrappedData(schoolHome.list());
    }

    public String profile() {
        System.out.println("1");
        currentSchool = schools.getRowData();
        System.out.println(currentSchool.getName());
        reload();
        return profile;
    }
}
