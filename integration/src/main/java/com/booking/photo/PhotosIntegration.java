package com.booking.photo;

import com.booking.photo.model.request.PhotoIntegrationRequest;
import com.booking.photo.model.response.PhotoIntegrationResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

@AllArgsConstructor
@Component
public class PhotosIntegration {

    private final WebClient webClient;

    public Flux<PhotoIntegrationResponse> getPhotos(PhotoIntegrationRequest photoRequest) {
        return webClient.get()
                .uri(uriBuilder -> uriBuilder
                        .path("v1/hotels/photos")
                        .queryParam("locale", photoRequest.getLocale())
                        .queryParam("hotel_id", photoRequest.getHotelId())
                        .build())
                .retrieve()
                .bodyToFlux(PhotoIntegrationResponse.class);

    }
}
