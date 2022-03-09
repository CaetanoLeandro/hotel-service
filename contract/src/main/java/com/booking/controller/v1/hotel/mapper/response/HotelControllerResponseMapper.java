package com.booking.controller.v1.hotel.mapper.response;

import com.booking.controller.v1.hotel.model.response.PriceBreakDownController;
import com.booking.controller.v1.hotel.model.response.ResultControllerResponse;
import com.booking.hotel.model.response.PriceBreakDownService;
import com.booking.hotel.model.response.ResultServiceResponse;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class HotelControllerResponseMapper {

    public static ResultControllerResponse mapToResultResponse(ResultServiceResponse resultServiceResponse,
                                                               PriceBreakDownService priceBreakDownService) {
        return ResultControllerResponse.builder()
                .hotelIncludeBreakfast(resultServiceResponse.getHotelIncludeBreakfast())
                .hotelName(resultServiceResponse.getHotelName())
                .city(resultServiceResponse.getCity())
                .countryTrans(resultServiceResponse.getCountryTrans())
                .address(resultServiceResponse.getAddress())
                .reviewScore(resultServiceResponse.getReviewScore())
                .classHotel(resultServiceResponse.getClassHotel())
                .reviewScoreWord(resultServiceResponse.getReviewScoreWord())
                .unitConfigurationLabel(resultServiceResponse.getUnitConfigurationLabel())
                .priceBreakDown(mapToPriceService(priceBreakDownService))
                .build();
    }

    public static PriceBreakDownController mapToPriceService(PriceBreakDownService priceBreakDownService) {
        return PriceBreakDownController.builder()
                .grossPrice(priceBreakDownService.getGrossPrice())
                .currency(priceBreakDownService.getCurrency())
                .sumeXcludedraw(priceBreakDownService.getSumeXcludedraw())
                .hasinCalculableCharges(priceBreakDownService.getHasinCalculableCharges())
                .build();
    }
}