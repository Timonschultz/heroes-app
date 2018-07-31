package nl.timonschultz.heroes.heroesapp.core.heroes.service;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import nl.timonschultz.heroes.heroesapp.core.heroes.mapper.HeroModelMapper;
import nl.timonschultz.heroes.heroesapp.core.heroes.model.HeroInputModel;
import nl.timonschultz.heroes.heroesapp.persistence.heroes.HeroEntityRepository;
import nl.timonschultz.heroes.heroesapp.persistence.heroes.HeroNameAndId;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.List;

@Slf4j
@Service
@AllArgsConstructor
@Transactional(propagation = Propagation.REQUIRED)
public class HeroService {
	
	private HeroEntityRepository heroEntityRepository;
	private HeroModelMapper heroModelMapper;
	
	public void add() {
		
		try (InputStream is = new URL("http://hotsapi.net/api/v1/heroes").openStream()) {
			
			JsonReader reader = new JsonReader(new InputStreamReader(is, StandardCharsets.UTF_8));
			Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES).create();
			
			reader.beginArray();
			while (reader.hasNext()) {
				HeroInputModel model = gson.fromJson(reader, HeroInputModel.class);
				heroEntityRepository.save(heroModelMapper.toEntity(model));
			}
			reader.close();
		} catch (MalformedURLException e) {
			log.error("MalformedURLException" + e.getMessage());
		} catch (IOException e) {
			log.error("IOException" + e.getMessage());
		}
	}
	
	public List<HeroNameAndId> getHeroNames() {
		return heroEntityRepository.getIdAndName();
	}
	
//	public HeroServiceModel getHero(Long id) {
//		return heroModelMapper.toServiceModel(heroEntityRepository.findById(id));
//	}
}