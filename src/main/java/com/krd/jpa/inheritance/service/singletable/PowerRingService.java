package com.krd.jpa.inheritance.service.singletable;

import com.krd.jpa.inheritance.model.singletable.Item;
import com.krd.jpa.inheritance.model.singletable.PowerRing;
import com.krd.jpa.inheritance.repository.singletable.PowerRingRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class PowerRingService {

    private PowerRingRepository powerRingRepository;

    public List<PowerRing> getAllPowerRings() {
        return ((List<PowerRing>) powerRingRepository.findAll());
    }

    public PowerRing getByWeakness(String weakness) {
        Optional<PowerRing> found = powerRingRepository.findByWeakness(weakness);
        return (found.isPresent())? found.get() : null;
    }

}
