package com.booking.location;

import com.booking.location.model.response.SearchLocationResponse;
import lombok.AllArgsConstructor;
import com.booking.location.model.request.SearchLocationRequest;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

@AllArgsConstructor
@Service
public class    SearchLocationApi {

    private final WebClient webClient;

    public Flux<SearchLocationResponse> getLocation(SearchLocationRequest locationIntegrationRequest) {
        return webClient.get()
                .uri(uriBuilder -> uriBuilder
                        .path("v1/hotels/locations")
                        .queryParam("locale", locationIntegrationRequest.getLocale())
                        .queryParam("name", locationIntegrationRequest.getName())
                        .build())
                .retrieve()
                .bodyToFlux(SearchLocationResponse.class);
    }
}