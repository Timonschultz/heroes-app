package nl.timonschultz.heroes.heroesapp.core.abilities.mapper;

import nl.timonschultz.heroes.heroesapp.core.abilities.model.AbilityInputModel;
import nl.timonschultz.heroes.heroesapp.core.abilities.model.AbilityServiceModel;
import nl.timonschultz.heroes.heroesapp.persistence.abilities.AbilityEntity;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class AbilityModelMapper {
	
	public AbilityEntity toEntity(final AbilityInputModel abilityInputModel) {
		return AbilityEntity.builder().owner(abilityInputModel.getOwner()).name(abilityInputModel.getName())
		                    .title(abilityInputModel.getTitle()).description(abilityInputModel.getDescription())
		                    .icon(abilityInputModel.getIcon()).hotkey(abilityInputModel.getHotkey())
		                    .cooldown(abilityInputModel.getCooldown()).manaCost(abilityInputModel.getManaCost())
		                    .trait(abilityInputModel.getTrait()).build();
	}
	
	public List<AbilityEntity> toEntityList(final List<AbilityInputModel> abilityInputModelList) {
		return abilityInputModelList.stream().map(this::toEntity).collect(Collectors.toList());
	}
	
	public AbilityServiceModel toServiceModel(AbilityEntity abilityEntity) {
		return AbilityServiceModel.builder().id(abilityEntity.getId()).owner(abilityEntity.getOwner())
		                          .name(abilityEntity.getName()).title(abilityEntity.getTitle())
		                          .description(abilityEntity.getDescription()).icon(abilityEntity.getIcon())
		                          .hotkey(abilityEntity.getHotkey()).cooldown(abilityEntity.getCooldown())
		                          .manaCost(abilityEntity.getManaCost()).trait(abilityEntity.getTrait()).build();
	}
	
	public List<AbilityServiceModel> toServiceModelList(List<AbilityEntity> abilityEntityList) {
		return abilityEntityList.stream().map(this::toServiceModel).collect(Collectors.toList());
	}
}
