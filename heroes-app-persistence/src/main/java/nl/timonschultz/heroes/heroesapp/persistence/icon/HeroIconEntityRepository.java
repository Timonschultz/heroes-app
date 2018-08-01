package nl.timonschultz.heroes.heroesapp.persistence.icon;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface HeroIconEntityRepository extends JpaRepository<HeroIconEntity, Long> {
	
	@Query("SELECT coalesce(max(ch.id), 0) FROM HERO_ICON ch")
	Long getMaxId();
}
