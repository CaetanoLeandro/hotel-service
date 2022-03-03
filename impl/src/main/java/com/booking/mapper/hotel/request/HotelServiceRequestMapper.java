package com.booking.mapper.hotel.request;

import com.booking.hotel.model.request.HotelIntegrationRequest;
import com.booking.service.hotel.model.request.HotelServiceRequest;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.Optional;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class HotelServiceRequestMapper {

    public static HotelServiceRequest toServiceRequest(HotelIntegrationRequest hotelIntegrationRequest) {
        return Optional.ofNullable(hotelIntegrationRequest)
                .map(hotelRequest -> HotelServiceRequest.builder()
                        .destId(hotelRequest.getDestId())
                        .roomNumber(hotelRequest.getRoomNumber())
                        .checkinDate(hotelRequest.getCheckinDate())
                        .checkoutDate(hotelRequest.getCheckoutDate())
                        .filterByCurrency(hotelRequest.getFilterByCurrency())
                        .destType(hotelRequest.getDestType())
                        .locale(hotelRequest.getLocale())
                        .adultsNumber(hotelRequest.getAdultsNumber())
                        .orderBy(hotelRequest.getOrderBy())
                        .units(hotelRequest.getUnits())
                        .build())
                .orElse(null);
    }
}
