package nl.timonschultz.heroes.heroesapp.persistence.talent;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import nl.timonschultz.heroes.heroesapp.persistence.common.HasId;
import nl.timonschultz.heroes.heroesapp.persistence.icon.TalentIconEntity;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "TALENTS")
public class TalentEntity extends HasId<Long> {
	
	private String name;
	private String title;
	
	@Column(columnDefinition = "TEXT") private String description;
	private String icon;
	
	@OneToOne(cascade = CascadeType.ALL) private TalentIconEntity iconUrl;
	private String ability;
	private int sort;
	@NotNull private int cooldown;
	@NotNull private int manaCost;
	private int level;
}
