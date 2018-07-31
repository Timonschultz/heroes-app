package nl.timonschultz.heroes.heroesapp.persistence.heroes;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import nl.timonschultz.heroes.heroesapp.persistence.abilities.AbilityEntity;
import nl.timonschultz.heroes.heroesapp.persistence.common.HasId;
import nl.timonschultz.heroes.heroesapp.persistence.icon.HeroIconEntity;
import nl.timonschultz.heroes.heroesapp.persistence.talent.TalentEntity;
import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.List;

@Getter
@Builder
@Entity(name = "HEROES")
@AllArgsConstructor
@NoArgsConstructor
public class HeroEntity extends HasId<Long> {
	
	private String name;
	private String shortName;
	private String attributeId;
	
	@ElementCollection private List<String> translations;
	
	@OneToOne(cascade = CascadeType.ALL) private HeroIconEntity icon;
	
	private String role;
	private String type;
	private String releaseDate;
	
	@OneToMany(cascade = CascadeType.ALL) private List<AbilityEntity> abilities;
	
	@OneToMany(cascade = CascadeType.ALL) private List<TalentEntity> talents;
}
