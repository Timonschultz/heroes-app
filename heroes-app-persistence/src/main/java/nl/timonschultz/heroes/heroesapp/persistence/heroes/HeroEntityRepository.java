package nl.timonschultz.heroes.heroesapp.persistence.heroes;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface HeroEntityRepository extends JpaRepository<HeroEntity, Long> {
	
	@Query("select s.id as id, s.name as name, s.shortName as shortName from HEROES s")
	List<HeroNameAndIdAndShortName> getIdAndName();
	
	@Query("select t from HEROES t where t.id = :id")
	HeroEntity find(@Param("id") Long id);
	
	@Query("select t from HEROES t where t.shortName = :shortName")
	HeroEntity find(@Param("shortName") String shortName);
}