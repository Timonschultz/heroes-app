package nl.timonschultz.heroes.heroesapp.core.talent.model;

import lombok.Builder;
import lombok.Getter;
import nl.timonschultz.heroes.heroesapp.core.icon.model.TalentIconInputModel;

public class TalentInputModel extends TalentModel {
	
	@Getter
	private TalentIconInputModel iconUrl;
	
	@Builder
	public TalentInputModel(String name, String title, String description, String icon, TalentIconInputModel iconUrl, String ability, int sort, int cooldown, int manaCost, int level) {
		super(name, title, description, icon, ability, sort, cooldown, manaCost, level);
		this.iconUrl = iconUrl;
	}
}