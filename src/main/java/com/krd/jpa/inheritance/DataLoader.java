package com.krd.jpa.inheritance;

import com.krd.jpa.inheritance.model.joinedtable.Tardis;
import com.krd.jpa.inheritance.model.joinedtable.TieFighter;
import com.krd.jpa.inheritance.model.joinedtable.Vehicle;
import com.krd.jpa.inheritance.model.mappedsuper.Hero;
import com.krd.jpa.inheritance.model.mappedsuper.Villain;
import com.krd.jpa.inheritance.model.singletable.LightSaber;
import com.krd.jpa.inheritance.model.singletable.PowerRing;
import com.krd.jpa.inheritance.model.tableperclass.Creature;
import com.krd.jpa.inheritance.model.tableperclass.Orc;
import com.krd.jpa.inheritance.model.tableperclass.Urukai;
import com.krd.jpa.inheritance.repository.joinedtable.TardisRepository;
import com.krd.jpa.inheritance.repository.joinedtable.TieFighterRepository;
import com.krd.jpa.inheritance.repository.joinedtable.VehicleRepository;
import com.krd.jpa.inheritance.repository.mappedsuper.CharacterRepository;
import com.krd.jpa.inheritance.repository.mappedsuper.HeroRepository;
import com.krd.jpa.inheritance.repository.mappedsuper.VillainRepository;
import com.krd.jpa.inheritance.repository.singletable.ItemRepository;
import com.krd.jpa.inheritance.repository.singletable.LightSaberRepository;
import com.krd.jpa.inheritance.repository.tableperclass.CreatureRepository;
import com.krd.jpa.inheritance.repository.tableperclass.OrcRepository;
import com.krd.jpa.inheritance.repository.tableperclass.UrukaiRepository;
import org.hibernate.cache.spi.support.AbstractReadWriteAccess;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {


    @Autowired
    private VillainRepository villainRepository;

    @Autowired
    private TardisRepository tardisRepository;

    @Autowired
    private HeroRepository heroRepository;

    @Autowired
    private LightSaberRepository lightSaberRepository;

    @Autowired
    private ItemRepository itemRepository;

    @Autowired
    private VehicleRepository vehicleRepository;

    @Autowired
    private TieFighterRepository tieFighterRepository;

    @Autowired
    private CreatureRepository creatureRepository;

    @Autowired
    private UrukaiRepository urukaiRepository;

    @Autowired
    private OrcRepository orcRepository;


    @Override
    public void run(ApplicationArguments args) throws Exception {

        initJoinedTable();
        initMappedSuperClass();
        initSingleTable();
        initTablePerClass();

    }

    private void initMappedSuperClass() {

        Villain villain = new Villain();
        villain.setMoniker("Galactic Space Whiner");
        villain.setMotto("But I was going into Tosche Station to pick up some power converters!");
        villain.setFirstName("Luke");
        villain.setLastName("Skywalker");
        villain.setHitPoints(1);

        villainRepository.save(villain);

        Hero hero = new Hero();
        hero.setAlias("Darth Vader");
        hero.setCape(true);
        hero.setCatchPhrase("I find your lack of faith disturbing.");
        hero.setMask(true);
        hero.setOrganization("Galactic Empire");
        hero.setSideKick(false);
        hero.setFirstName("Anakin (former name)");
        hero.setLastName("Skywalker (former name)");
        hero.setHitPoints(10000);

        // NOTE:  can't do this!  Need HeroRepository
        //  characterRepository.save(hero);
        heroRepository.save(hero);
    }

    private void initSingleTable() {
        // SINGLE TABLE
        LightSaber lightSaber = new LightSaber();
        lightSaber.setColor("red");
        lightSaber.setDamage(150);
        lightSaber.setStyle("double-bladed");

        lightSaberRepository.save(lightSaber);

        PowerRing powerRing = new PowerRing();
        powerRing.setRechargeable(true);
        powerRing.setWeakness("yellow");

        itemRepository.save(powerRing);
    }

    private void initJoinedTable() {

        Vehicle vehicle = new Vehicle();
        vehicle.setNumberOfPilots(4);
        vehicle.setTopSpeed(1000000);

        // NOTE THAT I CAN CREATE A VEHICLE BY ITSELF
        vehicleRepository.save(vehicle);

        TieFighter tieFighter = new TieFighter();
        tieFighter.setBlasterDamage(150);
        tieFighter.setEscapePod(false);
        tieFighter.setStyle("bomber");
        tieFighter.setNumberOfPilots(3);
        tieFighter.setTopSpeed(1000);

        // NOTE I CAN USE PARENT REPOSITORY, BUT TIE FIGHTER SPECIFIC FIELDS WON'T BE PERSISTED
        vehicleRepository.save(tieFighter);

        // NOW THEY WILL BE WHEN I USE the TIE FIGHT REPO
        TieFighter interceptor = new TieFighter();
        interceptor.setBlasterDamage(350);
        interceptor.setEscapePod(true);
        interceptor.setStyle("Interceptor");
        interceptor.setNumberOfPilots(1);
        interceptor.setTopSpeed(999);

        // NOTE THAT A VEHICLE_ID FIELD IS ADDED TO THE TABLE TO MAP VEHICLE TABLE TO TIE_FIGHTER
        tieFighterRepository.save(interceptor) ;

        // ALSO NOTE THAT THE VEHICLE TABLE HAS 3 ENTRIES BUT TIE_FIGHTER ONLY HAS 2

        Tardis tardis = new Tardis();
        tardis.setColor("blue");
        tardis.setPoliceBox(true);

        tardisRepository.save(tardis);

        Tardis anotherTardis = new Tardis();
        anotherTardis.setColor("red");
        anotherTardis.setPoliceBox(false);

        // NOTE THAT I CAN'T USE VEHICLE REPO HERE BECAUSE I DIDN'T EXTEND IT
//        vehicleRepository.save(anotherTardis);
    }

    private void initTablePerClass() {

        Urukai urukai = new Urukai();
        urukai.setMaster("Saruman");
        urukai.setName("Gorbag");
        urukai.setHitPoints(50);
        urukai.setAlignment("CHAOTIC EVIL");

        urukaiRepository.save(urukai);

        Orc orc = new Orc();
        orc.setMaster("Sauron");
        orc.setHitPoints(5);
        orc.setAlignment("CHAOTIC EVIL");
        orc.setName("Gothmog");

        orcRepository.save(orc);

    }
}
