package kz.sdu.presentation;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import kz.sdu.bussiness.StudentHome;
import kz.sdu.entities.Student;

@ManagedBean(name = "teacherJournalHome")
@SessionScoped
public class TeacherJournalHome {

    private DataModel<Student> students = new ListDataModel<Student>();
    private StudentHome studentHome = new StudentHome();

    public StudentHome getStudentHome() {
        return studentHome;
    }

    public void setStudentHome(StudentHome studentHome) {
        this.studentHome = studentHome;
    }

    public DataModel<Student> getStudents() {
        reload();
        return students;
    }

    public void setStudents(DataModel<Student> students) {
        this.students = students;
    }

    @PostConstruct
    public void init() {
        reload();
    }

    public void reload() {
        System.out.println("22");
        students = new ListDataModel<Student>();
        students.setWrappedData(studentHome.list());
    }
}
