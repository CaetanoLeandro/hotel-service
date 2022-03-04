package com.booking.mapper.location.request;


import com.booking.location.model.request.LocationIntegrationRequest;
import com.booking.location.model.response.LocationIntegrationResponse;
import com.booking.service.location.model.request.LocationServiceRequest;
import com.booking.service.location.model.response.LocationServiceResponse;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.experimental.UtilityClass;

import java.util.Optional;

@UtilityClass
public class LocationServiceMapper {

    public static LocationIntegrationRequest toLocationIntegrationRequest(LocationServiceRequest locationServiceRequest){
        return Optional.ofNullable(locationServiceRequest)
                .map(location -> LocationIntegrationRequest.builder()
                        .locale(location.getLocale())
                        .name(location.getName())
                        .build())
                .orElse(null);
    }

    public static LocationServiceResponse toLocationControllerResponse(LocationIntegrationResponse locationIntegrationResponse){
        return Optional.ofNullable(locationIntegrationResponse)
                .map(location -> LocationServiceResponse.builder()
                        .cityName(location.getCityName())
                        .destId(location.getDestId())
                        .country(location.getCountry())
                        .label(location.getLabel())
                        .region(location.getRegion())
                        .build())
                .orElse(null);
    }

}
