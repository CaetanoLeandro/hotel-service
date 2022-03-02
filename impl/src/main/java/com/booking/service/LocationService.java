package com.booking.service;

import com.booking.location.LocationIntegration;
import com.booking.location.model.request.LocationIntegrationRequest;
import com.booking.location.model.response.LocationIntegrationResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
@AllArgsConstructor
public class LocationService {

    private final LocationIntegration locationApi;

    public Flux<LocationIntegrationResponse> find(LocationIntegrationRequest searchLocationRequest) {
        return locationApi.getLocation(searchLocationRequest);
    }

}
