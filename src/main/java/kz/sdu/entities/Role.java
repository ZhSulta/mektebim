package kz.sdu.entities;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "role")
public class Role {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="role_sequence")
    @SequenceGenerator(name="role_sequence", sequenceName="role_sequence", allocationSize=1)
    BigDecimal role_id;

    @Column
    String type;

    public BigDecimal getRoleId() {
        return role_id;
    }

    public void setRoleId(BigDecimal role_id) {
        this.role_id = role_id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
