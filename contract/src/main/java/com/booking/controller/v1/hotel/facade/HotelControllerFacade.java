package com.booking.controller.v1.hotel.facade;

import com.booking.controller.v1.hotel.mapper.response.HotelControllerResponseMapper;
import com.booking.controller.v1.hotel.model.request.HotelControllerRequest;
import com.booking.controller.v1.hotel.model.response.ResultControllerResponse;
import com.booking.hotel.facade.HotelServiceFacade;
import com.booking.hotel.model.response.PriceBreakDownService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

import static com.booking.controller.v1.hotel.mapper.request.HotelControllerRequestMapper.mapperHotelToService;

@Component
@AllArgsConstructor
public class HotelControllerFacade {

    private final HotelServiceFacade hotelServiceFacade;

    public Flux<ResultControllerResponse> find(HotelControllerRequest hotelControllerRequest) {
        return hotelServiceFacade.find(mapperHotelToService(hotelControllerRequest))
                .map(resultServiceResponse ->
                        HotelControllerResponseMapper.mapToResultResponse(resultServiceResponse,
                                PriceBreakDownService.builder()
                                        .grossPrice(resultServiceResponse.getPriceBreakDown().getGrossPrice())
                                        .currency(resultServiceResponse.getPriceBreakDown().getCurrency())
                                        .sumeXcludedraw(resultServiceResponse.getPriceBreakDown().getSumeXcludedraw())
                                        .hasinCalculableCharges(
                                                resultServiceResponse.getPriceBreakDown().getHasinCalculableCharges())
                                        .build()));
    }
}