package com.booking.service.hotel.facade;

import com.booking.service.hotel.HotelService;
import com.booking.service.hotel.model.request.HotelServiceRequest;
import com.booking.service.hotel.model.response.ResultServiceResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

import static com.booking.service.hotel.mapper.request.HotelServiceRequestMapper.toHotelIntegrationRequest;

@Component
@AllArgsConstructor
public class HotelServiceFacade {

    private final HotelService hotelService;

    public Flux<ResultServiceResponse> find(HotelServiceRequest hotelServiceRequest) {
        return hotelService.find(toHotelIntegrationRequest(hotelServiceRequest));
    }
}
