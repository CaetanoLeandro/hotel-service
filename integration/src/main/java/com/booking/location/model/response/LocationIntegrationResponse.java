package com.booking.location.model.response;


import com.fasterxml.jackson.annotation.JsonProperty;

public class LocationIntegrationResponse {

    @JsonProperty(value = "city_ufi")
    public int cityUfi;
//    public BMaxLosData b_max_los_data;
    public String lc;
    public int hotels;
    public String timezone;
    @JsonProperty(value = "image_url")
    public String imageUrl;
    public String region;
    public String country;
    @JsonProperty(value = "dest_id")
    public String destId;
    public double longitude;
    @JsonProperty(value = "landmark_type")
    public int landmarkType;
    public double latitude;
    public String label;
    @JsonProperty(value = "city_name")
    public String cityName;
    @JsonProperty(value = "dest_type")
    public String destType;
    @JsonProperty(value = "nr_hotels")
    public int nrHotels;
    public String name;
    public String type;
    public String cc1;
    public int rtl;

}
