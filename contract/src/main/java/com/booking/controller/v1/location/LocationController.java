package com.booking.controller.v1.location;

import com.booking.controller.v1.location.facade.LocationControllerFacade;
import com.booking.controller.v1.location.model.request.LocationControllerRequest;
import com.booking.controller.v1.location.model.response.LocationControllerResponse;
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

    private final LocationControllerFacade locationControllerFacade;

    @GetMapping()
    @ResponseStatus(OK)
    public Flux<LocationControllerResponse> get(@RequestParam String name, @RequestHeader String locale) {
        return locationControllerFacade.find(
                LocationControllerRequest.builder()
                        .name(name)
                        .locale(locale)
                        .build());
    }
}