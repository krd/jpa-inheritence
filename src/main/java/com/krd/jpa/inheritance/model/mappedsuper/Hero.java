package com.krd.jpa.inheritance.model.mappedsuper;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Data
@Entity
//@Table(schema = "mappedsuper")
@EqualsAndHashCode(callSuper = false)
public class Hero extends Character {

  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;

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
