package nl.timonschultz.heroes.heroesapp.core.map.model;

import lombok.Builder;
import java.util.List;

public class MapInputModel extends MapModel {
    
    @Builder
    public MapInputModel(String name, List<String> translations) {
        super(name, translations);
    }
    
}