package lt.liudasstonys.angulartourofheroesapi.service;

import lt.liudasstonys.angulartourofheroesapi.App;
import lt.liudasstonys.angulartourofheroesapi.dto.HeroDto;
import lt.liudasstonys.angulartourofheroesapi.entity.Hero;
import lt.liudasstonys.angulartourofheroesapi.mockdb.MockDb;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class HeroServiceImpl implements HeroService {

    private AtomicLong counter;
    private MockDb db;

    public HeroServiceImpl(AtomicLong counter, MockDb db) {
        this.counter = counter;
        this.db = db;
    }

    @Override
    public List<Hero> getAllHeroes() {
        return db.getHeroes();
    }

    @Override
    public Hero getHeroById(Long id) {
        return db.getHeroes().get(id.intValue() - 1);
    }

    @Override
    public Hero addHero(HeroDto heroDto) {
        // TODO: (long) vs. new Long vs. Long.valueOf()
        // Hero hero = new Hero((long) (db.getHeroes().size() + 1), heroDto.getName());

        Hero hero = new Hero(counter.incrementAndGet(), heroDto.getName());
        db.getHeroes().add(hero);
        db.getHeroes().forEach(aHero -> App.logger.info(aHero.toString()));
        return hero;
    }
}
