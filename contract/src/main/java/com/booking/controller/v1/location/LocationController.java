package com.booking.controller.v1.location;

import com.booking.controller.v1.location.model.response.LocationResponse;
import com.booking.apis.LocationService;
import com.booking.apis.searchlocation.SearchLocationApi;
import com.booking.apis.searchlocation.model.request.SearchLocationRequest;
import com.booking.apis.searchlocation.model.response.SearchLocationResponse;
import io.swagger.annotations.Api;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;

import static org.springframework.http.HttpStatus.OK;

@RestController
@AllArgsConstructor
@RequestMapping("/v1/location")
@Api("Hotels and Towns")
@CrossOrigin("http://localhost")
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


    @GetMapping("/hotels")
    public Flux<SearchLocationResponse> get2(@RequestParam String name, @RequestHeader String locale) {
        return locationService.find(
                SearchLocationRequest.builder()
                        .name(name)
                        .locale(locale)
                        .build());
    }

    @GetMapping("/localizacao")
    public Flux<SearchLocationResponse> get(@RequestParam String name, @RequestHeader String locale) {
        return locationService.find(
                SearchLocationRequest.builder()
                        .name(name)
                        .locale(locale)
                        .build());
    }
}