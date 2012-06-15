package kz.sdu.entities;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "role")
public class Schedule {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "schedule_sequence")
    @SequenceGenerator(name = "schedule_sequence", sequenceName = "schedule_sequence", allocationSize = 1)
    BigDecimal schedule_id;
       
    @ManyToOne
    @JoinColumn(name = "ring", referencedColumnName = "ring_id")
    Ring ring;
    
    @ManyToOne
    @JoinColumn(name = "schoolClass", referencedColumnName = "school_class_id")
    SchoolClass schoolClass;
    
    @ManyToOne
    @JoinColumn(name = "lesson", referencedColumnName = "lesson_id")
    Lesson lesson;
    
    @Column
    String weekDay;
    
}
