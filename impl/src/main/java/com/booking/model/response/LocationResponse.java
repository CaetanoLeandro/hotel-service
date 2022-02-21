package com.booking.model.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class LocationResponse {
    private String destId;
    private String label;
    private String region;
    private String cityName;
    private String country;
}
