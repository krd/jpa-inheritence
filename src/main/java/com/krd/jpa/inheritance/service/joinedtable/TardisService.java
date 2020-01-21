package com.krd.jpa.inheritance.service.joinedtable;

import com.krd.jpa.inheritance.model.joinedtable.Tardis;
import com.krd.jpa.inheritance.repository.joinedtable.TardisRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TardisService {

    TardisRepository tardisRepository;

    public List<Tardis> getAllTardises() {
        return (List<Tardis>) tardisRepository.findAll();
    }

}
