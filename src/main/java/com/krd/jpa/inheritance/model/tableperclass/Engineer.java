package com.krd.jpa.inheritance.model.tableperclass;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;

@Data
@Entity
public class Engineer extends Alien {

    @Column
    Boolean hair;
}
