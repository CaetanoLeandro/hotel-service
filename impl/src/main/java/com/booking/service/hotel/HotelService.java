package com.booking.service.hotel;

import com.booking.hotel.HotelIntegration;
import com.booking.hotel.model.request.HotelIntegrationRequest;
import com.booking.hotel.model.response.HotelIntegrationResponse;
import com.booking.hotel.model.response.Result;
import com.booking.mapper.hotel.request.HotelServiceRequestMapper;
import com.booking.mapper.hotel.response.HotelServiceResponseMapper;
import com.booking.service.hotel.model.response.HotelServiceResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import static com.booking.mapper.hotel.request.HotelServiceRequestMapper.toServiceRequest;

@AllArgsConstructor
@Service
public class HotelService {

    private final HotelIntegration hotelIntegration;
// todo
//    public Mono<HotelServiceResponse> find(HotelIntegrationRequest hotelIntegrationRequest) {
//        return hotelIntegration.getHotels(hotelIntegrationRequest)
//                .map(HotelServiceResponseMapper::toServiceResponse);
//    }
}
