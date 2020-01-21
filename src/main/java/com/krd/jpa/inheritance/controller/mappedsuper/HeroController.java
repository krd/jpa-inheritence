package com.krd.jpa.inheritance.controller.mappedsuper;

import com.krd.jpa.inheritance.model.mappedsuper.Hero;
import com.krd.jpa.inheritance.service.mappedsuper.HeroService;
import lombok.AllArgsConstructor;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@AllArgsConstructor
public class HeroController {

    private HeroService heroService;

    @GetMapping(value = "/hero")
    public ResponseEntity<List<Hero>> heroList() {
        List<Hero> heroes = heroService.getAllHeroes();
        return ResponseEntity.ok(heroes);
    }

    @GetMapping(value = "/hero/info/{id}")
    public ResponseEntity<Hero> hero(@NonNull @PathVariable Long id) {
        Hero hero = heroService.getHero(id);
        return ResponseEntity.ok(hero);
    }

    @PostMapping
    public ResponseEntity<Hero> add(@NonNull @RequestBody Hero hero) {
        Hero saved = heroService.addHero(hero);
        return ResponseEntity.ok(saved);
    }


}
