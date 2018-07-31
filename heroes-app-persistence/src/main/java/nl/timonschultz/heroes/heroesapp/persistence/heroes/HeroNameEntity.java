package nl.timonschultz.heroes.heroesapp.persistence.heroes;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class HeroNameEntity {
	
	Long id;
	String name;
}
