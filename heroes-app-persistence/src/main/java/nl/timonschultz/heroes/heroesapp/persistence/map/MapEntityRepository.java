package nl.timonschultz.heroes.heroesapp.persistence.map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface MapEntityRepository extends JpaRepository<MapEntity, Long> {
	
	@Query("select s.id as id, s.name as name from MAPS s")
	List<MapNameAndId> getIdAndName();
	
	@Query("select t from MAPS t where t.id = :id")
	MapEntity find(@Param("id") Long id);
}
