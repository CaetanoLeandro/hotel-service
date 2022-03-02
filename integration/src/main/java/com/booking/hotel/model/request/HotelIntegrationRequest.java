package com.booking.hotel.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class HotelIntegrationRequest {

    private Integer roomNumber;
    private String checkoutDate;
    private String filterByCurrency;
    private String destType;
    private String locale;
    private String checkinDate;
    private Integer adultsNumber;
    private String orderBy;
    private String units;
    private String destId;

}
