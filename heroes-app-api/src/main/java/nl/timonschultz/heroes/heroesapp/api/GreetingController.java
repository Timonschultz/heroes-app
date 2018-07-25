package nl.timonschultz.heroes.heroesapp.api;

import lombok.AllArgsConstructor;
import nl.timonschultz.heroes.heroesapp.core.Greeting;
import nl.timonschultz.heroes.heroesapp.core.GreetingService;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/greetings")
public class GreetingController {

    private GreetingService greetingService;

    @GetMapping(value = "/{id}")
    public Greeting getGreeted(@PathVariable("id") final Long id) {
        return greetingService.getGreeted(id);
    }

    @PostMapping
    public void saveGreeting(@RequestParam("name") final String name) {
        greetingService.addGreeting(name);
    }

}
