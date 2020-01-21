package com.krd.jpa.inheritance.repository.singletable;


import com.krd.jpa.inheritance.model.singletable.PowerRing;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PowerRingRepository extends CrudRepository<PowerRing, Long> {
    public PowerRing findByWeakness(String weakness);
}
