package nl.timonschultz.heroes.heroesapp.core;

import lombok.RequiredArgsConstructor;
import nl.timonschultz.heroes.heroesapp.persistence.GreetingRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GreetingService {

    private final GreetingRepository greetingRepository;
    private final GreetingMapper greetingMapper;

    public void addGreeting(String name) {
        Greeting greetz = new Greeting(name);
        greetingRepository.save(greetingMapper.toEntity(greetz));
    }

    public Greeting getGreeting(Long id) {
        return greetingMapper.toGreeting(greetingRepository.findById(id).get());
    }

    public String getGreeted(Long id) {
        return getGreeting(id).createGreeting();
    }
}