package com.booking.hotel.model.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class HotelServiceRequest {

    private String destId;
    private Integer roomNumber;
    private String checkoutDate;
    private String filterByCurrency;
    private String destType;
    private String locale;
    private String checkinDate;
    private Integer adultsNumber;
    private String orderBy;
    private String units;
}