package com.booking.service;

import com.booking.hotel.HotelIntegration;
import com.booking.hotel.model.request.HotelIntegrationRequest;
import com.booking.hotel.model.response.HotelIntegrationResponse;
import com.booking.hotel.model.response.Result;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@AllArgsConstructor
@Service
public class HotelService {

    private final HotelIntegration hotelIntegration;

    public Flux<HotelIntegrationResponse> find(HotelIntegrationRequest hotelRequest) {
        return hotelIntegration.getHotels(hotelRequest);
    }
}
