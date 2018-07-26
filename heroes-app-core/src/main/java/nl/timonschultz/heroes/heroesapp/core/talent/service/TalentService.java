package nl.timonschultz.heroes.heroesapp.core.talent.service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import nl.timonschultz.heroes.heroesapp.core.talent.mapper.TalentModelMapper;
import nl.timonschultz.heroes.heroesapp.core.talent.model.TalentInputModel;
import nl.timonschultz.heroes.heroesapp.persistence.talent.TalentEntityRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

@Slf4j
@Service
@RequiredArgsConstructor
@Transactional(propagation = Propagation.REQUIRED)
public class TalentService {

    private final TalentModelMapper talentModelMapper;
    private final TalentEntityRepository talentEntityRepository;
//
//    @Value("${hotsapi.url.map}")
//    private final String url;

    public void add(final TalentInputModel talentInputModel) {

        try (InputStream is = new URL("http://hotsapi.net/api/v1/maps").openStream()) {

            JsonReader reader = new JsonReader(new InputStreamReader(is, "UTF-8"));
            Gson gson = new GsonBuilder().create();

            reader.beginArray();
            while (reader.hasNext()) {
                TalentInputModel model = gson.fromJson(reader, TalentInputModel.class);
                talentEntityRepository.save(talentModelMapper.toEntity(model));
            }
            reader.close();

        } catch (MalformedURLException e) {
            log.error("MalformedURLException" + e.getMessage());
        } catch (IOException e) {
            log.error("IOException" + e.getMessage());
        }
    }
}
