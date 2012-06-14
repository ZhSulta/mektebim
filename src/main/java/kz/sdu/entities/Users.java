package kz.sdu.entities;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "users")
public class Users {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="users_sequence")
    @SequenceGenerator(name="users_sequence", sequenceName="users_sequence", allocationSize=1)
    BigDecimal user_id;

    @ManyToOne
    @JoinColumn(name = "role", referencedColumnName = "role_id")
    Role role;

    @Column
    String username;

    @Column
    String password;

    public BigDecimal getUserId() {
        return user_id;
    }

    public void setUserId(BigDecimal user_id) {
        this.user_id = user_id;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
