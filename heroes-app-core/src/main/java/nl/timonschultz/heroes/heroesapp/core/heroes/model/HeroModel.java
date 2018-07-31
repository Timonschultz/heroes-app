package nl.timonschultz.heroes.heroesapp.core.heroes.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import nl.timonschultz.heroes.heroesapp.core.icon.model.HeroIconModel;
import java.util.List;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public abstract class HeroModel {
	
	protected String name;
	protected String shortName;
	protected String attributeId;
	protected List<String> translations;
	protected HeroIconModel iconUrl;
	protected String role;
	protected String type;
	protected String releaseDate;
}
