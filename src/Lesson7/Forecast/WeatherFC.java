package Lesson7.Forecast;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class WeatherFC {
    @JsonProperty("Headline")
    private Headline headline;
    @JsonProperty("DailyForecasts")
    private DailyForecast[] dailyForecasts;
}

