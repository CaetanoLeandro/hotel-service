package com.booking.hotel.model.response;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class ResultServiceResponse {

    private Boolean hotelIncludeBreakfast;
    private String hotelName;
    private String city;
    private String countryTrans;
    private String address;
    private String reviewScore;
    private Integer classHotel;
    private String reviewScoreWord;
    private String unitConfigurationLabel;
    private PriceBreakDownService priceBreakDown;
}
