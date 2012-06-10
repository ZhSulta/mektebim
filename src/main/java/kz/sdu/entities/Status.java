package kz.sdu.entities;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Set;

@Entity
@Table(name = "status")
public class Status {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="status_sequence")
    @SequenceGenerator(name="status_sequence", sequenceName="status_sequence", allocationSize=1)
    @Column(name="status_id")
    BigDecimal status_id;

    @Column
    String type;


    @OneToMany(mappedBy = "status")
    Set<Teacher> teachers;


    public BigDecimal getStatusId() {
        return status_id;
    }

    public void setStatusId(BigDecimal status_id) {
        this.status_id = status_id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Set<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(Set<Teacher> teachers) {
        this.teachers = teachers;
    }
}
