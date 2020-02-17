package com.krd.jpa.inheritance.model.mappedsuper;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Data
@Entity
//@EqualsAndHashCode(callSuper = false)
public class Hero extends Character {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column
  String catchPhrase;

  @Column
  private Boolean mask;

  @Column
  private Boolean cape;

  @Column
  private Boolean sideKick;

  @Column
  private String organization;

  @Column
  private String alias;


}
