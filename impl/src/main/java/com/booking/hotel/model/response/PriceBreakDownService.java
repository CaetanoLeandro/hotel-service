package com.booking.hotel.model.response;

import com.booking.common.Currency;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class PriceBreakDownService {

    private Double grossPrice;
    private Currency currency;
    private Double sumeXcludedraw;
    private Integer hasinCalculableCharges;
}
