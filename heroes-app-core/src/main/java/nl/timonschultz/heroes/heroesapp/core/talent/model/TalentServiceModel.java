package nl.timonschultz.heroes.heroesapp.core.talent.model;

import lombok.Builder;
import lombok.Getter;
import nl.timonschultz.heroes.heroesapp.core.icon.model.TalentIconServiceModel;

@Getter
public class TalentServiceModel extends TalentModel {
	
	private Long id;
	private TalentIconServiceModel iconUrl;
	
	@Builder
	public TalentServiceModel(String name, String title, String description, String icon, TalentIconServiceModel iconUrl, String ability, int sort, int cooldown, int manaCost, int level, Long id) {
		super(name, title, description, icon, ability, sort, cooldown, manaCost, level);
		this.id = id;
		this.iconUrl = iconUrl;
	}
}
