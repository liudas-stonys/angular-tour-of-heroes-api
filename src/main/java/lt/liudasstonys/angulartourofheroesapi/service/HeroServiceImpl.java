package lt.liudasstonys.angulartourofheroesapi.service;

import lt.liudasstonys.angulartourofheroesapi.dto.HeroDto;
import lt.liudasstonys.angulartourofheroesapi.entity.Hero;
import lt.liudasstonys.angulartourofheroesapi.mockdb.MockDb;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
    public Hero getHeroById(Long heroId) {
        return db.getHeroes().get(heroId.intValue() - 1);
    }

    @Override
    public Hero addHero(HeroDto heroDto) {
        // TODO: (long) vs. longValue() vs. new Long vs. Long.valueOf()
        // Hero hero = new Hero((long) (db.getHeroes().size() + 1), heroDto.getName());

        Hero hero = new Hero(counter.incrementAndGet(), heroDto.getName());
        db.getHeroes().add(hero);
        return hero;
    }

    @Override
    public Hero updateHero(Hero hero) {
        db.getHeroes().get(hero.getId().intValue()).setName(hero.getName());
        return db.getHeroes().get(hero.getId().intValue());
    }

    @Override
    public Hero deleteHero(Long heroId) {
        return db.getHeroes().remove(heroId.intValue() - 1);
    }

    @Override
    public List<Hero> searchAllHeroes(String name) {
        List<Hero> foundHeroes = new ArrayList<>();
        db.getHeroes().forEach(hero -> {
            if (hero.getName().contains(name)) {
                foundHeroes.add(hero);
            }
        });
        return foundHeroes;
    }
}
