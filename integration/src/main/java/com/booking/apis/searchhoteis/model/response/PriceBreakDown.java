package com.booking.apis.searchhoteis.model.response;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class PriceBreakDown {
    private Double grossPrice;
    private Enum currence;
    private Double sumeXcludedraw;
    private Integer hasinCalculableCharges;
}
