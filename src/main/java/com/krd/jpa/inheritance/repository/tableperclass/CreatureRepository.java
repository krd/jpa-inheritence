package com.krd.jpa.inheritance.repository.tableperclass;

import com.krd.jpa.inheritance.model.tableperclass.Creature;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CreatureRepository extends CrudRepository<Creature, Long> {
}
