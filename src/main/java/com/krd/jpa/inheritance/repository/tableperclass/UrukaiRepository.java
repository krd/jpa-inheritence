package com.krd.jpa.inheritance.repository.tableperclass;

import com.krd.jpa.inheritance.model.tableperclass.Urukai;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UrukaiRepository extends CrudRepository<Urukai, Long> {
}
