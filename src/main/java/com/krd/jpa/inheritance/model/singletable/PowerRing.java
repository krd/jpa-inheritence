package com.krd.jpa.inheritance.model.singletable;


import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Data
@Entity
//@Table(name = "Item", schema = "singletable")
@DiscriminatorValue(value = "POWERRING")
@EqualsAndHashCode(callSuper = false)
public class PowerRing extends Item {

    @Column
    private String weakness;

    @Column
    private boolean rechargeable;
}
