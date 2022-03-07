package com.booking.controller.v1.hotel.mapper.response;

import com.booking.controller.v1.hotel.model.response.HotelControllerResponse;
import com.booking.controller.v1.hotel.model.response.ResultControllerResponse;
import com.booking.service.hotel.model.response.HotelServiceResponse;
import com.booking.service.hotel.model.response.ResultServiceResponse;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.Optional;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class HotelControllerResponseMapper {

    public static ResultControllerResponse mapperToResultResponse(ResultServiceResponse resultServiceResponse) {
        return new ResultControllerResponse(resultServiceResponse.getResult().stream()
                .map(HotelControllerResponseMapper::toHotelControllerResponse)
                .toList());
    }

    public static HotelControllerResponse toHotelControllerResponse(HotelServiceResponse hotelServiceResponse) {
        return Optional.ofNullable(hotelServiceResponse)
                .map(hotelService -> HotelControllerResponse.builder()
                        .hotelIncludeBreakfast(hotelService.getHotelIncludeBreakfast())
                        .hotelName(hotelService.getHotelName())
                        .city(hotelService.getCity())
                        .countryTrans(hotelService.getCountryTrans())
                        .address(hotelService.getAddress())
                        .reviewScore(hotelService.getReviewScore())
                        .classHotel(hotelService.getClassHotel())
                        .reviewScoreWord(hotelService.getReviewScoreWord())
                        .unitConfigurationLabel(hotelService.getUnitConfigurationLabel())
                        .priceBreakDown(hotelService.getPriceBreakDown())
                        .build())
                .orElse(null);
    }
}
