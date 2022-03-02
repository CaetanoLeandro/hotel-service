package com.booking.controller.v1.hotel.model.response;

import com.booking.hotel.model.response.PriceBreakDown;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class HotelControllerResponse {

    private Boolean hotelIncludeBreakfast;
    private String hotelName;
    private String city;
    private String countryTrans;
    private String address;
    private String reviewScore;
    private Integer classHotel;
    private String reviewScoreWord;
    private String unitConfigurationLabel;
    private List<PriceBreakDown> priceBreakDown;
}
