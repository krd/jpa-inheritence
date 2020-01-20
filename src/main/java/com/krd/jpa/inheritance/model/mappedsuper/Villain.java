package com.krd.jpa.inheritance.model.mappedsuper;


import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;

@Data
@Entity
//@Table(schema = "mappedsuper")
@EqualsAndHashCode(callSuper = false)
public class Villain extends Character {

    @Column(name = "MOTTO")
    private String motto;

    @Column(name = "Moniker")
    private String moniker;

}
