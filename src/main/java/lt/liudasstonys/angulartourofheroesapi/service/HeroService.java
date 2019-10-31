package lt.liudasstonys.angulartourofheroesapi.service;

import lt.liudasstonys.angulartourofheroesapi.dto.HeroDto;
import lt.liudasstonys.angulartourofheroesapi.entity.Hero;

import java.util.List;

public interface HeroService {
    List<Hero> getAllHeroes();

    Hero getHeroById(Long id);

    Hero addHero(HeroDto heroDto);
}
