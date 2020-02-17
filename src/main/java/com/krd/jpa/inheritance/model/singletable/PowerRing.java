package com.krd.jpa.inheritance.model.singletable;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Data
@Entity
@DiscriminatorValue(value = "POWERRING")
public class PowerRing extends Item {

    @Column
    private String weakness;

    @Column
    private boolean rechargeable;
}
