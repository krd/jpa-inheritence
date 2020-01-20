package com.krd.jpa.inheritance.model.singletable;


import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Data
@Entity
//@Table(name = "Item", schema = "singletable")
@DiscriminatorValue("LIGHTSABER")
@EqualsAndHashCode(callSuper = false)
public class LightSaber extends Item {

    @Column
    String color;

    @Column(name = "style")
    String style;

    @Column(name = "damage")
    private Integer damage;
}
