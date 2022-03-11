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
    public Flux<ResultControllerResponse> getHotel(@RequestParam Integer roomNumber, @RequestParam String checkoutDate,
                                                   @RequestParam String filterByCurrency, @RequestParam String destType,
                                                   @RequestParam String locale, @RequestParam String checkinDate,
                                                   @RequestParam Integer adultsNumber, @RequestParam String orderBy,
                                                   @RequestParam String units, @RequestParam String destId) {
        return hotelControllerFacade.find(HotelControllerRequest.builder()
                .roomNumber(roomNumber)
                .checkoutDate(checkoutDate)
                .adultsNumber(adultsNumber)
                .filterByCurrency(filterByCurrency)
                .destType(destType)
                .locale(locale)
                .checkinDate(checkinDate)
                .orderBy(orderBy)
                .units(units)
                .destId(destId)
                .build());
    }

}
