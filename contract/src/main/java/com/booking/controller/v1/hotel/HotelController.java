package com.booking.controller.v1.hotel;

import com.booking.hotel.model.request.HotelIntegrationRequest;
import com.booking.hotel.model.response.HotelIntegrationResponse;
import com.booking.hotel.model.response.Result;
import com.booking.service.HotelService;
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

    private final HotelService hotelService;

    @GetMapping()
    @ResponseStatus(OK)
    public Flux<HotelIntegrationResponse> getHotel(@RequestBody HotelIntegrationRequest hotelIntegrationRequest ) {
        return hotelService.find(hotelIntegrationRequest);
    }
}
