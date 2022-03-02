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

    @JsonProperty("room_number")
    private Integer roomNumber;
    @JsonProperty("checkout_date")
    private String checkoutDate;
    @JsonProperty("filter_by_currency")
    private String filterByCurrency;
    @JsonProperty("dest_type")
    private String destType;
    private String locale;
    @JsonProperty("checkin_date")
    private String checkinDate;
    @JsonProperty("adults_number")
    private Integer adultsNumber;
    @JsonProperty("order_by")
    private String orderBy;
    private String units;
    @JsonProperty("dest_id")
    private String destId;

}
