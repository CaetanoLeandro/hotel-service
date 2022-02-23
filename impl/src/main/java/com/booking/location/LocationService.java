package com.booking.location;

import com.booking.location.model.request.LocationIntegrationRequest;
import com.booking.location.model.response.LocationIntegrationResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
@AllArgsConstructor
public class LocationService {

    private final LocationApi locationApi;

    public Flux<LocationIntegrationResponse> find() {
        return locationApi.getLocation(LocationIntegrationRequest.builder()
                .locale("pt-br")
                .name("berlin")
                .build());
    }

}
