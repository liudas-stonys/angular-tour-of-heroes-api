package lt.liudasstonys.angulartourofheroesapi.mockdb;

import lt.liudasstonys.angulartourofheroesapi.App;
import lt.liudasstonys.angulartourofheroesapi.entity.Hero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import lombok.Getter;
import lombok.Setter;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Component
@Getter
@Setter
public class MockDb {
    //private AtomicLong counter = App.getCtx().getBean(AtomicLong.class);

    private AtomicLong counter;
    private List<Hero> heroes;

    public MockDb(AtomicLong counter) {
        this.counter = counter;
    }

    // https://stackoverflow.com/questions/1005073/initialization-of-an-arraylist-in-one-line
    // JDK 8 - List<String> list = Stream.of("one", "two", "three").collect(Collectors.toList());

    @PostConstruct
    private void postConstruct() {
        this.heroes = new ArrayList<>(List.of(
                new Hero(counter.incrementAndGet(), "Dr Nice"),
                new Hero(counter.incrementAndGet(), "Narco"),
                new Hero(counter.incrementAndGet(), "Bombasto"),
                new Hero(counter.incrementAndGet(), "Celeritas"),
                new Hero(counter.incrementAndGet(), "RubberMan"),
                new Hero(counter.incrementAndGet(), "Dynama"),
                new Hero(counter.incrementAndGet(), "Dr IQ"),
                new Hero(counter.incrementAndGet(), "Magma"),
                new Hero(counter.incrementAndGet(), "Tornado")
        ));
    }

    // TODO: addHero() ???
}
