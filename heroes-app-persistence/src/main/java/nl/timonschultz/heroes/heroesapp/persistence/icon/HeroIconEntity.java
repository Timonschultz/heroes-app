package nl.timonschultz.heroes.heroesapp.persistence.icon;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import nl.timonschultz.heroes.heroesapp.persistence.common.HasId;
import javax.persistence.Basic;
import javax.persistence.Entity;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "HERO_ICON")
public class HeroIconEntity extends HasId<Long> {
	
	private String icon;
	
	@Basic
	@Setter
	private byte[] iconImage;
}



