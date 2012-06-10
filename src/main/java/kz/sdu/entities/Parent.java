package kz.sdu.entities;


import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Set;

@Entity
@Table
public class Parent {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="parent_sequence")
    @SequenceGenerator(name="parent_sequence", sequenceName="parent_sequence", allocationSize=1)
    BigDecimal parent_id;

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

    @OneToOne
    Profile profile;

    @Column
    @OneToMany(mappedBy = "student_id")
    Set<Student> students;

    public BigDecimal getParentId() {
        return parent_id;
    }

    public void setParentId(BigDecimal parent_id) {
        this.parent_id = parent_id;
    }

    public String getFirst_NameEN() {
        return first_name_en;
    }

    public void setFirstNameEN(String first_name_en) {
        this.first_name_en = first_name_en;
    }

    public String getLastNameEN() {
        return last_name_en;
    }

    public void setLastNameEN(String last_name_en) {
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

    public void setFirstName_KZ(String first_name_kz) {
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

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }
}
