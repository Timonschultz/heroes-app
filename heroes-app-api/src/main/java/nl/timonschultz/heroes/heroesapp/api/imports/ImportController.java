package nl.timonschultz.heroes.heroesapp.api.imports;

import lombok.AllArgsConstructor;
import nl.timonschultz.heroes.heroesapp.core.heroes.service.HeroService;
import nl.timonschultz.heroes.heroesapp.core.icon.service.IconService;
import nl.timonschultz.heroes.heroesapp.core.map.service.MapService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/import")
public class ImportController {

    private HeroService heroService;
    private MapService mapService;
    private IconService iconService;

    @RequestMapping(value = "/heroes")
    public void importHeroes() {
        heroService.importHeroes();
    }

    @RequestMapping(value = "/maps")
    public void importMaps() {
        mapService.importMaps();
    }

//    @RequestMapping(value = "/icons/{identifier}")
//    public void importIcons(@PathVariable("identifier") String identifier) {
//        iconService.importIcons(identifier);
//    }

    @RequestMapping(value = "/icons/all")
    public void importIconsAll() {
        iconService.importIcons();
    }

    @RequestMapping(value = "/test")
    public String importIcons() {
        iconService.getImageAndSave("http://s3.hotsapi.net/img/talents/64x64/storm_ui_icon_lili_healingbrew.png", 1L);
        return "test";
    }

    //TODO fix it
    @RequestMapping(value = "/testIcon", produces = "image/jpg")
    public byte[] getIcons() {
        return iconService.getImage(1L);
    }
}