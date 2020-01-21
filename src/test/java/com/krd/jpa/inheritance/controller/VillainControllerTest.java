package com.krd.jpa.inheritance.controller;

import com.krd.jpa.inheritance.controller.mappedsuper.VillainController;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@Slf4j
@SpringBootTest
public class VillainControllerTest {

    @InjectMocks
    VillainController villainController;

//    @Test
//    public void whenVillainEntity_thenReturnTableColumnsNames() {
//        List<String> names = villainController.tableColumnsName();
//        villainController.tableColumnsName();
//    }
}
