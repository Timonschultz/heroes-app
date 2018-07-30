package nl.timonschultz.heroes.heroesapp.core.heroes.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class HeroNameModel {

    String name;
    Long id;

}
