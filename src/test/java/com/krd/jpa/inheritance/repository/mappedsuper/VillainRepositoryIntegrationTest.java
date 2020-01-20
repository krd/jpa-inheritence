package com.krd.jpa.inheritance.repository.mappedsuper;

import org.springframework.boot.test.context.SpringBootTest;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

@SpringBootTest
public class VillainRepositoryIntegrationTest {

//    @Autowired
//    private VillainRepository villainRepository;

//    @Test
//    public void whenFindByMoniker_thenReturnVillain() {
//        // given
//        Villain villain = new Villain();
//        villain.setFirstName("Unknown");
//        villain.setLastName("Unknown");
//        villain.setHitPoints(500);
//        villain.setMoniker("Darth Maul");
//        villainRepository.save(villain);
//
//        // when
//        Optional<Villain> found = villainRepository.findByMoniker("Darth Maul");
//
//        // then
//        assertTrue(found.isPresent());
//    }

//    @Test
//    public void whenFindAll_thenReturnEntities() {
//        // given
//        Villain villain = new Villain();
//        villain.setFirstName("Emperor");
//        villain.setLastName("Palpatine");
//        villain.setHitPoints(1000);
//        villain.setMoniker("Darth Sidious");
//        villainRepository.save(villain);
//
//        // when
//        List<Villain> villainList = (ArrayList<Villain>) villainRepository.findAll();
//        Iterable<Villain> villains = villainRepository.findAll();
//
//        // then
//        assertTrue(villainList.size() > 0);
//        assertTrue(villains.iterator().hasNext());
//    }
}
