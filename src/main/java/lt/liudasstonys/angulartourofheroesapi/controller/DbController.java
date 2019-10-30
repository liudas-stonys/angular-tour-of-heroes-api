package lt.liudasstonys.angulartourofheroesapi.controller;

import lt.liudasstonys.angulartourofheroesapi.entity.Hero;
import lt.liudasstonys.angulartourofheroesapi.service.HeroService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DbController {

    private HeroService heroService;

    public DbController(HeroService heroService) {
        this.heroService = heroService;
    }

    @GetMapping("api/heroes")
    public List<Hero> getAllHeroes() {
        return heroService.getAllHeroes();
    }

    @GetMapping("api/heroes/{id}")
    public Hero getAllHeroes(@PathVariable(value = "id") Long heroId) {
        return heroService.getHeroById(heroId);
    }
}
