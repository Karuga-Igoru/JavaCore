package Lesson7.Forecast;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class Temperature {
    @JsonProperty("Minimum")
    private Imum minimum;
    @JsonProperty("Maximum")
    private Imum maximum;
}
