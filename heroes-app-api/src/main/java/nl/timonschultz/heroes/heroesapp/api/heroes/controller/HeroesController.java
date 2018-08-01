package nl.timonschultz.heroes.heroesapp.api.heroes.controller;

import lombok.AllArgsConstructor;
import nl.timonschultz.heroes.heroesapp.core.heroes.model.HeroServiceModel;
import nl.timonschultz.heroes.heroesapp.core.heroes.service.HeroService;
import nl.timonschultz.heroes.heroesapp.persistence.heroes.HeroNameAndIdAndShortName;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/heroes")
public class HeroesController {
	
	private final HeroService heroService;
	
	@GetMapping
	public List<HeroNameAndIdAndShortName> getHeroNames() {
		return heroService.getHeroNames();
	}
	
	@GetMapping("/{identifier}")
	public HeroServiceModel getHero(@PathVariable("identifier") String identifier) {
		return heroService.getHero(identifier);
	}
}