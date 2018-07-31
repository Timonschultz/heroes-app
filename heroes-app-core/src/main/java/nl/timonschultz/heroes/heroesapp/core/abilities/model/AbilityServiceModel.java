package nl.timonschultz.heroes.heroesapp.core.abilities.model;

import lombok.Builder;

public class AbilityServiceModel extends AbilityModel {
	
	private Long id;
	
	@Builder
	public AbilityServiceModel(String owner, String name, String title, String description, String icon, String hotkey, int cooldown, int manaCost, Boolean trait, Long id) {
		super(owner, name, title, description, icon, hotkey, cooldown, manaCost, trait);
		this.id = id;
	}
}
