package com.booking.model.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class LocationRequest {
    private String destId;
    private String label;
    private String region;
    private String cityName;
    private String country;
}
