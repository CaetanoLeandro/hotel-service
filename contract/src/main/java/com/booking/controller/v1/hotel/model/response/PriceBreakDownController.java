package com.booking.controller.v1.hotel.model.response;

import com.booking.common.Currency;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class PriceBreakDownController {

    private Double grossPrice;
    private Currency currency;
    private Double sumeXcludedraw;
    private Integer hasinCalculableCharges;
}