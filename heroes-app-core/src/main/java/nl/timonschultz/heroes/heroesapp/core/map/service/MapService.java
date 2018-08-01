package nl.timonschultz.heroes.heroesapp.core.map.service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import nl.timonschultz.heroes.heroesapp.core.map.mapper.MapModelMapper;
import nl.timonschultz.heroes.heroesapp.core.map.model.MapInputModel;
import nl.timonschultz.heroes.heroesapp.core.map.model.MapServiceModel;
import nl.timonschultz.heroes.heroesapp.persistence.map.MapEntityRepository;
import nl.timonschultz.heroes.heroesapp.persistence.map.MapNameAndId;
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
public class MapService {
	
	private final MapModelMapper mapModelMapper;
	private final MapEntityRepository mapEntityRepository;
	
	public void importMaps() {
		
		try (InputStream is = new URL("http://hotsapi.net/api/v1/maps").openStream()) {
			
			JsonReader reader = new JsonReader(new InputStreamReader(is, StandardCharsets.UTF_8));
			Gson gson = new GsonBuilder().create();
			
			reader.beginArray();
			while (reader.hasNext()) {
				MapInputModel model = gson.fromJson(reader, MapInputModel.class);
				mapEntityRepository.save(mapModelMapper.toEntity(model));
			}
			reader.close();
		} catch (MalformedURLException e) {
			log.error("MalformedURLException" + e.getMessage());
		} catch (IOException e) {
			log.error("IOException" + e.getMessage());
		}
	}
	
	public List<MapNameAndId> getMapNames() {
		return mapEntityRepository.getIdAndName();
	}
	
	public MapServiceModel getMap(Long id) {
		return mapModelMapper.toServiceModel(mapEntityRepository.find(id));
	}
}