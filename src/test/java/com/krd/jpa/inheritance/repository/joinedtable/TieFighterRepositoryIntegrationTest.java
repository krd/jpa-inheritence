package com.krd.jpa.inheritance.repository.joinedtable;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TieFighterRepositoryIntegrationTest {

    @Autowired
    private TieFighterRepository tieFighterRepository;

    @Autowired
    private VehicleRepository vehicleRepository;

    @Test
    public void whenNewModel_thenSaveEntity() {
//        Vehicle tableperclass = new Vehicle();
//        vehicleRepository.save(tableperclass);
//        Optional<Vehicle> found = vehicleRepository.findById(1L);
//        assert found.isPresent();

//        TieFighter tieFighter = new TieFighter();
//        tieFighter.setBlasterDamage(100);
//        tieFighter.setEscapePod(false);
//        tieFighter.setStyle("Interceptor");
////        tieFighter.setVehicleId(1L);
//        tieFighter.setTopSpeed(100);
//        tieFighter.setNumberOfPilots(1);
//
//        tieFighterRepository.save(tieFighter);
    }
}
