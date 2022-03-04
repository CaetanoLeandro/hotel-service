package com.booking.controller.v1.hotel.facade;

import com.booking.controller.v1.hotel.model.response.HotelControllerResponse;
import com.booking.service.hotel.facade.HotelServiceFacade;
import com.booking.service.hotel.model.request.HotelServiceRequest;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

@Component
@AllArgsConstructor
public class HotelControllerFacade {

    private final HotelServiceFacade hotelServiceFacade;
// todo
//    public Mono<HotelControllerResponse> find(HotelServiceRequest hotelServiceRequest) {
//        return hotelServiceFacade.find(hotelServiceRequest)
//                .map(mapper::metodoMapper);
//    }
}
