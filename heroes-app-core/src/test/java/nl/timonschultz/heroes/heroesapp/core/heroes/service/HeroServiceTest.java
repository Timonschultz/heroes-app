package nl.timonschultz.heroes.heroesapp.core.heroes.service;

import nl.timonschultz.heroes.heroesapp.core.heroes.mapper.HeroModelMapper;
import nl.timonschultz.heroes.heroesapp.persistence.heroes.HeroEntityRepository;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class HeroServiceTest {

    @Mock
    private HeroEntityRepository heroEntityRepository;
    @Mock
    private HeroModelMapper heroModelMapper;
    @InjectMocks
    private HeroService heroService;


//    @Test
//    public void getAllNames() {
//        List<String[]> list = heroEntityRepository.getIdAndName();
//        System.out.println(list);
//    }

}