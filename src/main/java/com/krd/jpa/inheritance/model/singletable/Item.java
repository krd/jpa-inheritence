package com.krd.jpa.inheritance.model.singletable;

import lombok.Data;

import javax.persistence.*;

/**
 * Single Table inheritance strategy example.
 *
 * Implementation:
 *  - Use of @Inheritance annotation with strategy enum InheritanceType.SINGLE_TABLE
 *  - Default strategy for JPA inheritance
 *  - Id is defined by parent class and not children
 *  - Children are required to use the @DiscriminatorValue annotation.  Defines the 'type' on entity
 *  - Parent can optionally use the @DiscriminatorColumn annotation to customize the discriminator column
 *
 * Effects:
 *  - A single table is created for the parent AND all children
 *  - By default a field named DTYPE will be generated to provide the entity 'type' for each record, unless defined by parent
 *  - Must set parent and siblings fields for each instance or will they will be null
 *
 * Drawbacks:
 *  - Queries are complex
 *  - Possibly need to provide data for siblings fields
 *
 */

@Data
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Item {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column
  private String size;

  @Column
  private String color;
}
