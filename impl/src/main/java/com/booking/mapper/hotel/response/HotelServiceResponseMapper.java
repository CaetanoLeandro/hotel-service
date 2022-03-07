package com.booking.mapper.hotel.response;

import com.booking.hotel.model.response.HotelIntegrationResponse;
import com.booking.hotel.model.response.Result;
import com.booking.service.hotel.model.response.HotelServiceResponse;
import com.booking.service.hotel.model.response.ResultServiceResponse;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.Optional;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class HotelServiceResponseMapper {

    public static ResultServiceResponse mapperToResultResponse(HotelIntegrationResponse hotelIntegrationResponse) {
        return new ResultServiceResponse(hotelIntegrationResponse.getResult().stream()
                .map(HotelServiceResponseMapper::mapToHotelServiceResponse)
                .toList());
    }

    private static HotelServiceResponse mapToHotelServiceResponse(Result result) {
        return Optional.ofNullable(result)
                .map(hotelResult -> HotelServiceResponse.builder()
                        .hotelIncludeBreakfast(hotelResult.getHotelIncludeBreakfast())
                        .hotelName(hotelResult.getHotelName())
                        .city(hotelResult.getCity())
                        .countryTrans(hotelResult.getCountryTrans())
                        .address(hotelResult.getAddress())
                        .reviewScore(hotelResult.getReviewScore())
                        .classHotel(hotelResult.getClassHotel())
                        .reviewScoreWord(hotelResult.getReviewScoreWord())
                        .unitConfigurationLabel(hotelResult.getUnitConfigurationLabel())
                        .priceBreakDown(hotelResult.getPriceBreakDown())
                        .build())
                .orElse(null);
    }
}
