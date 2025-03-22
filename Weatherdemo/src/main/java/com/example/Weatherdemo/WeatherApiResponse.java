package com.example.Weatherdemo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true) 
public class WeatherApiResponse {

    @JsonProperty("current_weather")
    public WeatherResponse currentWeather;
}
