package com.krd.jpa.inheritance.controller.mappedsuper;

import com.krd.jpa.inheritance.model.mappedsuper.Villain;
import com.krd.jpa.inheritance.service.mappedsuper.VillainService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
@RestController
@AllArgsConstructor
public class VillainController {

    private VillainService villainService;

    @GetMapping(value = "/villain/columns")
    public Map<String, String> tableColumnsName() {
//      List<String> Columns = new ArrayList<>();
        Map<String, String> columns = new HashMap<>();
      Field[] fields = Villain.class.getDeclaredFields();
      Field[] parentFields = Villain.class.getSuperclass().getDeclaredFields();

      for (Field field : fields) {
          Column col = field.getAnnotation(Column.class);
          if (col != null) {
              columns.put(col.name(), field.getType().getName());
          }
      }
      return columns;
    }

  @GetMapping(value = "/villain")
  public List<Villain> allVillains() {
    List<Villain> villains = villainService.getAllVillains();
    return villains;
  }

  @GetMapping(value = "/villain/{moniker}")
    public Villain getVillainMoniker(@NotNull @PathVariable("moniker") String moniker) {
        Villain villain = villainService.getVillainByMoniker(moniker);
      return villain;
  }

    @GetMapping(value = "/villain/info/{id}")
    public Villain getVillainId(@NotNull @PathVariable("id") Long id) {
        Villain villain = villainService.getById(id);
        return villain;
    }

    @PostMapping(value = "/villain/add")
    public ResponseEntity addVillain(@NotNull @RequestBody Villain villain) {
        // check validity
        Villain saved = villainService.addVillain(villain);
        return ResponseEntity.ok(saved);
    }

}
