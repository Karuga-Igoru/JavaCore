package Lesson7.Forecast;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

import java.time.OffsetDateTime;

@Getter
public class DailyForecast {
    @JsonProperty("Date")
    private OffsetDateTime date;
    @JsonProperty("EpochDate")
    private long epochDate;
    @JsonProperty("Temperature")
    private Temperature temperature;
    @JsonProperty("Day")
    private Day day;
    @JsonProperty("Night")
    private Day night;
    @JsonProperty("Sources")
    private String[] sources;
    @JsonProperty("MobileLink")
    private String mobileLink;
    @JsonProperty("Link")
    private String link;
}
