package nl.timonschultz.heroes.heroesapp.api.heroes.controller;

import lombok.AllArgsConstructor;
import nl.timonschultz.heroes.heroesapp.core.heroes.mapper.HeroModelMapper;
import nl.timonschultz.heroes.heroesapp.core.heroes.service.HeroService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/heroes")
public class HeroesController {

    private final HeroService heroService;
    private final HeroModelMapper heroModelMapper;

    @GetMapping
    public void getHeroNames() {
        heroService.getHeroNames();
    }

}
