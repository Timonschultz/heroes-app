package nl.timonschultz.heroes.heroesapp.core.heroes.model;

import lombok.Builder;
import lombok.Getter;
import nl.timonschultz.heroes.heroesapp.core.abilities.model.AbilityServiceModel;
import nl.timonschultz.heroes.heroesapp.core.icon.model.HeroIconServiceModel;
import nl.timonschultz.heroes.heroesapp.core.talent.model.TalentServiceModel;
import java.util.List;

@Getter
public class HeroServiceModel extends HeroModel {
	
	private Long id;
	private List<AbilityServiceModel> abilities;
	private List<TalentServiceModel> talents;
	private HeroIconServiceModel iconUrl;
	
	@Builder
	public HeroServiceModel(String name, String shortName, String attributeId, List<String> translations, HeroIconServiceModel iconUrl, String role, String type, String releaseDate, Long id, List<AbilityServiceModel> abilities, List<TalentServiceModel> talents) {
		super(name, shortName, attributeId, translations, role, type, releaseDate);
		this.id = id;
		this.abilities = abilities;
		this.talents = talents;
		this.iconUrl = iconUrl;
	}
}
