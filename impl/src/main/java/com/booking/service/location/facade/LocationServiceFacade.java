package com.booking.service.location.facade;

import com.booking.location.model.request.LocationIntegrationRequest;
import com.booking.location.model.response.LocationIntegrationResponse;
import com.booking.mapper.hotel.request.HotelServiceRequestMapper;
import com.booking.mapper.location.request.LocationServiceMapper;
import com.booking.service.location.LocationService;
import com.booking.service.location.model.request.LocationServiceRequest;
import com.booking.service.location.model.response.LocationServiceResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

import static com.booking.mapper.location.request.LocationServiceMapper.toLocationIntegrationRequest;

@Component
@AllArgsConstructor
public class LocationServiceFacade {

    private final LocationService locationService;

    public Flux<LocationServiceResponse> find(LocationServiceRequest locationServiceRequest) {
        return locationService.find(toLocationIntegrationRequest(locationServiceRequest))
                .map(LocationServiceMapper :: toLocationControllerResponse);
    }

}
