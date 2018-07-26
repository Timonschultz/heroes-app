package nl.timonschultz.heroes.heroesapp.api.imports;

import lombok.AllArgsConstructor;
import nl.timonschultz.heroes.heroesapp.core.map.service.MapService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@AllArgsConstructor
public class ImportController {

    private MapService mapService;

//    @RequestMapping("/heroes")
//    public String index() {
//        reader.readStream(API_V1_HEROES);
//        return "Greetings from HOTS APP!";
//    }

    @RequestMapping("/maps")
    public String abilityStreamImport() {
        mapService.add();
        return "Greetings from HOTS APP!";
    }
}