package nl.timonschultz.heroes.heroesapp.core.map.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import java.util.List;

@Getter
@AllArgsConstructor
@NoArgsConstructor
abstract class MapModel {
	
	private String name;
	private List<String> translations;
}
