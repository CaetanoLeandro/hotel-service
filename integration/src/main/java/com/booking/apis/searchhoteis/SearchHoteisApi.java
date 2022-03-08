package com.booking.apis.searchhoteis;

import com.booking.apis.searchhoteis.model.request.SearchHoteisRequest;
import com.booking.apis.searchhoteis.model.response.SearchHoteisResponse;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

public class SearchHoteisApi {
    private WebClient webClient;

    public Flux<SearchHoteisResponse> getLocation(SearchHoteisRequest searchHoteisRequest) {
        return webClient.get()
                .uri(uriBuilder -> uriBuilder
                        .path("v1/hotels/search")
                        .queryParam("")
                        .queryParam("room_number", searchHoteisRequest.getRoomNumber())
                        .queryParam("checkout_date", searchHoteisRequest.getCheckoutDate())
                        .queryParam("filter_by_currency", searchHoteisRequest.getFilterByCurrency())
                        .queryParam("dest_type", searchHoteisRequest.getDestType())
                        .queryParam("locale", searchHoteisRequest.getLocale())
                        .queryParam("checkinDate", searchHoteisRequest.getCheckinDate())
                        .queryParam("adultsNumber", searchHoteisRequest.getAdultsNumber())
                        .queryParam("orderBy", searchHoteisRequest.getOrderBy())
                        .queryParam("units", searchHoteisRequest.getUnits())
                        .queryParam("dest_id", searchHoteisRequest.getDestId())
                        .build())
                .retrieve()
                .bodyToFlux(SearchHoteisResponse.class);
    }
}
