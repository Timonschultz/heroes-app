package nl.timonschultz.heroes.heroesapp.persistence.icon;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IconEntityRepository extends JpaRepository<TalentIconEntity, Long> {
}
