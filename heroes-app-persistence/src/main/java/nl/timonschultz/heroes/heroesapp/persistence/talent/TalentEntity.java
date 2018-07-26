package nl.timonschultz.heroes.heroesapp.persistence.talent;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import nl.timonschultz.heroes.heroesapp.persistence.common.HasId;
import nl.timonschultz.heroes.heroesapp.persistence.icon.IconEntity;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity(name = "TALENTS")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder
public class TalentEntity extends HasId<Long> {

    private String name;
    private String title;
    private String description;
    private String icon;

    @OneToOne
    private IconEntity iconUrl;
    private String ability;
    private int sort;
    private int cooldown;
    private int manaCost;
    private int level;

}
