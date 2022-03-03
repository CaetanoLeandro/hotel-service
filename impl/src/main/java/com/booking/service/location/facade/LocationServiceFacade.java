package com.booking.service.location.facade;

import com.booking.location.model.request.LocationIntegrationRequest;
import com.booking.location.model.response.LocationIntegrationResponse;
import com.booking.service.location.LocationService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

@Component
@AllArgsConstructor
public class LocationServiceFacade {

    private final LocationService locationService;

    public Flux<LocationIntegrationResponse> find(LocationIntegrationRequest locationIntegrationRequest) {
        return locationService.find(locationIntegrationRequest)
                .map(mapper::metodoMapper);
    }



}
