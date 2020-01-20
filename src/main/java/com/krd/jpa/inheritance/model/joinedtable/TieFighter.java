package com.krd.jpa.inheritance.model.joinedtable;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
//@PrimaryKeyJoinColumn(name ="tieId")
//@DiscriminatorValue("TieFighter")
//@EqualsAndHashCode
public class TieFighter extends Vehicle {

    private static final long serialVersionUID = 1L;

//    @Id
////    @Column(name = "TIE_ID")
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private Long id;

    @Column
    private Integer blasterDamage;

    @Column
    private String style;

    @Column
    private boolean escapePod;
}
