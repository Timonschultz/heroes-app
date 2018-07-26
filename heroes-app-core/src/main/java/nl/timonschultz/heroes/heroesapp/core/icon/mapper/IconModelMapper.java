package nl.timonschultz.heroes.heroesapp.core.icon.mapper;

import nl.timonschultz.heroes.heroesapp.core.icon.model.IconModel;
import nl.timonschultz.heroes.heroesapp.persistence.icon.IconEntity;
import org.springframework.stereotype.Component;

@Component
public class IconModelMapper {

    public IconEntity toEntity(IconModel iconModel) {
        return IconEntity.builder().icon(iconModel.getIcon()).build();
    }

}