package nl.timonschultz.heroes.heroesapp.api.imports;

import lombok.AllArgsConstructor;
import nl.timonschultz.heroes.heroesapp.core.heroes.service.HeroService;
import nl.timonschultz.heroes.heroesapp.core.map.service.MapService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@AllArgsConstructor
@RequestMapping(value = "/import")
public class ImportController {

    private HeroService heroService;
    private MapService mapService;

    @RequestMapping("/heroes")
    public void index() {
        heroService.add();
    }


    @RequestMapping("/maps")
    public void abilityStreamImport() {
        mapService.add();
    }

}