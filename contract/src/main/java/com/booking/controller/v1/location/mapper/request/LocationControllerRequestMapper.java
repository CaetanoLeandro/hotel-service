package com.booking.controller.v1.location.mapper.request;

import com.booking.controller.v1.location.model.request.LocationControllerRequest;
import com.booking.location.model.request.LocationServiceRequest;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.Optional;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class LocationControllerRequestMapper {

    public static LocationServiceRequest toLocationServiceRequest(LocationControllerRequest locationControllerRequest) {
        return Optional.ofNullable(locationControllerRequest)
                .map(location -> LocationServiceRequest.builder()
                        .locale(location.getLocale())
                        .name(location.getName())
                        .build())
                .orElse(null);
    }
}