package com.booking.location.service;

import com.booking.location.LocationIntegration;
import com.booking.location.model.request.LocationIntegrationRequest;
import com.booking.location.model.response.LocationIntegrationResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
@AllArgsConstructor
public class LocationService {

    private final LocationIntegration locationIntegration;

    public Flux<LocationIntegrationResponse> find(LocationIntegrationRequest locationIntegrationRequest) {
        return locationIntegration.getLocation(locationIntegrationRequest);
    }
}