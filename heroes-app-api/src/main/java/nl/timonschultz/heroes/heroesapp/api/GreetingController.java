package nl.timonschultz.heroes.heroesapp.api;

import nl.timonschultz.heroes.heroesapp.core.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/greetings")
public class GreetingController {

    @Autowired
    private GreetingService greetingService;

    @GetMapping(value = "/{name}")
    public String getGreeted(@PathVariable("name") final String name) {
        return greetingService.createGreeting(name).createGreeting();
    }

}
