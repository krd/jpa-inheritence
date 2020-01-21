package com.krd.jpa.inheritance.repository.joinedtable;

import com.krd.jpa.inheritance.model.joinedtable.TieFighter;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
// NOTE THAT EXTENDING VehicleRepository will force any methods such as .find(), .findAll() to require explicit casting
public interface TieFighterRepository extends VehicleRepository {

    Optional<TieFighter> findByStyle(String style);
}
