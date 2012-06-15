/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kz.sdu.entities;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "lesson")
public class Lesson {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "lesson_sequence")
    @SequenceGenerator(name = "lesson_sequence", sequenceName = "lesson_sequence", allocationSize = 1)
    BigDecimal lesson_id;
    
    @Column    
    String name;
    
}
