package nl.timonschultz.heroes.heroesapp.core.icon.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import nl.timonschultz.heroes.heroesapp.persistence.icon.HeroIconEntity;
import nl.timonschultz.heroes.heroesapp.persistence.icon.HeroIconEntityRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StopWatch;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import javax.persistence.EntityNotFoundException;

@Slf4j
@Service
@AllArgsConstructor
@Transactional(propagation = Propagation.REQUIRED)
public class IconService {

    private static final String NO_ICON = "No icon found for id ";

    private HeroIconEntityRepository heroIconEntityRepository;

    public void importIcons() {
        int maxHeroicons = heroIconEntityRepository.getMaxId().intValue();
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        for (long i = 1L; i <= maxHeroicons; i++) {
            getImageAndSave(getHeroIconEntity(i).getIcon(), i);
        }
        stopWatch.stop();
        log.info("Attempted import for " + maxHeroicons + " heroIcons in " + stopWatch.getTotalTimeMillis() + " milliseconds.");
    }

    public HeroIconEntity getHeroIconEntity(Long id) {
        return heroIconEntityRepository.findById(id).orElseThrow(() -> new EntityNotFoundException(NO_ICON + id));
    }

    public void getImageAndSave(String url, Long id) {
        RestTemplate restTemplate = new RestTemplate();
        try {
            byte[] imageBytes = restTemplate.getForObject(url, byte[].class);
            HeroIconEntity icon = heroIconEntityRepository.findById(id)
                    .orElseThrow(() -> new EntityNotFoundException(NO_ICON + id));
            icon.setIconImage(imageBytes);
            heroIconEntityRepository.save(icon);
        } catch (HttpClientErrorException e) {
            log.error("Error getting " + url + " for HeroIconEntity with id " + id + ": " + e.getMessage());
        }
    }

    public byte[] getImage(Long id) {
        HeroIconEntity icon = heroIconEntityRepository.findById(id).orElseThrow(() -> new EntityNotFoundException(NO_ICON + id));
        return icon.getIconImage();
    }
}
