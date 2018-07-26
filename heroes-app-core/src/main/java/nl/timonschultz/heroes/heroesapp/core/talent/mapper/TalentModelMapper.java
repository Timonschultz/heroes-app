package nl.timonschultz.heroes.heroesapp.core.talent.mapper;

import lombok.RequiredArgsConstructor;
import nl.timonschultz.heroes.heroesapp.core.icon.mapper.IconModelMapper;
import nl.timonschultz.heroes.heroesapp.core.talent.model.TalentInputModel;
import nl.timonschultz.heroes.heroesapp.persistence.talent.TalentEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class TalentModelMapper {

    private final IconModelMapper iconModelMapper;

    public TalentEntity toEntity(TalentInputModel talentInputModel) {
        return TalentEntity.builder().name(talentInputModel.getName())
                .title(talentInputModel.getTitle())
                .description(talentInputModel.getDescription())
                .icon(talentInputModel.getIcon())
                .iconUrl(iconModelMapper.toEntity(talentInputModel.getIconModel()))
                .ability(talentInputModel.getAbility())
                .sort(talentInputModel.getSort())
                .cooldown(talentInputModel.getCooldown())
                .manaCost(talentInputModel.getManaCost())
                .level(talentInputModel.getLevel())
                .build();
    }

    public List<TalentEntity> toEntityList(List<TalentInputModel> talentInputModelList) {
        return talentInputModelList.stream().map(this::toEntity).collect(Collectors.toList());
    }

}
