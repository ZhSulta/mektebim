package kz.sdu.entities;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name="nationality")
public class Nationality {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="nationality_sequence")
    @SequenceGenerator(name="nationality_sequence", sequenceName="nationalitys_sequence", allocationSize=1)
    BigDecimal nationality_id;

    @Column
    String type;

    public BigDecimal getNationalityId() {
        return nationality_id;
    }

    public void setNationalityId(BigDecimal nationality_id) {
        this.nationality_id = nationality_id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
