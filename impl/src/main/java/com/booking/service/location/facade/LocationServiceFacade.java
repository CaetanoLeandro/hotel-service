package com.booking.service.location.facade;

import com.booking.service.location.LocationService;
import com.booking.service.location.mapper.response.LocationServiceResonseMapper;
import com.booking.service.location.model.request.LocationServiceRequest;
import com.booking.service.location.model.response.LocationServiceResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

import static com.booking.service.location.mapper.request.LocationServiceRequestMapper.toLocationIntegrationRequest;

@Component
@AllArgsConstructor
public class LocationServiceFacade {

    private final LocationService locationService;

    public Flux<LocationServiceResponse> find(LocationServiceRequest locationServiceRequest) {
        return locationService.find(toLocationIntegrationRequest(locationServiceRequest))
                .map(LocationServiceResonseMapper::toLocationControllerResponse);
    }
}