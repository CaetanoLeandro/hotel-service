package com.booking.controller.v1.hotel;

import com.booking.controller.v1.hotel.facade.HotelControllerFacade;
import com.booking.controller.v1.hotel.model.request.HotelControllerRequest;
import com.booking.controller.v1.hotel.model.response.ResultControllerResponse;
import io.swagger.annotations.Api;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;

import static org.springframework.http.HttpStatus.OK;

@AllArgsConstructor
@RestController
@RequestMapping("/v1/hotels")
@Api("Hotels")
@CrossOrigin("http://localhost")
public class HotelController {

    private final HotelControllerFacade hotelControllerFacade;

    @GetMapping()
    @ResponseStatus(OK)
    public Flux<ResultControllerResponse> getHotel(@RequestBody HotelControllerRequest hotelControllerRequest) {
        return hotelControllerFacade.find(hotelControllerRequest);
    }
}
