
package com.booking.hotel.model.response;
import com.booking.common.Currency;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class PriceBreakDown {

    @JsonProperty("gross_price")
    private Double grossPrice;
    private Currency currency;
    @JsonProperty("sum_excluded_raw")
    private Double sumeXcludedraw;
    @JsonProperty("has_incalculable_charges")
    private Integer hasinCalculableCharges;

}
