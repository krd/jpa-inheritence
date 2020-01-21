package com.krd.jpa.inheritance.service.tableperclass;

import com.krd.jpa.inheritance.model.tableperclass.Orc;
import com.krd.jpa.inheritance.repository.tableperclass.OrcRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class OrcService {

    private OrcRepository orcRepository;

    public List<Orc> getAllOrcs() {
        return (List<Orc>) orcRepository.findAll();
    }

    public Orc getOrc(String name) {
        Optional<Orc> found = orcRepository.findByName("Gothmog");
        if(found.isPresent()) { return found.get(); } else { return new Orc();}
    }
}
