package nl.timonschultz.heroes.heroesapp.core.icon.model;

import lombok.Builder;
import lombok.Getter;

@Getter
public class HeroIconServiceModel extends HeroIconModel {
	
	Long id;
	String icon;
	
	@Builder
	public HeroIconServiceModel(Long id, String icon) {
		this.id = id;
		this.icon = icon;
	}
}
