package com.krd.jpa.inheritance.service.mappedsuper;

import com.krd.jpa.inheritance.model.mappedsuper.Hero;
import com.krd.jpa.inheritance.repository.mappedsuper.HeroRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class HeroService {

    HeroRepository heroRepository;

    public List<Hero> getAllHeroes() {
        return (List<Hero>) heroRepository.findAll();
    }

    public Hero getHero(Long id) {
        Optional<Hero> found = heroRepository.findById(id);
        return found.get();
    }

    public Hero addHero(Hero hero) {
        return heroRepository.save(hero);
    }
}
