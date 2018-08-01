package nl.timonschultz.heroes.heroesapp.core.heroes.mapper;

import lombok.RequiredArgsConstructor;
import nl.timonschultz.heroes.heroesapp.core.abilities.mapper.AbilityModelMapper;
import nl.timonschultz.heroes.heroesapp.core.heroes.model.HeroInputModel;
import nl.timonschultz.heroes.heroesapp.core.heroes.model.HeroServiceModel;
import nl.timonschultz.heroes.heroesapp.core.icon.mapper.IconModelMapper;
import nl.timonschultz.heroes.heroesapp.core.talent.mapper.TalentModelMapper;
import nl.timonschultz.heroes.heroesapp.persistence.heroes.HeroEntity;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class HeroModelMapper {
	
	private final IconModelMapper iconModelMapper;
	private final AbilityModelMapper abilityModelMapper;
	private final TalentModelMapper talentModelMapper;
	
	public HeroEntity toEntity(HeroInputModel heroInputModel) {
		return HeroEntity.builder().name(heroInputModel.getName()).shortName(heroInputModel.getShortName())
		                 .attributeId(heroInputModel.getAttributeId()).translations(heroInputModel.getTranslations())
		                 .icon(iconModelMapper.toEntity(heroInputModel.getIconUrl())).role(heroInputModel.getRole())
		                 .type(heroInputModel.getType()).releaseDate(heroInputModel.getReleaseDate())
		                 .abilities(abilityModelMapper.toEntityList(heroInputModel.getAbilities()))
		                 .talents(talentModelMapper.toEntityList(heroInputModel.getTalents())).build();
	}
	
	//TODO: use Optionals
	public HeroServiceModel toServiceModel(HeroEntity heroEntity) {
		return HeroServiceModel.builder().id(heroEntity.getId()).name(heroEntity.getName())
		                       .shortName(heroEntity.getShortName()).attributeId(heroEntity.getAttributeId())
		                       .translations(heroEntity.getTranslations())
		                       .iconUrl(iconModelMapper.toServiceModel(heroEntity.getIcon())).role(heroEntity.getRole())
		                       .type(heroEntity.getType()).releaseDate(heroEntity.getReleaseDate())
		                       .abilities(abilityModelMapper.toServiceModelList(heroEntity.getAbilities()))
		                       .talents(talentModelMapper.toServiceModelList(heroEntity.getTalents())).build();
	}
}