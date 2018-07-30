package nl.timonschultz.heroes.heroesapp.persistence.talent;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import nl.timonschultz.heroes.heroesapp.persistence.common.HasId;
import nl.timonschultz.heroes.heroesapp.persistence.icon.TalentIconEntity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;


@Getter
@Builder
@AllArgsConstructor
@Entity(name = "TALENTS")
public class TalentEntity extends HasId<Long> {

    private String name;
    private String title;

    @Column(columnDefinition = "TEXT")
    private String description;
    private String icon;

    @OneToOne(cascade = CascadeType.ALL)
    private TalentIconEntity iconUrl;
    private String ability;
    private int sort;
    private int cooldown;
    private int manaCost;
    private int level;

}
