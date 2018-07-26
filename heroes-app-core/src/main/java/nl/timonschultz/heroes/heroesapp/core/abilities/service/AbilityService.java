package nl.timonschultz.heroes.heroesapp.core.abilities.service;

import lombok.RequiredArgsConstructor;
import nl.timonschultz.heroes.heroesapp.core.abilities.mapper.AbilityModelMapper;
import nl.timonschultz.heroes.heroesapp.core.abilities.model.AbilityInputModel;
import nl.timonschultz.heroes.heroesapp.persistence.abilities.AbilityEntityRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AbilityService {

    private final AbilityModelMapper abilityModelMapper;
    private final AbilityEntityRepository abilityEntityRepository;

    public void add(final AbilityInputModel abilityInputModel) {
        abilityEntityRepository.save(abilityModelMapper.toEntity(abilityInputModel));
    }

}
