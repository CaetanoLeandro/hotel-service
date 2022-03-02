package com.booking.mapper.request;

import com.booking.repository.model.request.HotelServiceRequest;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.Optional;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class HotelServiceResquetMapper {

    /*public static HotelEntity toHotelEntity(HotelServiceRequest hotelServiceRequest) {
        return Optional.ofNullable(hotelServiceRequest)
                .map(hotelRequest -> HotelEntity.builder()
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
    }*/
}
