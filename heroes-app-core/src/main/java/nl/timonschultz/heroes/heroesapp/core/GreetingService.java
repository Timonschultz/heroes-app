package nl.timonschultz.heroes.heroesapp.core;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    public GreetingService() {
    }

    public Greeting createGreeting(String name) {
        return new Greeting(name);
    }

}