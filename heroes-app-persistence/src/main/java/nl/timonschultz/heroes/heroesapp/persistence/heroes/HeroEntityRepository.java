package nl.timonschultz.heroes.heroesapp.persistence.heroes;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface HeroEntityRepository extends JpaRepository<HeroEntity, Long> {
	
	@Query("select s.id as id, s.name as name from HEROES s")
	List<HeroNameAndId> getIdAndName();
}