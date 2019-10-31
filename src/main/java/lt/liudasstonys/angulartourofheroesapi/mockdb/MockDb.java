package lt.liudasstonys.angulartourofheroesapi.mockdb;

import lombok.Getter;
import lombok.Setter;
import lt.liudasstonys.angulartourofheroesapi.entity.Hero;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Component
@Getter
@Setter
public class MockDb {
    private AtomicLong counter;

    private List<Hero> heroes = Arrays.asList(
//            new Hero(counter.incrementAndGet(), "Dr Nice"),
//            new Hero(counter.incrementAndGet(), "Narco"),
//            new Hero(counter.incrementAndGet(), "Bombasto"),
//            new Hero(counter.incrementAndGet(), "Celeritas"),
//            new Hero(counter.incrementAndGet(), "RubberMan"),
//            new Hero(counter.incrementAndGet(), "Dynama"),
//            new Hero(counter.incrementAndGet(), "Dr IQ"),
//            new Hero(counter.incrementAndGet(), "Magma"),
//            new Hero(counter.incrementAndGet(), "Tornado")

            new Hero(1L, "Dr Nice"),
            new Hero(2L, "Narco"),
            new Hero(3L, "Bombasto"),
            new Hero(4L, "Celeritas"),
            new Hero(5L, "RubberMan"),
            new Hero(6L, "Dynama"),
            new Hero(7L, "Dr IQ"),
            new Hero(8L, "Magma"),
            new Hero(9L, "Tornado")
    );

    public MockDb(AtomicLong counterBean) {
        this.counter = counterBean;
    }
}
