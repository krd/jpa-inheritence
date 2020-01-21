package com.krd.jpa.inheritance.model.singletable;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
//@Table(name = "Item", schema = "singletable")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
//@DiscriminatorColumn(name = "DTYPE", discriminatorType = DiscriminatorType.STRING, length = 32)
public class Item {

  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column
  private String size;

  @Column
  private String color;
}
