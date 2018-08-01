package nl.timonschultz.heroes.heroesapp.persistence.icon;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TalentIconEntityRepository extends JpaRepository<TalentIconEntity, Long> {
	
	@Query("SELECT coalesce(max(ch.id), 0) FROM HERO_ICON ch")
	Long getMaxId();
}
