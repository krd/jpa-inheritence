package com.krd.jpa.inheritance.service.joinedtable;

import com.krd.jpa.inheritance.model.joinedtable.TieFighter;
import com.krd.jpa.inheritance.model.joinedtable.Vehicle;
import com.krd.jpa.inheritance.repository.joinedtable.TieFighterRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class TieFightService {

    private TieFighterRepository tieFighterRepository;

    public TieFighter getTieFighterByStyle(String style) {
        Optional<TieFighter> optional = tieFighterRepository.findByStyle("Tie");
        if (optional.isPresent()) return optional.get();
        return new TieFighter();
    }

    // THIS IS THE DOWNSIDE TO HAVING OUR REPOSITORY EXTEND VEHICLEREPOSITORY
    public List<TieFighter> getAll() {
        List<Vehicle> vehicles = (List<Vehicle>) tieFighterRepository.findAll();
        List<TieFighter> ties = vehicles.stream().map((v) -> (TieFighter) v).collect(Collectors.toList());
        return ties;
    }

}
