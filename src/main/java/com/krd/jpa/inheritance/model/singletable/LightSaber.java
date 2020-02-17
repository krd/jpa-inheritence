package com.krd.jpa.inheritance.model.singletable;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Data
@Entity
@DiscriminatorValue("LIGHTSABER")
public class LightSaber extends Item {

    @Column
    String style;

    @Column
    private Integer damage;

}
