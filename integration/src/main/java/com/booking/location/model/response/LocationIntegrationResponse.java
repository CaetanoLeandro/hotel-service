package com.booking.location.model.response;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LocationIntegrationResponse {

    private String region;
    private String country;
    @JsonProperty("dest_id")
    private String destId;
    private String label;
    @JsonProperty("city_name")
    private String cityName;
}