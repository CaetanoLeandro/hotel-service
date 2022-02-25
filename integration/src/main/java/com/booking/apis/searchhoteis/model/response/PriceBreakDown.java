package com.booking.apis.searchhoteis.model.response;
import com.booking.common.Currence;
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
    private Currence currence;
    private Double sumeXcludedraw;
    private Integer hasinCalculableCharges;
}
