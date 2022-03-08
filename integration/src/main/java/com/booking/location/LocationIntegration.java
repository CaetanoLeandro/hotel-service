package com.booking.location;

import com.booking.location.model.request.LocationIntegrationRequest;
import com.booking.location.model.response.LocationIntegrationResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

@Component
@AllArgsConstructor
<<<<<<< HEAD:integration/src/main/java/com/booking/location/LocationIntegration.java
public class LocationIntegration {
=======
@Service
public class SearchLocationApi {
>>>>>>> staging:integration/src/main/java/com/booking/apis/searchlocation/SearchLocationApi.java

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