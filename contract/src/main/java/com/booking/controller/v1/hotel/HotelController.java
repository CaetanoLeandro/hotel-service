package com.booking.controller.v1.hotel;

import com.booking.controller.v1.hotel.model.request.HotelControllerRequest;
import com.booking.controller.v1.hotel.model.response.HotelControllerResponse;
import com.booking.service.hotel.facade.HotelServiceFacade;
import io.swagger.annotations.Api;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import static org.springframework.http.HttpStatus.OK;

@AllArgsConstructor
@RestController
@RequestMapping("/v1/hotels")
@Api("Hotels")
@CrossOrigin("http://localhost")
public class HotelController {

    private final HotelServiceFacade hotelServiceFacade;
// Todo
//    @GetMapping()
//    @ResponseStatus(OK)
//    public Mono<HotelControllerResponse> getHotel(@RequestBody HotelControllerRequest hotelControllerRequest) {
//        return hotelServiceFacade.find(hotelControllerRequest);
//    }
}
