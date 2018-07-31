package nl.timonschultz.heroes.heroesapp.core.icon.model;

import com.google.gson.annotations.SerializedName;
import lombok.Builder;
import lombok.Getter;

public class HeroIconInputModel extends HeroIconModel {
	
	@Getter
	@SerializedName("92x93")
	String icon;
	
	@Builder
	public HeroIconInputModel(String icon) {
		this.icon = icon;
	}
}
