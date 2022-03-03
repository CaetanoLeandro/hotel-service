package com.booking.service.hotel.facade;

import com.booking.hotel.model.request.HotelIntegrationRequest;
import com.booking.service.hotel.HotelService;
import com.booking.service.hotel.model.response.HotelServiceResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

@Component
@AllArgsConstructor
public class HotelServiceFacade {

    private final HotelService hotelService;

    public Mono<HotelServiceResponse> find(HotelIntegrationRequest hotelIntegrationRequest) {
        return hotelService.find(hotelIntegrationRequest);
    }
}
