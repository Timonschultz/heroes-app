package nl.timonschultz.heroes.heroesapp.core.abilities.model;

import lombok.Builder;
import lombok.Getter;

@Getter
public class AbilityInputModel extends AbilityModel {
	
	@Builder
	public AbilityInputModel(String owner, String name, String title, String description, String icon, String hotkey, int cooldown, int manaCost, Boolean trait) {
		super(owner, name, title, description, icon, hotkey, cooldown, manaCost, trait);
	}
}