package com.booking.hotel;

import com.booking.hotel.model.request.HotelIntegrationRequest;
import com.booking.hotel.model.response.HotelIntegrationResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Component
@AllArgsConstructor
public class HotelIntegration {

    private final WebClient webClient;

    public Mono<HotelIntegrationResponse> getHotels(HotelIntegrationRequest hotelIntegrationRequest) {
        return webClient.get()
                .uri(uriBuilder -> uriBuilder
                        .path("v1/hotels/search")
                        .queryParam("checkout_date", hotelIntegrationRequest.getCheckoutDate())
                        .queryParam("room_number", hotelIntegrationRequest.getRoomNumber())
                        .queryParam("filter_by_currency", hotelIntegrationRequest.getFilterByCurrency())
                        .queryParam("dest_type", hotelIntegrationRequest.getDestType())
                        .queryParam("locale", hotelIntegrationRequest.getLocale())
                        .queryParam("checkin_date", hotelIntegrationRequest.getCheckinDate())
                        .queryParam("adults_number", hotelIntegrationRequest.getAdultsNumber())
                        .queryParam("order_by", hotelIntegrationRequest.getOrderBy())
                        .queryParam("units", hotelIntegrationRequest.getUnits())
                        .queryParam("dest_id", hotelIntegrationRequest.getDestId())
                        .build())
                .retrieve()
                .bodyToMono(HotelIntegrationResponse.class);
    }
}
