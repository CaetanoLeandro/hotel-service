package com.booking.location;

import lombok.AllArgsConstructor;
import com.booking.location.model.request.LocationIntegrationRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@AllArgsConstructor
@Component
public class LocationApi {

    private final WebClient webClient;

    public Mono<LocationIntegrationRequest> getLocation(LocationIntegrationRequest locationIntegrationRequest){
        return webClient.get().uri(uriBuilder -> uriBuilder.path("v1/hotels/locations")
                .queryParam("Locale", locationIntegrationRequest.getLocale(),
                        "name", locationIntegrationRequest.getName()).build()).exchangeToMono();
    }
}
