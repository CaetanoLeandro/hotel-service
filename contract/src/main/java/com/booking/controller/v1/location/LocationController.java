package com.booking.controller.v1.location;

import com.booking.controller.v1.location.model.response.LocationResponse;
import com.booking.location.LocationService;
import com.booking.location.SearchLocationApi;
import com.booking.location.model.request.SearchLocationRequest;
import com.booking.location.model.response.SearchLocationResponse;
import com.booking.respository.entities.response.HotelResponse;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;

import static org.springframework.http.HttpStatus.OK;

@RestController
@AllArgsConstructor
@RequestMapping("/v1/location")
public class LocationController {

    private final LocationService locationService;
    private final SearchLocationApi searchLocationApi;


    @GetMapping
    @ResponseStatus(OK)
    public Flux<LocationResponse> getAddress(@RequestParam String name, @RequestHeader String locale) {
        return Flux.just(LocationResponse.builder()
                .destId("id")
                .cityName("Poa")
                .country("Brasil")
                .region("Sul")
                .label("Sul")
                .build());
    }

    @GetMapping("/test")
    public Flux<SearchLocationResponse> find(@RequestParam String name, @RequestHeader String locale) {
        return locationService.find(
                SearchLocationRequest.builder()
                        .name(name)
                        .locale(locale)
                        .build());
    }
}