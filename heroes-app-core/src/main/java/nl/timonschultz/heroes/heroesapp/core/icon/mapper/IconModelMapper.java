package nl.timonschultz.heroes.heroesapp.core.icon.mapper;

import nl.timonschultz.heroes.heroesapp.core.icon.model.HeroIconModel;
import nl.timonschultz.heroes.heroesapp.core.icon.model.TalentIconModel;
import nl.timonschultz.heroes.heroesapp.persistence.icon.HeroIconEntity;
import nl.timonschultz.heroes.heroesapp.persistence.icon.TalentIconEntity;
import org.springframework.stereotype.Component;

@Component
public class IconModelMapper {

    public HeroIconEntity toEntity(HeroIconModel heroIconModel) {
        return HeroIconEntity.builder().icon(heroIconModel.getIcon()).build();
    }

    public TalentIconEntity toEntity(TalentIconModel talentIconModel) {
        return TalentIconEntity.builder().icon(talentIconModel.getIcon()).build();
    }

}