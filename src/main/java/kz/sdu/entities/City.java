package kz.sdu.entities;

import java.math.BigDecimal;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "city")
public class City {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="city_sequence")
    @SequenceGenerator(name="city_sequence", sequenceName="city_sequence", allocationSize=1)
	BigDecimal city_id;
	
	@Column(name = "name")
	String name;
	
	@OneToMany(mappedBy="city",fetch=FetchType.LAZY)
	Set<School> schools;
	
	public BigDecimal getCityId() {
		return city_id;
	}
	public void setCityId(BigDecimal city_id) {
		this.city_id = city_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<School> getSchools() {
		return schools;
	}
	public void setSchools(Set<School> schools) {
		this.schools = schools;
	}
	
	
	
}
