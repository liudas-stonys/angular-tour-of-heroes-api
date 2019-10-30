package lt.liudasstonys.angulartourofheroesapi.service;

import lt.liudasstonys.angulartourofheroesapi.entity.Hero;
import lt.liudasstonys.angulartourofheroesapi.mockdb.MockDb;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HeroServiceImpl implements HeroService {
    @Override
    public List<Hero> getAllHeroes() {
        return MockDb.heroes;
    }

    @Override
    public Hero getHeroById(Long id) {
        return MockDb.heroes.get(id.intValue());
    }
}
