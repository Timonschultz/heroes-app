package nl.timonschultz.heroes.heroesapp.core.heroes.model;

import lombok.Builder;
import lombok.Getter;
import nl.timonschultz.heroes.heroesapp.core.abilities.model.AbilityInputModel;
import nl.timonschultz.heroes.heroesapp.core.icon.model.HeroIconInputModel;
import nl.timonschultz.heroes.heroesapp.core.talent.model.TalentInputModel;
import java.util.List;

@Getter
public class HeroInputModel extends HeroModel {
	
	private List<AbilityInputModel> abilities;
	private List<TalentInputModel> talents;
	private HeroIconInputModel iconUrl;
	
	@Builder
	public HeroInputModel(String name, String shortName, String attributeId, List<String> translations, HeroIconInputModel iconUrl, String role, String type, String releaseDate, List<AbilityInputModel> abilities, List<TalentInputModel> talents) {
		super(name, shortName, attributeId, translations, role, type, releaseDate);
		this.abilities = abilities;
		this.talents = talents;
		this.iconUrl = iconUrl;
	}
}