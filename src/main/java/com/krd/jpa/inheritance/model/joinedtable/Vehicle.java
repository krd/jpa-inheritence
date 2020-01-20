package com.krd.jpa.inheritance.model.joinedtable;


import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Data
@Entity
@EqualsAndHashCode
//@Table(name = "VEHICLE")
@Inheritance(strategy = InheritanceType.JOINED)
//@DiscriminatorColumn(name = "vehicleId")
public class Vehicle {

    private static final long serialVersionUID = 1L;

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long vehicleId;

    @Column
    private Integer numberOfPilots;

    @Column
    private Integer topSpeed;

}
