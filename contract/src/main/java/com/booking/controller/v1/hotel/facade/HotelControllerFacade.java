package com.booking.controller.v1.hotel.facade;

import com.booking.controller.v1.hotel.mapper.response.HotelControllerResponseMapper;
import com.booking.controller.v1.hotel.model.request.HotelControllerRequest;
import com.booking.controller.v1.hotel.model.response.HotelControllerResponse;
import com.booking.controller.v1.hotel.model.response.ResultControllerResponse;
import com.booking.service.hotel.facade.HotelServiceFacade;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

import static com.booking.controller.v1.hotel.mapper.request.HotelControllerRequestMapper.mapperHotelToService;
import static com.booking.controller.v1.hotel.mapper.response.HotelControllerResponseMapper.mapperToResultResponse;
import static com.booking.controller.v1.hotel.mapper.response.HotelControllerResponseMapper.toHotelControllerResponse;

@Component
@AllArgsConstructor
public class HotelControllerFacade {

    private final HotelServiceFacade hotelServiceFacade;

    public Mono<ResultControllerResponse> find(HotelControllerRequest hotelControllerRequest) {
        return hotelServiceFacade.find(mapperHotelToService(hotelControllerRequest))
                .map(HotelControllerResponseMapper::mapperToResultResponse);
    }
}
