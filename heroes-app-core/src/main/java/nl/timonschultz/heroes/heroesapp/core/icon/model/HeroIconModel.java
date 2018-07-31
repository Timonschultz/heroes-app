package nl.timonschultz.heroes.heroesapp.core.icon.model;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class HeroIconModel {
	
	@SerializedName("92x93") String icon;
}
