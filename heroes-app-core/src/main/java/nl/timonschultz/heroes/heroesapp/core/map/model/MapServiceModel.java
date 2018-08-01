package nl.timonschultz.heroes.heroesapp.core.map.model;

import lombok.Builder;
import lombok.Getter;
import java.util.List;

public class MapServiceModel extends MapModel {
	
	@Getter private Long id;
	
	@Builder
	public MapServiceModel(String name, List<String> translations, Long id) {
		super(name, translations);
		this.id = id;
	}
}