package com.krd.jpa.inheritance.model.mappedsuper;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;

@Data
@Entity
@EqualsAndHashCode(callSuper = false)
public class Villain extends Character {

    @JsonProperty(value = "motto")
    @Column(name = "MOTTO")
    private String motto;

    @JsonProperty(value = "moniker")
    @Column(name = "MONIKER")
    private String moniker;

}
