package nl.timonschultz.heroes.heroesapp.core.map.mapper;

import nl.timonschultz.heroes.heroesapp.core.map.model.MapInputModel;
import nl.timonschultz.heroes.heroesapp.persistence.map.MapEntity;
import org.springframework.stereotype.Component;

@Component
public class MapModelMapper {

    public MapEntity toEntity(MapInputModel model) {
        return MapEntity.builder().name(model.getName()).translations(model.getTranslations()).build();
    }

}
