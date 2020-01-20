package com.krd.jpa.inheritance.repository.singletable;

import com.krd.jpa.inheritance.model.singletable.LightSaber;

import java.util.HashSet;


public interface LightSaberRepository extends ItemRepository {
  public HashSet<LightSaber> findByColorAndStyle(String color, String style);
}
