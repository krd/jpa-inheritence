package com.krd.jpa.inheritance.service.mappedsuper;

import com.krd.jpa.inheritance.model.mappedsuper.Villain;
import com.krd.jpa.inheritance.repository.mappedsuper.VillainRepository;
import lombok.AllArgsConstructor;
import lombok.NonNull;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class VillainService {

    private VillainRepository villainRepository;

    public Villain getVillainByMoniker(@NonNull final String moniker) {
        Optional<Villain> found = villainRepository.findByMoniker(moniker);
        if(found.isPresent()) {
            return found.get();
        }
        return null;
    }

    public List<Villain> getAllVillains() {
        List<Villain> found = (ArrayList<Villain>)villainRepository.findAll();
        if (found == null) {
            return new ArrayList<Villain>();
        }
        return found;
    }

    public Villain getById(Long id) {
        Optional<Villain> found = villainRepository.findById(id);
        return found.get();
    }

    public Villain addVillain(Villain villain) {
        Villain saved = villainRepository.save(villain);
        return saved;
    }


}
