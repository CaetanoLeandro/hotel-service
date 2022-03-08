package com.booking.controller.v1.location.facade;

import com.booking.controller.v1.location.mapper.response.LocationControllerResponseMapper;
import com.booking.controller.v1.location.model.request.LocationControllerRequest;
import com.booking.controller.v1.location.model.response.LocationControllerResponse;
import com.booking.service.location.facade.LocationServiceFacade;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

import static com.booking.controller.v1.location.mapper.request.LocationControllerMapper.toLocationControllerRequest;

@Component
@AllArgsConstructor
public class LocationControllerFacade {

    private final LocationServiceFacade locationServiceFacade;

    public Flux<LocationControllerResponse> find(LocationControllerRequest locationControllerRequest) {
        return locationServiceFacade.find(toLocationControllerRequest(locationControllerRequest))
                .map(LocationControllerResponseMapper::toLocationControllerResponse);
    }
}