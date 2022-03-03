package com.booking.mapper.hotel.response;

import com.booking.hotel.model.response.HotelIntegrationResponse;
import com.booking.hotel.model.response.Result;
import com.booking.service.hotel.model.response.HotelServiceResponse;
import com.booking.service.hotel.model.response.ResultResponse;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Optional;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class HotelServiceResponseMapper {

    public static ResultResponse mapperToHotelService(HotelIntegrationResponse hotelIntegrationResponse){
        return Optional.ofNullable(hotelIntegrationResponse)
                .map(hotel -> ResultResponse.builder()
                        .result()
                        .build())
                .orElse(null);
    }

    public static List<HotelServiceResponse> toServiceResponseList(List<Result> result) {
        return Optional.ofNullable(result)
                .map(list -> list.stream()
                        .map(HotelServiceResponseMapper::toServiceResponse)
                        .toList())
                .orElse(null);
    }

    public static ResultResponse resultResponse(List<Result> results) {
        return Optional.ofNullable(results).map(results1 -> ResultResponse.builder()
                        .result(toServiceResponseList(results1))
                        .build())
                .orElse(null);
    }

    public static HotelServiceResponse toServiceResponse(Result result) {
        return Optional.ofNullable(result)
                .map(hotelResponse -> HotelServiceResponse.builder()
                        .hotelIncludeBreakfast(hotelResponse.getHotelIncludeBreakfast())
                        .hotelName(hotelResponse.getHotelName())
                        .city(hotelResponse.getCity())
                        .countryTrans(hotelResponse.getCountryTrans())
                        .address(hotelResponse.getAddress())
                        .reviewScore(hotelResponse.getReviewScore())
                        .classHotel(hotelResponse.getClassHotel())
                        .reviewScoreWord(hotelResponse.getReviewScoreWord())
                        .unitConfigurationLabel(hotelResponse.getUnitConfigurationLabel())
                        .priceBreakDown(hotelResponse.getPriceBreakDown())
                        .build())
                .orElse(null);
    }
}