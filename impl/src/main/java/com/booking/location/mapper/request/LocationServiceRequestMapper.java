package com.booking.location.mapper.request;


import com.booking.location.model.request.LocationIntegrationRequest;
import com.booking.location.model.request.LocationServiceRequest;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.Optional;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class LocationServiceRequestMapper {

    public static LocationIntegrationRequest toLocationIntegrationRequest(LocationServiceRequest locationServiceRequest) {
        return Optional.ofNullable(locationServiceRequest)
                .map(location -> LocationIntegrationRequest.builder()
                        .locale(location.getLocale())
                        .name(location.getName())
                        .build())
                .orElse(null);
    }
}