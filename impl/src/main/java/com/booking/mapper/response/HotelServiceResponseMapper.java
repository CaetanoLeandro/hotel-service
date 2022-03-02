package com.booking.mapper.response;

import com.booking.repository.model.response.HotelServiceResponse;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.Optional;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class HotelServiceResponseMapper {

    /*public static HotelServiceResponse toServiceResponse(HotelEntity hotelEntity) {
        return Optional.ofNullable(hotelEntity)
                .map(hotelEntity1 -> HotelServiceResponse.builder()
                        .destId(hotelEntity1.getDestId())
                        .roomNumber(hotelEntity1.getRoomNumber())
                        .checkinDate(hotelEntity1.getCheckinDate())
                        .checkoutDate(hotelEntity1.getCheckoutDate())
                        .filterByCurrency(hotelEntity1.getFilterByCurrency())
                        .destType(hotelEntity1.getDestType())
                        .locale(hotelEntity1.getLocale())
                        .adultsNumber(hotelEntity1.getAdultsNumber())
                        .orderBy(hotelEntity1.getOrderBy())
                        .units(hotelEntity1.getUnits())
                        .build())
                .orElse(null);
    }*/
}
