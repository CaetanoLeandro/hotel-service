package com.booking.controller.v1.hotel;

import com.booking.hotel.model.request.HotelIntegrationRequest;
import com.booking.hotel.model.response.HotelIntegrationResponse;
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

    @GetMapping("/")
    @ResponseStatus(OK)
    public Flux<HotelIntegrationResponse> getHotel(@RequestParam String destId, String destType ) {
        return hotelService.find(HotelIntegrationRequest.builder()
                        .checkoutDate("2022-08-06")
                        .roomNumber(1)
                        .filterByCurrency("AED")
                        .destType("city")
                        .locale("en-gb")
                        .checkinDate("2022-08-05")
                        .adultsNumber(2)
                        .orderBy("popularity")
                        .units("metric")
                        .destId("-553173")
                .build());
    }
}
