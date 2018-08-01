package nl.timonschultz.heroes.heroesapp.persistence.icon;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import nl.timonschultz.heroes.heroesapp.persistence.common.HasId;
import javax.persistence.Basic;
import javax.persistence.Entity;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "TALENT_ICON")
public class TalentIconEntity extends HasId<Long> {
	
	private String icon;
	
	@Basic private byte[] iconImage;
}
