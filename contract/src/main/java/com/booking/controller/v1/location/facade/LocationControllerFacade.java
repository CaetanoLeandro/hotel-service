package com.booking.controller.v1.location.facade;

import com.booking.controller.v1.location.model.response.LocationControllerResponse;
import com.booking.service.location.facade.LocationServiceFacade;
import com.booking.service.location.model.request.LocationServiceRequest;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

@Component
@AllArgsConstructor
public class LocationControllerFacade {

    private final LocationServiceFacade locationServiceFacade;

    public Flux<LocationControllerResponse> find(LocationServiceRequest locationServiceRequest) {
        return locationServiceFacade.find(locationServiceRequest)
                .map(mapper::metodoMapper);
    }
}
