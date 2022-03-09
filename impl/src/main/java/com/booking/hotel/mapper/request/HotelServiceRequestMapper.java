package com.booking.hotel.mapper.request;

import com.booking.hotel.model.request.HotelIntegrationRequest;
import com.booking.hotel.model.request.HotelServiceRequest;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.Optional;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class HotelServiceRequestMapper {

    public static HotelIntegrationRequest toHotelIntegrationRequest(HotelServiceRequest hotelServiceRequest) {
        return Optional.ofNullable(hotelServiceRequest)
                .map(hotelService -> HotelIntegrationRequest.builder()
                        .destId(hotelService.getDestId())
                        .roomNumber(hotelService.getRoomNumber())
                        .checkinDate(hotelService.getCheckinDate())
                        .checkoutDate(hotelService.getCheckoutDate())
                        .filterByCurrency(hotelService.getFilterByCurrency())
                        .destType(hotelService.getDestType())
                        .locale(hotelService.getLocale())
                        .adultsNumber(hotelService.getAdultsNumber())
                        .orderBy(hotelService.getOrderBy())
                        .units(hotelService.getUnits())
                        .build())
                .orElse(null);
    }
}