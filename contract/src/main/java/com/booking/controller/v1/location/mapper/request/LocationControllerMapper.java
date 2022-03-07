package com.booking.controller.v1.location.mapper.request;

import com.booking.controller.v1.location.model.request.LocationControllerRequest;
import com.booking.controller.v1.location.model.response.LocationControllerResponse;
import com.booking.service.location.LocationService;
import com.booking.service.location.model.request.LocationServiceRequest;
import com.booking.service.location.model.response.LocationServiceResponse;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.experimental.UtilityClass;

import java.util.Optional;

@UtilityClass
public class LocationControllerMapper {

    public static LocationServiceRequest toLocationControllerRequest(LocationControllerRequest locationControllerRequest){
        return Optional.ofNullable(locationControllerRequest)
                .map(location -> LocationServiceRequest.builder()
                .locale(location.getLocale())
                .name(location.getName())
                .build())
                .orElse(null);
    }

    public static LocationControllerResponse toLocationControllerResponse(LocationServiceResponse locationServiceResponse){
        return Optional.ofNullable(locationServiceResponse)
                .map(location -> LocationControllerResponse.builder()
                        .cityName(location.getCityName())
                        .destId(location.getDestId())
                        .country(location.getCountry())
                        .label(location.getLabel())
                        .region(location.getRegion())
                        .build())
                .orElse(null);
    }

}
