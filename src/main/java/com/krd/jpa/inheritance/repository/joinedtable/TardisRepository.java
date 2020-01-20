package com.krd.jpa.inheritance.repository.joinedtable;

import com.krd.jpa.inheritance.model.joinedtable.Tardis;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TardisRepository extends CrudRepository<Tardis, Long> {
}
