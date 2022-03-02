package com.booking.controller.v1.location;

import com.booking.controller.v1.location.model.response.LocationResponse;
import com.booking.location.model.request.LocationIntegrationRequest;
import com.booking.location.model.response.LocationIntegrationResponse;
import com.booking.service.LocationService;
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
    public Flux<LocationIntegrationResponse> get2(@RequestParam String name, @RequestHeader String locale) {
        return locationService.find(
                LocationIntegrationRequest.builder()
                        .name(name)
                        .locale(locale)
                        .build());
    }

    @GetMapping("/localizacao")
    public Flux<LocationIntegrationResponse> get(@RequestParam String name, @RequestHeader String locale) {
        return locationService.find(
                LocationIntegrationRequest.builder()
                        .name(name)
                        .locale(locale)
                        .build());
    }
}