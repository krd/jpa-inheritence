package com.krd.jpa.inheritance.model.mappedsuper;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;

@Data
@Entity
public class Villain extends Character {

    @Column
    private String motto;

    @Column
    private String moniker;

}
