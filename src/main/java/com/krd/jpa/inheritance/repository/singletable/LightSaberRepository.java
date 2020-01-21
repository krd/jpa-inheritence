package com.krd.jpa.inheritance.repository.singletable;

import com.krd.jpa.inheritance.model.singletable.LightSaber;
import org.springframework.stereotype.Repository;

import java.util.HashSet;

@Repository
// NOTE THAT EXTENDING ItemRepository will force any methods such as .find(), .findAll() to require explicit casting
public interface LightSaberRepository extends ItemRepository {
  public HashSet<LightSaber> findByColorAndStyle(String color, String style);
}
