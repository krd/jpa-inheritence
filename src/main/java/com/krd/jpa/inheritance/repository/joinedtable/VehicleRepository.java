package com.krd.jpa.inheritance.repository.joinedtable;

import com.krd.jpa.inheritance.model.joinedtable.Vehicle;
import org.springframework.data.repository.CrudRepository;

public interface VehicleRepository extends CrudRepository<Vehicle, Long> {
}
