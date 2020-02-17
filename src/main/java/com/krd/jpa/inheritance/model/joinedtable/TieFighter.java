package com.krd.jpa.inheritance.model.joinedtable;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class TieFighter extends Vehicle {

    @Column
    private Integer blasterDamage;

    @Column
    private String style;

    @Column
    private boolean escapePod;
}
