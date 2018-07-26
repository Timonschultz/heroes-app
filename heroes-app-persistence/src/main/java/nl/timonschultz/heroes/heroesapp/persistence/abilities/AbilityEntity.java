package nl.timonschultz.heroes.heroesapp.persistence.abilities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import nl.timonschultz.heroes.heroesapp.persistence.common.HasId;

import javax.persistence.Entity;

@Entity(name = "ABILITIES")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder
public class AbilityEntity extends HasId<Long> {

    private String owner;
    private String name;
    private String title;
    private String description;
    private String icon;
    private String hotkey;
    private int cooldown;
    private int manaCost;
    private Boolean trait;

}
