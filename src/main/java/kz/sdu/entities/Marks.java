/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kz.sdu.entities;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "marks")
public class Marks {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "marks_sequence")
    @SequenceGenerator(name = "marks_sequence", sequenceName = "marks_sequence", allocationSize = 1)
    BigDecimal marks_id;
        
    @Column
    int mark;    
    
    @ManyToOne
    @JoinColumn(name = "student", referencedColumnName = "student_id")
    Student student;
    
    @Column    
    Date last_edited;
}
