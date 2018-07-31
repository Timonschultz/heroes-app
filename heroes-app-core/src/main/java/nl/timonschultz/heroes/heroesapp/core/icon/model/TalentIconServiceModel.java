package nl.timonschultz.heroes.heroesapp.core.icon.model;

import lombok.Builder;
import lombok.Getter;

@Getter
public class TalentIconServiceModel extends TalentIconModel{
	
	Long id;
	String icon;
	
	@Builder
	public TalentIconServiceModel(Long id, String icon) {
		this.id = id;
		this.icon = icon;
	}
}
