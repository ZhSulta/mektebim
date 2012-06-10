package kz.sdu.entities;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "school_class")
public class SchoolClass {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="school_class_sequence")
    @SequenceGenerator(name="school_class_sequence", sequenceName="school_class_sequence", allocationSize=1)
    BigDecimal school_class_id;

    @Column
    Integer grade;

    @Column
    Character devision;


    @OneToOne
    Teacher teacher;

    @ManyToOne
    @JoinColumn(name = "school", referencedColumnName = "school_id")
    School school;

    @Column
    Date last_edited;

    @Column
    @OneToMany(mappedBy = "schoolClass")
    Set<Student> students;

    public BigDecimal getSchoolClassId() {
        return school_class_id;
    }

    public void setSchoolClassId(BigDecimal school_class_id) {
        this.school_class_id = school_class_id;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public Character getDevision() {
        return devision;
    }

    public void setDevision(Character devision) {
        this.devision = devision;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public Date getLastEdited() {
        return last_edited;
    }

    public void setLastEdited(Date last_edited) {
        this.last_edited = last_edited;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }
}
