package com.booking.service.hotel;

import com.booking.hotel.HotelIntegration;
import com.booking.hotel.model.request.HotelIntegrationRequest;
import com.booking.mapper.hotel.response.HotelServiceResponseMapper;
import com.booking.service.hotel.model.response.ResultServiceResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@AllArgsConstructor
@Service
public class HotelService {

    private final HotelIntegration hotelIntegration;

    public Mono<ResultServiceResponse> find(HotelIntegrationRequest hotelIntegrationRequest) {
        return hotelIntegration.getHotels(hotelIntegrationRequest)
                .map(HotelServiceResponseMapper::mapperToResultResponse);
    }
}
