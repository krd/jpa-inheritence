package com.krd.jpa.inheritance.service.tableperclass;

import com.krd.jpa.inheritance.model.tableperclass.Alien;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class TablePerClassIntegrationTest {

  @Autowired
  private AlienService alienService;

  @Test
  public void whenQueryingAliens_thenReturnAllSubClasses() {

    // when fetching all aliens via findAll()
    List<Alien> aliens = (ArrayList<Alien>) alienService.getAliens();


    // then all subclasses are returned as well
    assert !aliens.isEmpty();

    aliens.stream().forEach(alien -> System.out.println(alien));

  }

}
