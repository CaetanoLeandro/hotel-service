package com.booking.photos;

import com.booking.photos.model.request.PhotoRequest;
import com.booking.photos.model.response.PhotoResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

@AllArgsConstructor
@Component
public class PhotosIntegration {

    private final WebClient webClient;

    public Flux<PhotoResponse> getPhotos(PhotoRequest photoRequest) {
        return webClient.get()
                .uri(uriBuilder -> uriBuilder
                        .path("v1/hotels/photos")
                        .queryParam("locale", photoRequest.getLocale())
                        .queryParam("hotel_id", photoRequest.getHotelId())
                        .build())
                .retrieve()
                .bodyToFlux(PhotoResponse.class);

    }
}
