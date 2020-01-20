package com.krd.jpa.inheritance.repository.mappedsuper;

import com.krd.jpa.inheritance.model.mappedsuper.Villain;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

// NOTE:  I can't just extend CharacterRepository
@Repository
public interface VillainRepository extends CrudRepository<Villain,Long> {
    public Optional<Villain> findByMoniker(String moniker);
}
