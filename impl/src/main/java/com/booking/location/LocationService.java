package com.booking.location;

import com.booking.location.model.request.SearchLocationRequest;
import com.booking.location.model.response.SearchLocationResponse;
import com.booking.respository.entities.response.HotelResponse;
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
