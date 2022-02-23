package com.booking.location;

import com.booking.location.model.response.LocationIntegrationResponse;
import lombok.AllArgsConstructor;
import com.booking.location.model.request.LocationIntegrationRequest;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

@AllArgsConstructor
@Service
public class LocationApi {

    private final WebClient webClient;

    public Flux<LocationIntegrationResponse> getLocation(LocationIntegrationRequest locationIntegrationRequest) {
        return webClient.get()
                .uri(uriBuilder -> uriBuilder.path("v1/hotels/locations")
                        .queryParam("Locale", locationIntegrationRequest.getLocale(),
                                "name", locationIntegrationRequest.getName())
                        .build())
                .retrieve()
                .bodyToFlux(LocationIntegrationResponse.class);
    }
}