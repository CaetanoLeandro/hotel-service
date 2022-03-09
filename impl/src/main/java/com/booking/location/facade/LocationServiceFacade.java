package com.booking.location.facade;

import com.booking.location.service.LocationService;
import com.booking.location.mapper.request.LocationServiceRequestMapper;
import com.booking.location.model.request.LocationServiceRequest;
import com.booking.location.model.response.LocationServiceResponse;
import com.booking.location.mapper.response.LocationServiceResponseMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

@Component
@AllArgsConstructor
public class LocationServiceFacade {

    private final LocationService locationService;

    public Flux<LocationServiceResponse> find(LocationServiceRequest locationServiceRequest) {
        return locationService.find(LocationServiceRequestMapper.toLocationIntegrationRequest(locationServiceRequest))
                .map(LocationServiceResponseMapper::toLocationServiceResponse);
    }
}