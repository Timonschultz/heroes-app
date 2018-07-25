package nl.timonschultz.heroes.heroesapp.core;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class Greeting {

    private Long id;
    private final String name;

    public Greeting(String name) {
        this.name = name;
    }

    public String createGreeting() {
        return "hello " + name + ". My greetings to a mighty hero!";
    }

}