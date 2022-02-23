package com.booking.apis.searchhoteis.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Result {
    @JsonProperty("hotel_include_breakfast")
    private Boolean hotelIncludeBreakfast;
    @JsonProperty("hotel_name")
    private String hotelName;
    private String city;
    @JsonProperty("country_trans")
    private String countryTrans;
    private String address;
    @JsonProperty("review_score")
    private String reviewScore;
    private Integer classHotel;
    @JsonProperty("review_score_word")
    private String reviewScoreWord;
    @JsonProperty("unit_configuration_label")
    private String unitConfigurationLabel;
    private List<PriceBreakDown> priceBreakDown;
}