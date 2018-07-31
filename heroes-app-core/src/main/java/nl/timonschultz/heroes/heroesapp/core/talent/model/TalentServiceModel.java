package nl.timonschultz.heroes.heroesapp.core.talent.model;

import lombok.Builder;
import lombok.Getter;
import nl.timonschultz.heroes.heroesapp.core.icon.model.TalentIconModel;

public class TalentServiceModel extends TalentModel {
	
	@Getter private Long id;
	
	@Builder
	public TalentServiceModel(String name, String title, String description, String icon, TalentIconModel iconUrl, String ability, int sort, int cooldown, int manaCost, int level, Long id) {
		super(name, title, description, icon, iconUrl, ability, sort, cooldown, manaCost, level);
		this.id = id;
	}
}
