package kz.sdu.entities;


import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "teacher")
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="teacher_sequence")
    @SequenceGenerator(name="teacher_sequence", sequenceName="teacher_sequence", allocationSize=1)
    @Column(name="school_id")
    BigDecimal teacher_id;

    @OneToOne
    School school;

    @Column
    String first_name_en;

    @Column
    String last_name_en;

    @Column
    String middle_name_en;

    @Column
    String first_name_kz;

    @Column
    String last_name_kz;

    @Column
    String middle_name_kz;

    @ManyToOne
    @JoinColumn(name = "status",referencedColumnName = "status_id")
    Status status;

    @Column
    String university;

    @Column
    Date last_edited;



    @OneToOne
    Profile profile;

    public BigDecimal getTeacherId() {
        return teacher_id;
    }

    public void setTeacherId(BigDecimal teacher_id) {
        this.teacher_id = teacher_id;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public String getFirstNameEN() {
        return first_name_en;
    }

    public void setFirstNameEN(String first_name_en) {
        this.first_name_en = first_name_en;
    }

    public String getLastNameEN() {
        return last_name_en;
    }

    public void setLast_name_en(String last_name_en) {
        this.last_name_en = last_name_en;
    }

    public String getMiddleNameEN() {
        return middle_name_en;
    }

    public void setMiddleNameEN(String middle_name_en) {
        this.middle_name_en = middle_name_en;
    }

    public String getFirstNameKZ() {
        return first_name_kz;
    }

    public void setFirstNameKZ(String first_name_kz) {
        this.first_name_kz = first_name_kz;
    }

    public String getLastNameKZ() {
        return last_name_kz;
    }

    public void setLastNameKZ(String last_name_kz) {
        this.last_name_kz = last_name_kz;
    }

    public String getMiddleNameKZ() {
        return middle_name_kz;
    }

    public void setMiddleNameKZ(String middle_name_kz) {
        this.middle_name_kz = middle_name_kz;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public Date getLastEdited() {
        return last_edited;
    }

    public void setLastEdited(Date last_edited) {
        this.last_edited = last_edited;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }
}
