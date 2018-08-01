package nl.timonschultz.heroes.heroesapp.persistence.map;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import nl.timonschultz.heroes.heroesapp.persistence.common.HasId;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import java.util.List;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "MAPS")
public class MapEntity extends HasId<Long> {
	
	private String name;
	
	@ElementCollection private List<String> translations;
}
