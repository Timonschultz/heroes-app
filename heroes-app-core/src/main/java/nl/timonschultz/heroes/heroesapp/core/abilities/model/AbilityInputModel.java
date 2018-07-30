package nl.timonschultz.heroes.heroesapp.core.abilities.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class AbilityInputModel {

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