package com.booking.hotel;

import com.booking.hotel.model.request.HotelIntegrationRequest;
import com.booking.hotel.model.response.HotelIntegrationResponse;
import com.booking.hotel.model.response.Result;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

@AllArgsConstructor
@Service
public class HotelIntegration {

    private final WebClient webClient;

    public Flux<HotelIntegrationResponse> getHotels(HotelIntegrationRequest hotelIntegrationRequest) {
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
                .bodyToFlux(HotelIntegrationResponse.class);
    }
}
