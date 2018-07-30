package nl.timonschultz.heroes.heroesapp.core.heroes.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import nl.timonschultz.heroes.heroesapp.core.abilities.model.AbilityInputModel;
import nl.timonschultz.heroes.heroesapp.core.icon.model.HeroIconModel;
import nl.timonschultz.heroes.heroesapp.core.talent.model.TalentInputModel;

import java.util.List;

@Getter
@AllArgsConstructor
public class HeroInputModel {

    private String name;
    private String shortName;
    private String attributeId;
    private List<String> translations;
    private HeroIconModel iconUrl;
    private String role;
    private String type;
    private String releaseDate;
    private List<AbilityInputModel> abilities;
    private List<TalentInputModel> talents;

}