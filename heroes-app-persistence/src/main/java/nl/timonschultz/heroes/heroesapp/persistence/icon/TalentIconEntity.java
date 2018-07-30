package nl.timonschultz.heroes.heroesapp.persistence.icon;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import nl.timonschultz.heroes.heroesapp.persistence.common.HasId;

import javax.persistence.Entity;

@Getter
@Builder
@AllArgsConstructor
@Entity(name = "TALENT_ICON")
public class TalentIconEntity extends HasId<Long> {

    String icon;
}
