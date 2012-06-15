package kz.sdu.entities;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "nationality")
public class Ring {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ring_sequence")
    @SequenceGenerator(name = "ring_sequence", sequenceName = "ring_sequence", allocationSize = 1)
    BigDecimal ring_id;
    
    @ManyToOne
    @JoinColumn(name = "school", referencedColumnName = "school_id")
    School school;
    
    @Column
    int lessonNumber;
    
    @Column
    Date time_s;
    
    @Column
    Date time_f;
}
