package com.krd.jpa.inheritance.repository.tableperclass;

import com.krd.jpa.inheritance.model.tableperclass.Alien;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlienRepository extends CrudRepository<Alien, Long> {
}
