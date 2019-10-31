package lt.liudasstonys.angulartourofheroesapi.service;

import lt.liudasstonys.angulartourofheroesapi.App;
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
    public Hero getHeroById(Long id) {
        return db.getHeroes().get(id.intValue() - 1);
    }

    @Override
    public Hero addHero(HeroDto heroDto) {
        Hero hero = new Hero((long) (db.getHeroes().size() + 1), heroDto.getName());
        App.logger.info(hero.toString());

        List<Hero> heroes = new ArrayList<>(db.getHeroes());
        heroes.forEach(aHero -> App.logger.info(aHero.toString()));
        heroes.add(hero);
        db.setHeroes(heroes);

        return hero;
    }
}
