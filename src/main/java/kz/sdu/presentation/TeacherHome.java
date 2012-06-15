package kz.sdu.presentation;

import java.util.ArrayList;
import javax.annotation.PostConstruct;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

import kz.sdu.bussiness.SchoolHome;
import kz.sdu.entities.School;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import kz.sdu.bussiness.ClassHome;
import kz.sdu.entities.SchoolClass;

@ManagedBean(name = "teacherHome")
@SessionScoped
public class TeacherHome {

//    private final static String LIST = "list.xhtssml";
    private final static String toJournal = "toJournal";
    private final static String profile = "profile";
    private DataModel<SchoolClass> classes = new ListDataModel<SchoolClass>();
    private ClassHome classHome = new ClassHome();
    private static SchoolClass currentClass = new SchoolClass();

    public ClassHome getClassHome() {
        return classHome;
    }

    public void setClassHome(ClassHome classHome) {
        this.classHome = classHome;
    }
    

    
    public DataModel<SchoolClass> getClasses() {
        return classes;
    }
    
    public void setClasses(DataModel<SchoolClass> classes) {
        this.classes = classes;
    }
    
    public static SchoolClass getCurrentClass() {
        return currentClass;
    }
    
    public void setCurrentClass(SchoolClass currentClass) {
        this.currentClass = currentClass;
    }
    
    @PostConstruct
    public void init() {
        reload();
    }
    
    public void reload() {
        System.out.println("22");
        classes = new ListDataModel<SchoolClass>();
        classes.setWrappedData(classHome.list());
    }
    
    public String profile() {
        //System.out.println("1");
        currentClass = classes.getRowData();
        //System.out.println(currentClass.getClass());
        reload();
        return profile;
    }
    
    public ArrayList<String> getDivision() {
        ArrayList<String> division = new ArrayList<String>();
        for (int i = 0; i < classes.getRowCount(); i++) {            
            division.add(classes.getRowData().getGrade().toString() + " " + classes.getRowData().getDevision().toString());
        }
        return division;
    }
    
    public String getJournal() {
        currentClass = classes.getRowData();
        System.out.println(currentClass.getGrade());
        return toJournal;
    }
}
