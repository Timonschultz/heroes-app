package nl.timonschultz.heroes.heroesapp.core.talent.model;

import lombok.Builder;
import nl.timonschultz.heroes.heroesapp.core.icon.model.TalentIconModel;

public class TalentInputModel extends TalentModel {
	
	@Builder
	public TalentInputModel(String name, String title, String description, String icon, TalentIconModel iconUrl, String ability, int sort, int cooldown, int manaCost, int level) {
		super(name, title, description, icon, iconUrl, ability, sort, cooldown, manaCost, level);
	}
}