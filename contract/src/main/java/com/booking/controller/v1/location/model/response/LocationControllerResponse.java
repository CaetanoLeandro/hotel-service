package com.booking.controller.v1.location.model.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder

public class LocationControllerResponse {

    private String destId;
    private String label;
    private String region;
    private String cityName;
    private String country;
}
