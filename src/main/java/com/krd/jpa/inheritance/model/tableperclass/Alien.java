package com.krd.jpa.inheritance.model.tableperclass;

import lombok.Data;

import javax.persistence.*;

/**
 * Table Per Class inheritance strategy example.
 *
 * Implementation:
 *  - Use of @Inheritance annotation with strategy enum InheritanceType.TABLE_PER_CLASS
 *  - Similar to MappedSuper class except that a concrete table will be created
 *
 * Effects:
 *  - This class will have a table created for it in DB
 *  - Child classes will have a table created for them
 *  - Child classes will have all fields defined by parent present in EACH table (data duplication!!)
 *  - Must set parent fields for each instance or will be null
 *  - Queries are complex
 *
 *  Advantages:
 *  - Single table is used for all queries
 *  - Disciminators can be specified via Hibernate queries via @DiscriminatorFormula
 *
 *  Drawbacks:
 *  - Children cannot use NOT NULL constraints on fields
 *
 */

@Data
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Alien {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String name;

    @Column
    private Boolean spaceShip;

    @Column
    private Boolean quadruped;

    @Column
    private Integer eyes;

}
