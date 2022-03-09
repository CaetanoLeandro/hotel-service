package com.booking.hotel.facade;

import com.booking.hotel.service.HotelService;
import com.booking.hotel.mapper.request.HotelServiceRequestMapper;
import com.booking.hotel.model.request.HotelServiceRequest;
import com.booking.hotel.model.response.ResultServiceResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

@Component
@AllArgsConstructor
public class HotelServiceFacade {

    private final HotelService hotelService;

    public Flux<ResultServiceResponse> find(HotelServiceRequest hotelServiceRequest) {
        return hotelService.find(HotelServiceRequestMapper.toHotelIntegrationRequest(hotelServiceRequest));
    }
}
