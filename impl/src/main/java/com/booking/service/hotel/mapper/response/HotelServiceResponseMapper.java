package com.booking.service.hotel.mapper.response;

import com.booking.hotel.model.response.PriceBreakDownIntegration;
import com.booking.hotel.model.response.ResultIntegration;
import com.booking.service.hotel.model.response.PriceBreakDownService;
import com.booking.service.hotel.model.response.ResultServiceResponse;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class HotelServiceResponseMapper {

    public static ResultServiceResponse mapToResultResponse(ResultIntegration result,
                                                            PriceBreakDownIntegration priceBreakDownIntegration) {
        return ResultServiceResponse.builder()
                .hotelIncludeBreakfast(result.getHotelIncludeBreakfast())
                .hotelName(result.getHotelName())
                .city(result.getCity())
                .countryTrans(result.getCountryTrans())
                .address(result.getAddress())
                .reviewScore(result.getReviewScore())
                .classHotel(result.getClassHotel())
                .reviewScoreWord(result.getReviewScoreWord())
                .unitConfigurationLabel(result.getUnitConfigurationLabel())
                .priceBreakDown(mapToPriceService(priceBreakDownIntegration))
                .build();
    }

    public static PriceBreakDownService mapToPriceService(PriceBreakDownIntegration priceBreakDownIntegration) {
        return PriceBreakDownService.builder()
                .grossPrice(priceBreakDownIntegration.getGrossPrice())
                .currency(priceBreakDownIntegration.getCurrency())
                .sumeXcludedraw(priceBreakDownIntegration.getSumeXcludedraw())
                .hasinCalculableCharges(priceBreakDownIntegration.getHasinCalculableCharges())
                .build();
    }
}