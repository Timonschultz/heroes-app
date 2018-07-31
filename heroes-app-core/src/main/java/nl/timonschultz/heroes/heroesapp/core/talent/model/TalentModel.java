package nl.timonschultz.heroes.heroesapp.core.talent.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
abstract class TalentModel {
	
	private String name;
	private String title;
	private String description;
	private String icon;
	private String ability;
	private int sort;
	private int cooldown;
	private int manaCost;
	private int level;
	
}
