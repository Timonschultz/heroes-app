package nl.timonschultz.heroes.heroesapp.persistence.heroes;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import nl.timonschultz.heroes.heroesapp.persistence.abilities.AbilityEntity;
import nl.timonschultz.heroes.heroesapp.persistence.common.HasId;
import nl.timonschultz.heroes.heroesapp.persistence.icon.IconEntity;
import nl.timonschultz.heroes.heroesapp.persistence.talent.TalentEntity;

import javax.persistence.*;
import java.util.List;

@Entity(name = "HEROES")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder
public class HeroEntity extends HasId<Long> {

    private String name;
    private String shortName;
    private String attributeId;

    @ElementCollection
    private List<String> translations;

    @OneToOne
    private IconEntity icon;

    private String role;
    private String type;
    private String releaseDate;

    @OneToMany(mappedBy = "id", cascade = {CascadeType.PERSIST})
    private List<AbilityEntity> abilities;

    @OneToMany(mappedBy = "id", cascade = CascadeType.ALL)
    private List<TalentEntity> talents;

}
