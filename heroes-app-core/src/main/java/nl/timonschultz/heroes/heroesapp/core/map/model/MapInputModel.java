package nl.timonschultz.heroes.heroesapp.core.map.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class MapInputModel {

    private String name;
    private List<String> translations;
}
