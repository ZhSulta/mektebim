package kz.sdu.entities;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "profile")
public class Profile {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="profile_sequence")
    @SequenceGenerator(name="profile_sequence", sequenceName="profile_sequence", allocationSize=1)
    BigDecimal profile_id;

    @Column
    Date birthday;

    @ManyToOne
    @JoinColumn(name = "nationality", referencedColumnName = "nationality_id")
    Nationality nationality;

    @Column
    String gender;

    @ManyToOne
    @JoinColumn(name = "city",referencedColumnName = "city_id")
    City city;

    @Column
    String address;

    @Column
    String email;

    @Column
    String phone_number;



}
