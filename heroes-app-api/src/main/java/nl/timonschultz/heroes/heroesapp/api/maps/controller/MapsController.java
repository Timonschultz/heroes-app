package nl.timonschultz.heroes.heroesapp.api.maps.controller;

import lombok.AllArgsConstructor;
import nl.timonschultz.heroes.heroesapp.core.map.model.MapServiceModel;
import nl.timonschultz.heroes.heroesapp.core.map.service.MapService;
import nl.timonschultz.heroes.heroesapp.persistence.map.MapNameAndId;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/maps")
public class MapsController {
	
	private final MapService mapService;
	
	@GetMapping
	public List<MapNameAndId> getMapNames() {
		return mapService.getMapNames();
	}
	
	@GetMapping("/{id}")
	public MapServiceModel getMap(@PathVariable("id") Long id) {
		return mapService.getMap(id);
	}
}
