package com.krd.jpa.inheritance.model.mappedsuper;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Table(uniqueConstraints = {@UniqueConstraint(columnNames = {"FIRST_NAME", "LAST_NAME"})})
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public class Character {

    // BOOHOO... I WON'T HAVE MY OWN TABLE :(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column
    private Integer hitPoints;

}
