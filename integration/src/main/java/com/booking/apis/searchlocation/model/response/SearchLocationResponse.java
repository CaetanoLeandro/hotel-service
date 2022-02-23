package com.booking.apis.searchlocation.model.response;


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

    @JsonProperty("city_ufi")
    private Integer cityUfi;
//    private BMaxLosData b_max_los_data;
    private String lc;
    private Integer hotels;
    private String timezone;
    @JsonProperty("image_url")
    private String imageUrl;
    private String region;
    private String country;
    @JsonProperty("dest_id")
    private String destId;
    private Double longitude;
    @JsonProperty("landmark_type")
    private Integer landmarkType;
    private Double latitude;
    private String label;
    @JsonProperty("city_name")
    private String cityName;
    @JsonProperty("dest_type")
    private String destType;
    @JsonProperty("nr_hotels")
    private Integer nrHotels;
    private String name;
    private String type;
    private String cc1;
    private Integer rtl;
}