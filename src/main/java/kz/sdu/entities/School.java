package kz.sdu.entities;

import java.math.BigDecimal;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="school")
public class School {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="school_sequence")
    @SequenceGenerator(name="school_sequence", sequenceName="schools_sequence", allocationSize=1)
	@Column(name="school_id")
	BigDecimal school_id;
	
	@Column
	String description;
	
	@ManyToOne
	@JoinColumn(name="city",referencedColumnName="city_id")
	City city;
	
	@Column
	String address;
	
	@Column
	String phone_number;

    @Column
    @OneToMany(mappedBy = "school")
    Set<Student> students;

    @Column
    @OneToMany(mappedBy = "school")
    Set<SchoolClass> schoolClasses;

    @Column
    @OneToMany(mappedBy = "teacher_id")
    Set<Teacher> teachers;


	
	public BigDecimal getSchoolId() {
		return school_id;
	}
	public void setSchoolId(BigDecimal school_id) {
		this.school_id = school_id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public City getCity() {
		return city;
	}
	public void setCity(City city) {
		this.city = city;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNumber() {
		return phone_number;
	}
	public void setPhoneNumber(String phone_number) {
		this.phone_number = phone_number;
	}

    public Set<SchoolClass> getSchoolClasses() {
        return schoolClasses;
    }

    public void setSchoolClasses(Set<SchoolClass> schoolClasses) {
        this.schoolClasses = schoolClasses;
    }

    public Set<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(Set<Teacher> teachers) {
        this.teachers = teachers;
    }
}
