package nl.timonschultz.heroes.heroesapp.persistence.abilities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import nl.timonschultz.heroes.heroesapp.persistence.common.HasId;
import javax.persistence.Column;
import javax.persistence.Entity;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "ABILITIES")
public class AbilityEntity extends HasId<Long> {

    private String owner;
    private String name;
    private String title;
    @Column(columnDefinition = "TEXT")
    private String description;
    private String icon;
    private String hotkey;
    private int cooldown;
    private int manaCost;
    private Boolean trait;

}
