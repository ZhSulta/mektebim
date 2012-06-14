package kz.sdu.entities;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="student_sequence")
    @SequenceGenerator(name="student_sequence", sequenceName="student_sequence", allocationSize=1)
	BigDecimal student_id;

    @Column
	String last_name_en;

    @Column
	String first_name_en;

    @Column
	String middle_name_en;

    @Column
	String last_name_kz;

    @Column
	String first_name_kz;

    @Column
	String middle_name_kz;

    @Column
	String language_group;


    @ManyToOne
    @JoinColumn(name = "schoolClass", referencedColumnName = "school_class_id")
	SchoolClass schoolClass;

    @ManyToOne
    @JoinColumn(name = "parent",referencedColumnName = "parent_id")
	Parent parent;

    @ManyToOne
    @JoinColumn(name = "school",referencedColumnName = "school_id")
    School school;

    @Column
	Long student_code;

    @Column
	Date last_edited;



	public BigDecimal getStudentId() {
		return student_id;
	}

	public void setStudentId(BigDecimal student_id) {
		this.student_id = student_id;
	}

	
	public String getLastNameEN() {
		return last_name_en;
	}

	public void setLastNameEN(String last_name_en) {
		this.last_name_en = last_name_en;
	}

	public String getFirstNameEN() {
		return first_name_en;
	}

	public void setFirstNameEN(String first_name_en) {
		this.first_name_en = first_name_en;
	}

	public String getMiddleNameEN() {
		return middle_name_en;
	}

	public void setMiddleNameEN(String middle_name_en) {
		this.middle_name_en = middle_name_en;
	}

	public String getLastNameKZ() {
		return last_name_kz;
	}

	public void setLastNameKZ(String last_name_kz) {
		this.last_name_kz = last_name_kz;
	}

	public String getFirstNameKZ() {
		return first_name_kz;
	}

	public void setFirstNameKZ(String first_name_kz) {
		this.first_name_kz = first_name_kz;
	}

	public String getMiddle_name_kz() {
		return middle_name_kz;
	}

	public void setMiddleNameKZ(String middle_name_kz) {
		this.middle_name_kz = middle_name_kz;
	}

	public String getLanguageGroup() {
		return language_group;
	}

	public void setLanguageGroup(String language_group) {
		this.language_group = language_group;
	}

	public SchoolClass getSchoolClass() {
		return schoolClass;
	}

	public void setSchoolClass(SchoolClass schoolClass) {
		this.schoolClass = schoolClass;
	}

	public Parent getParent() {
		return parent;
	}

	public void setParent(Parent parent) {
		this.parent = parent;
	}

	public School getSchool() {
		return school;
	}

	public void setSchool(School school) {
		this.school = school;
	}

	public Long getStudentCode() {
		return student_code;
	}

	public void setStudentCode(Long student_code) {
		this.student_code = student_code;
	}

	public Date getLastEdited() {
		return last_edited;
	}

	public void setLastEdited(Date last_edited) {
		this.last_edited = last_edited;
	}

	
	
}
