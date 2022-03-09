package com.booking.location.model.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class LocationServiceResponse {

    private String region;
    private String country;
    private String destId;
    private String label;
    private String cityName;
}
