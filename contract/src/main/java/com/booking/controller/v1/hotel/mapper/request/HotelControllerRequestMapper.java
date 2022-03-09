package com.booking.controller.v1.hotel.mapper.request;

import com.booking.controller.v1.hotel.model.request.HotelControllerRequest;
import com.booking.hotel.model.request.HotelServiceRequest;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.Optional;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class HotelControllerRequestMapper {

    public static HotelServiceRequest mapperHotelToService(HotelControllerRequest hotelControllerRequest) {
        return Optional.ofNullable(hotelControllerRequest)
                .map(hotelController -> HotelServiceRequest.builder()
                        .roomNumber(hotelController.getRoomNumber())
                        .checkoutDate(hotelController.getCheckoutDate())
                        .filterByCurrency(hotelController.getFilterByCurrency())
                        .locale(hotelController.getLocale())
                        .destType(hotelController.getDestType())
                        .checkinDate(hotelController.getCheckinDate())
                        .adultsNumber(hotelController.getAdultsNumber())
                        .orderBy(hotelController.getOrderBy())
                        .units(hotelController.getUnits())
                        .destId(hotelController.getDestId())
                        .build())
                .orElse(null);
    }
}