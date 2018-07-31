package nl.timonschultz.heroes.heroesapp.core.icon.mapper;

import nl.timonschultz.heroes.heroesapp.core.icon.model.HeroIconInputModel;
import nl.timonschultz.heroes.heroesapp.core.icon.model.HeroIconServiceModel;
import nl.timonschultz.heroes.heroesapp.core.icon.model.TalentIconInputModel;
import nl.timonschultz.heroes.heroesapp.core.icon.model.TalentIconServiceModel;
import nl.timonschultz.heroes.heroesapp.persistence.icon.HeroIconEntity;
import nl.timonschultz.heroes.heroesapp.persistence.icon.TalentIconEntity;
import org.springframework.stereotype.Component;

@Component
public class IconModelMapper {
	
	public HeroIconEntity toEntity(HeroIconInputModel heroIconInputModel) {
		return HeroIconEntity.builder().icon(heroIconInputModel.getIcon()).build();
	}
	
	public TalentIconEntity toEntity(TalentIconInputModel talentIconInputModel) {
		return TalentIconEntity.builder().icon(talentIconInputModel.getIcon()).build();
	}
	
	public HeroIconServiceModel toServiceModel(HeroIconEntity heroIconEntity) {
		return HeroIconServiceModel.builder().icon(heroIconEntity.getIcon()).build();
	}
	
	public TalentIconServiceModel toServiceModel(TalentIconEntity talentIconEntity) {
		return TalentIconServiceModel.builder().icon(talentIconEntity.getIcon()).build();
	}
}