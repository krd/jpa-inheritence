package com.krd.jpa.inheritance.repository.joinedtable;

import com.krd.jpa.inheritance.model.joinedtable.TieFighter;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository

public interface TieFighterRepository extends VehicleRepository {

    Optional<TieFighter> findByStyle(String style);
}
