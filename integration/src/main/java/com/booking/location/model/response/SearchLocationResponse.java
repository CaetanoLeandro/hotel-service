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
public class SearchLocationResponse {

    @JsonProperty(value = "city_ufi")
    private Integer cityUfi;
//    private BMaxLosData b_max_los_data;
    private String lc;
    private Integer hotels;
    private String timezone;
    @JsonProperty(value = "image_url")
    private String imageUrl;
    private String region;
    private String country;
    @JsonProperty(value = "dest_id")
    private String destId;
    private Double longitude;
    @JsonProperty(value = "landmark_type")
    private Integer landmarkType;
    private Double latitude;
    private String label;
    @JsonProperty(value = "city_name")
    private String cityName;
    @JsonProperty(value = "dest_type")
    private String destType;
    @JsonProperty(value = "nr_hotels")
    private Integer nrHotels;
    private String name;
    private String type;
    private String cc1;
    private Integer rtl;
}