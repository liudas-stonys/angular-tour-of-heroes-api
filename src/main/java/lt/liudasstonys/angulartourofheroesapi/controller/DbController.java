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
    public Hero getHeroById(@PathVariable("id") Long heroId) {
        return heroService.getHeroById(heroId);
    }

    @PostMapping("api/heroes")
    public Hero addHero(@RequestBody HeroDto heroDto) {
        return heroService.addHero(heroDto);
    }

    @PutMapping("api/heroes")
    public Hero updateHero(@RequestBody Hero hero) {
        return heroService.updateHero(hero);
    }

    @DeleteMapping("api/heroes/{id}")
    public Hero deleteHero(@PathVariable("id") Long heroId) {
        return heroService.deleteHero(heroId);
    }

    @GetMapping("api/heroes/") // POWER SLASH :D
    public List<Hero> searchAllHeroes(@RequestParam String name) {
        return heroService.searchAllHeroes(name);
    }
}
