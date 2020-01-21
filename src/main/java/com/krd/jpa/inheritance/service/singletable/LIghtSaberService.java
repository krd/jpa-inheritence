package com.krd.jpa.inheritance.service.singletable;

import com.krd.jpa.inheritance.model.singletable.Item;
import com.krd.jpa.inheritance.model.singletable.LightSaber;
import com.krd.jpa.inheritance.repository.singletable.LightSaberRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class LIghtSaberService {

    LightSaberRepository lightSaberRepository;


    // THIS IS THE DOWNSIDE TO HAVING OUR REPOSITORY EXTEND ITEMREPOSITORY
    public List<LightSaber> getAllLightSabers() {

        Iterable<Item> items =  (List<Item>) lightSaberRepository.findAll();
        List<LightSaber> sabers = ((List<Item>) items).stream().map((ls) -> (LightSaber) ls).collect(Collectors.toList());

        return sabers;
    }
}
