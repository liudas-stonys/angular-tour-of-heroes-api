package lt.liudasstonys.angulartourofheroesapi.mockdb;

import lt.liudasstonys.angulartourofheroesapi.entity.Hero;

import java.util.Arrays;
import java.util.List;

public class MockDb {
    public static List<Hero> heroes = Arrays.asList(
            new Hero(Hero.counter.incrementAndGet(), "Dr Nice"),
            new Hero(Hero.counter.incrementAndGet(), "Narco"),
            new Hero(Hero.counter.incrementAndGet(), "Bombasto"),
            new Hero(Hero.counter.incrementAndGet(), "Celeritas"),
            new Hero(Hero.counter.incrementAndGet(), "RubberMan"),
            new Hero(Hero.counter.incrementAndGet(), "Dynama"),
            new Hero(Hero.counter.incrementAndGet(), "Dr IQ"),
            new Hero(Hero.counter.incrementAndGet(), "Magma"),
            new Hero(Hero.counter.incrementAndGet(), "Tornado")
    );
}
