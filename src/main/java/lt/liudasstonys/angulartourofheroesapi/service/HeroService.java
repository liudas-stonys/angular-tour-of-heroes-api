package lt.liudasstonys.angulartourofheroesapi.service;

import lt.liudasstonys.angulartourofheroesapi.dto.HeroDto;
import lt.liudasstonys.angulartourofheroesapi.entity.Hero;

import java.util.List;

public interface HeroService {
    List<Hero> getAllHeroes();

    Hero getHeroById(Long heroId);

    Hero addHero(HeroDto heroDto);

    Hero updateHero(Hero hero);

    Hero deleteHero(Long heroId);

    List<Hero> searchAllHeroes(String name);
}
