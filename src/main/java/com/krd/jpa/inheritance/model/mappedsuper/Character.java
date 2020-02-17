package com.krd.jpa.inheritance.model.mappedsuper;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * MappedSuperClass inheritance strategy example.
 *
 * Implementation:
 *  - Use of @MappedSuperclass required for this strategry
 *
 * Effects:
 *  - This class will NOT have a table created for it in DB
 *  - Child classes will have a table created for them
 *  - Child classes will have all fields defined by parent present in EACH table (data duplication!!)
 *  - Must set parent fields for each instance
 *
 * Drawbacks:
 *  - Ancestors have no associations to each other
 *
 */

@Data
@MappedSuperclass
@NoArgsConstructor
@AllArgsConstructor
public class Character {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String firstName;

    @Column
    private String lastName;

    @Column
    private Integer hitPoints;

}
