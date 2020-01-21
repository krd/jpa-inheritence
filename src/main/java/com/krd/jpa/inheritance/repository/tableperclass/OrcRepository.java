package com.krd.jpa.inheritance.repository.tableperclass;

import com.krd.jpa.inheritance.model.tableperclass.Orc;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface OrcRepository extends CrudRepository<Orc, Long> {

    public Optional<Orc> findByName(String name);
}
