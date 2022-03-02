package com.booking.location;

import com.booking.location.model.response.LocationIntegrationResponse;
import com.booking.location.model.request.LocationIntegrationRequest;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

@AllArgsConstructor
@Service
public class LocationIntegration {

    private final WebClient webClient;

    public Flux<LocationIntegrationResponse> getLocation(LocationIntegrationRequest locationIntegrationRequest) {
        return webClient.get()
                .uri(uriBuilder -> uriBuilder
                        .path("v1/hotels/locations")
                        .queryParam("locale", locationIntegrationRequest.getLocale())
                        .queryParam("name", locationIntegrationRequest.getName())
                        .build())
                .retrieve()
                .bodyToFlux(LocationIntegrationResponse.class);
    }
}