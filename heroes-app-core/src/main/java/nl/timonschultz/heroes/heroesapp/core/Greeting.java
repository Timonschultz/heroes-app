package nl.timonschultz.heroes.heroesapp.core;

public class Greeting {

    private final String name;

    public Greeting(String name) {
        this.name = name;
    }

    public String createGreeting() {
        return "hello " + name + ", greetings";
    }

    public String getName() {
        return name;
    }
}