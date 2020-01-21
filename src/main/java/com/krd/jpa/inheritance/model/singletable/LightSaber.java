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

    @Column(name = "style")
    String style;

    @Column(name = "damage", columnDefinition = "", insertable = true, length = 32, nullable = true, precision = 0)
    private Integer damage;


}
