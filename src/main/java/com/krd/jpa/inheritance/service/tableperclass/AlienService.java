package com.krd.jpa.inheritance.service.tableperclass;


import com.krd.jpa.inheritance.model.tableperclass.Alien;
import com.krd.jpa.inheritance.repository.tableperclass.AlienRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AlienService {

  private AlienRepository alienRepository;

  public List<Alien> getAliens() {
    return (List<Alien>) alienRepository.findAll();
  }

}
