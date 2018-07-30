package nl.timonschultz.heroes.heroesapp.core.heroes.mapper;

import lombok.RequiredArgsConstructor;
import nl.timonschultz.heroes.heroesapp.core.abilities.mapper.AbilityModelMapper;
import nl.timonschultz.heroes.heroesapp.core.heroes.model.HeroInputModel;
import nl.timonschultz.heroes.heroesapp.core.heroes.model.HeroNameModel;
import nl.timonschultz.heroes.heroesapp.core.icon.mapper.IconModelMapper;
import nl.timonschultz.heroes.heroesapp.core.talent.mapper.TalentModelMapper;
import nl.timonschultz.heroes.heroesapp.persistence.heroes.HeroEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@RequiredArgsConstructor
public class HeroModelMapper {

    private final IconModelMapper iconModelMapper;
    private final AbilityModelMapper abilityModelMapper;
    private final TalentModelMapper talentModelMapper;

    public HeroEntity toEntity(HeroInputModel heroInputModel) {
        return HeroEntity.builder().name(heroInputModel.getName())
                .shortName(heroInputModel.getShortName())
                .attributeId(heroInputModel.getAttributeId())
                .translations(heroInputModel.getTranslations())
                .icon(iconModelMapper.toEntity(heroInputModel.getIconUrl()))
                .role(heroInputModel.getRole())
                .type(heroInputModel.getType())
                .releaseDate(heroInputModel.getReleaseDate())
                .abilities(abilityModelMapper.toEntityList(heroInputModel.getAbilities()))
                .talents(talentModelMapper.toEntityList(heroInputModel.getTalents()))
                .build();
    }

    public List<HeroNameModel> toHeroNameList(List<HeroEntity> heroEntities) {
        List<HeroNameModel> heroNameModelList = new ArrayList<>();
        heroEntities.forEach(heroEntity -> heroNameModelList.add(getHeroNameModel(heroEntity)));
        return heroNameModelList;
    }

    private HeroNameModel getHeroNameModel(HeroEntity heroEntity) {
        return HeroNameModel.builder().id(heroEntity.getId()).name(heroEntity.getName()).build();
    }

}