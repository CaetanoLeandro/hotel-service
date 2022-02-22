package com.booking.controller.v1.location;

import com.booking.controller.v1.location.model.response.LocationResponse;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;

import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("/v1/location")
public class LocationController {

    @GetMapping
    @ResponseStatus(OK)
    public Flux<LocationResponse> getAddress(@RequestParam String name, @RequestHeader String locale){
        return Flux.just(LocationResponse.builder()
                        .destId("id")
                        .cityName("Poa")
                        .country("Brasil")
                        .region("Sul")
                        .label("Sul")
                .build());
    }

}
