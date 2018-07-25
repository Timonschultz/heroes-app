package nl.timonschultz.heroes.heroesapp.core;

import nl.timonschultz.heroes.heroesapp.persistence.GreetingEntity;
import org.springframework.stereotype.Component;

@Component
public class GreetingMapper {

    GreetingEntity toEntity(Greeting greeting) {
        return new GreetingEntity(greeting.getName());
    }

    Greeting toGreeting(GreetingEntity greetingEntity) {
        return new Greeting(greetingEntity.getId(), greetingEntity.getName());
    }

}
