package com.krd.jpa.inheritance.model.joinedtable;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Data
@Entity
@EqualsAndHashCode
public class Tardis extends Vehicle {

    private static final long serialVersionUID = 1L;

    @Column
    private Boolean policeBox;

    @Column
    private String color;

}
