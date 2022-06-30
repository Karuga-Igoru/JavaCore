package Lesson7.Forecast;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

import java.time.OffsetDateTime;

@Getter
public class Headline {
    @JsonProperty("EffectiveDate")
    private OffsetDateTime effectiveDate;
    @JsonProperty("EffectiveEpochDate")
    private long effectiveEpochDate;
    @JsonProperty("Severity")
    private long severity;
    @JsonProperty("Text")
    private String text;
    @JsonProperty("Category")
    private String category;
    @JsonProperty("EndDate")
    private OffsetDateTime endDate;
    @JsonProperty("EndEpochDate")
    private long endEpochDate;
    @JsonProperty("MobileLink")
    private String mobileLink;
    @JsonProperty("Link")
    private String link;
}
