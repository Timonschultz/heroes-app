package nl.timonschultz.heroes.heroesapp.core.icon.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import nl.timonschultz.heroes.heroesapp.persistence.icon.HeroIconEntity;
import nl.timonschultz.heroes.heroesapp.persistence.icon.HeroIconEntityRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;
import javax.persistence.EntityNotFoundException;

@Slf4j
@Service
@AllArgsConstructor
@Transactional(propagation = Propagation.REQUIRED)
public class IconService {
	
	private HeroIconEntityRepository heroIconEntityRepository;
	
	public void importIcons(String identifier) {
	
	}
	
	private void getIconUrl(Long id) {
		//		heroIconEntityRepository.findById(id).ifPresent(e -> getImageAndSave(e.getIcon(), e.getIconImageEntity().getId()));
	}
	
	public void getImageAndSave(String url, Long id) {
		RestTemplate restTemplate = new RestTemplate();
		byte[] imageBytes = restTemplate.getForObject(url, byte[].class);
		System.out.println(id);
		HeroIconEntity icon = heroIconEntityRepository.findById(id)
		                                              .orElseThrow(() -> new EntityNotFoundException());
		icon.setIconImage(imageBytes);
		heroIconEntityRepository.save(icon);
	}
	
	public byte[] getImage(Long id) {
		HeroIconEntity icon = heroIconEntityRepository.findById(id).orElseThrow(() -> new EntityNotFoundException());
		return icon.getIconImage();
	}
}
