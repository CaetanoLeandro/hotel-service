package com.booking.apis;

import com.booking.apis.searchlocation.SearchLocationApi;
import com.booking.apis.searchlocation.model.request.SearchLocationRequest;
import com.booking.apis.searchlocation.model.response.SearchLocationResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
@AllArgsConstructor
public class LocationService {

    private final SearchLocationApi locationApi;

    public Flux<SearchLocationResponse> find(SearchLocationRequest searchLocationRequest) {
        return locationApi.getLocation(searchLocationRequest);
    }

}
