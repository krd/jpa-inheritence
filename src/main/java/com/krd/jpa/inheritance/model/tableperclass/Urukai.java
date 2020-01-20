package com.krd.jpa.inheritance.model.tableperclass;


import com.krd.jpa.inheritance.repository.tableperclass.CreatureRepository;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Data
@Entity
@EqualsAndHashCode
public class Urukai extends Creature {

  @Column
  private String name;

  @Column
  private String master;
}
