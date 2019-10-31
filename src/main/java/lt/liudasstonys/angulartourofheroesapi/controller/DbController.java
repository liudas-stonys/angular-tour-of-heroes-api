package lt.liudasstonys.angulartourofheroesapi.controller;

import lt.liudasstonys.angulartourofheroesapi.dto.HeroDto;
import lt.liudasstonys.angulartourofheroesapi.entity.Hero;
import lt.liudasstonys.angulartourofheroesapi.service.HeroService;
import org.springframework.web.bind.annotation.*;

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
    public Hero getHeroById(@PathVariable Long id) {
        return heroService.getHeroById(id);
    }

    @PostMapping("api/heroes")
    public Hero addHero(@RequestBody HeroDto hero) {
        return heroService.addHero(hero);
    }

    //    @PostMapping("api/heroes")
//    public Hero addHero(@RequestBody String body) {
//        App.logger.info("POST is working.");
//        App.logger.info(body);
////        return heroService.addHero(hero);
//        return null;
//    }
}
