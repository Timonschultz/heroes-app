package nl.timonschultz.heroes.heroesapp.persistence.heroes;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;
import java.util.Map;

@Repository
public interface HeroEntityRepository extends JpaRepository<HeroEntity, Long> {

    @Query("select p.name from HeroEntity p")
    List<String> getAllNames();

}
