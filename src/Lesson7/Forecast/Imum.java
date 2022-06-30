package Lesson7.Forecast;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class Imum {
    @JsonProperty("Value")
    private double value;
    @JsonProperty("Unit")
    private Unit unit;
    @JsonProperty("UnitType")
    private long unitType;
}
