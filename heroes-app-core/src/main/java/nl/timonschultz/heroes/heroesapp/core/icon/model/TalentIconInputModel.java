package nl.timonschultz.heroes.heroesapp.core.icon.model;

import com.google.gson.annotations.SerializedName;
import lombok.Builder;
import lombok.Getter;

public class TalentIconInputModel extends TalentIconModel {
	
	@Getter
	@SerializedName("64x64")
	String icon;
	
	@Builder
	public TalentIconInputModel(String icon) {
		this.icon = icon;
	}
}
