package com.krd.jpa.inheritance.repository.singletable;

import com.krd.jpa.inheritance.model.singletable.Item;
import org.springframework.data.repository.CrudRepository;

public interface ItemRepository extends CrudRepository<Item, Long> {
}
