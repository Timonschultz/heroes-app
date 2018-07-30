package nl.timonschultz.heroes.heroesapp.core.icon.model;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class TalentIconModel {

    @SerializedName("64x64")
    String icon;

}