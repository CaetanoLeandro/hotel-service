package com.booking.hotel.service;

import com.booking.hotel.HotelIntegration;
import com.booking.hotel.mapper.response.HotelServiceResponseMapper;
import com.booking.hotel.model.request.HotelIntegrationRequest;
import com.booking.hotel.model.response.HotelIntegrationResponse;
import com.booking.hotel.model.response.PriceBreakDownIntegration;
import com.booking.hotel.model.response.ResultIntegration;
import com.booking.hotel.model.response.ResultServiceResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.util.List;

@AllArgsConstructor
@Service
public class HotelService {

    private final HotelIntegration hotelIntegration;

    public Flux<ResultServiceResponse> find(HotelIntegrationRequest hotelIntegrationRequest) {

        return hotelIntegration.getHotels(hotelIntegrationRequest)
                .map(HotelIntegrationResponse::getResult)
                .flatMapMany((List<ResultIntegration> results) -> Flux.fromStream(results.stream()))
                .map(resultIntegration ->
                        HotelServiceResponseMapper.mapToResultResponse(resultIntegration,
                                PriceBreakDownIntegration.builder()
                                        .grossPrice(resultIntegration.getPriceBreakDown().getGrossPrice())
                                        .currency(resultIntegration.getPriceBreakDown().getCurrency())
                                        .sumeXcludedraw(resultIntegration.getPriceBreakDown().getSumeXcludedraw())
                                        .hasinCalculableCharges(
                                                resultIntegration.getPriceBreakDown().getHasinCalculableCharges())
                                        .build()));
    }
}