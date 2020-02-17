package com.krd.jpa.inheritance.model.joinedtable;


import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

/**
 * Joined Table Per Class inheritance strategy example.
 *
 * Implementation:
 *  - Use of @Inheritance annotation with strategy enum InheritanceType.JOINED
 *  - Children only need to extend parent.  No additional annotations required
 *
 * Effects:
 *  - The parent class will have a table created for it in DB
 *  - Each child will automatically have an identifier column created for them in the DB.  This column will be defined
 *    by the parent's @Id field.
 *  - Child classes will have a table created for them
 *  - Child classes tables will have only their fields and the identifier field
 *
 *  Drawbacks:
 *  - Queries require JOINs.
 *  - Number of JOINs goes up the higher you go on inheritance hierarchy
 *  - Querying parent will query ALL children
 *
 */


@Data
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Vehicle {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long vehicleId;

    @Column
    private Integer numberOfPilots;

    @Column
    private Integer topSpeed;

}
