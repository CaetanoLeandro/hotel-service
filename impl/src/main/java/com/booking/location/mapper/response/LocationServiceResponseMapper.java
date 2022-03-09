package com.booking.location.mapper.response;

import com.booking.location.model.response.LocationIntegrationResponse;
import com.booking.location.model.response.LocationServiceResponse;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class LocationServiceResponseMapper {
    public static LocationServiceResponse toLocationServiceResponse(LocationIntegrationResponse locationIntegrationResponse) {
        return LocationServiceResponse.builder()
                .cityName(locationIntegrationResponse.getCityName())
                .destId(locationIntegrationResponse.getDestId())
                .country(locationIntegrationResponse.getCountry())
                .label(locationIntegrationResponse.getLabel())
                .region(locationIntegrationResponse.getRegion())
                .build();
    }
}
