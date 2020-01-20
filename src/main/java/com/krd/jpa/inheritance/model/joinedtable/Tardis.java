package com.krd.jpa.inheritance.model.joinedtable;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Data
@Entity
//@PrimaryKeyJoinColumn(name ="tardisId")
@EqualsAndHashCode
public class Tardis {

    private static final long serialVersionUID = 1L;

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private Boolean policeBox;

    @Column
    private String color;

}
