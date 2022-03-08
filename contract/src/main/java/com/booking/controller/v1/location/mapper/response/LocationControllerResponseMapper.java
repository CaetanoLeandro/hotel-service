package com.booking.controller.v1.location.mapper.response;

import com.booking.controller.v1.location.model.response.LocationControllerResponse;
import com.booking.service.location.model.response.LocationServiceResponse;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)

public class LocationControllerResponseMapper {

    public static LocationControllerResponse toLocationControllerResponse(LocationServiceResponse locationServiceResponse) {
        return LocationControllerResponse.builder()
                .cityName(locationServiceResponse.getCityName())
                .destId(locationServiceResponse.getDestId())
                .country(locationServiceResponse.getCountry())
                .label(locationServiceResponse.getLabel())
                .region(locationServiceResponse.getRegion())
                .build();
    }
}
