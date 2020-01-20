package com.krd.jpa.inheritance.model.tableperclass;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Data
//@Entity
@EqualsAndHashCode
public class WhiteWalker {

    private static final long serialVersionUID = 1L;

//    @Id
//    @Column(name = "ID")
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "eyeColor")
    private String eyeColor;

    @Column(name = "freeFolk")
    private Boolean freeFolk;
}
