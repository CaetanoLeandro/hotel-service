package com.booking.controller.v1.location.facade;

import com.booking.controller.v1.location.mapper.response.LocationControllerResponseMapper;
import com.booking.controller.v1.location.model.request.LocationControllerRequest;
import com.booking.controller.v1.location.model.response.LocationControllerResponse;
import com.booking.location.facade.LocationServiceFacade;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

import static com.booking.controller.v1.location.mapper.request.LocationControllerRequestMapper.toLocationServiceRequest;

@Component
@AllArgsConstructor
public class LocationControllerFacade {

    private final LocationServiceFacade locationServiceFacade;

    public Flux<LocationControllerResponse> find(LocationControllerRequest locationControllerRequest) {
        return locationServiceFacade.find(toLocationServiceRequest(locationControllerRequest))
                .map(LocationControllerResponseMapper::toLocationControllerResponse);
    }
}