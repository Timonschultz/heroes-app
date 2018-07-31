package nl.timonschultz.heroes.heroesapp.core.heroes.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import nl.timonschultz.heroes.heroesapp.core.abilities.model.AbilityInputModel;
import nl.timonschultz.heroes.heroesapp.core.icon.model.HeroIconModel;
import nl.timonschultz.heroes.heroesapp.core.talent.model.TalentInputModel;
import java.util.List;

@Getter
@Builder
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
	protected List<AbilityInputModel> abilities;
	protected List<TalentInputModel> talents;
}
