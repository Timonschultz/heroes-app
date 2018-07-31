package nl.timonschultz.heroes.heroesapp.api.heroes.controller;

import lombok.AllArgsConstructor;
import nl.timonschultz.heroes.heroesapp.core.heroes.mapper.HeroModelMapper;
import nl.timonschultz.heroes.heroesapp.core.heroes.model.HeroServiceModel;
import nl.timonschultz.heroes.heroesapp.core.heroes.service.HeroService;
import nl.timonschultz.heroes.heroesapp.persistence.heroes.HeroNameAndId;
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
	private final HeroModelMapper heroModelMapper;
	
	@GetMapping
	public List<HeroNameAndId> getHeroNames() {
		return heroService.getHeroNames();
	}
	
		@GetMapping("/id/{id}")
		public HeroServiceModel getHero(@PathVariable("id") Long id) {
			return heroService.getHero(id);
		}
}
