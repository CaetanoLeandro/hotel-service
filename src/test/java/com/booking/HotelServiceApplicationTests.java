package com.booking;

import com.booking.controller.v1.hotel.HotelController;
import com.booking.controller.v1.hotel.facade.HotelControllerFacade;
import com.booking.controller.v1.hotel.model.request.HotelControllerRequest;
import com.booking.controller.v1.hotel.model.response.PriceBreakDownController;
import com.booking.controller.v1.hotel.model.response.ResultControllerResponse;
import com.booking.hotel.model.request.HotelIntegrationRequest;
import com.booking.hotel.model.response.PriceBreakDownIntegration;
import com.booking.hotel.model.response.ResultIntegration;
import com.booking.service.hotel.facade.HotelServiceFacade;
import com.booking.service.hotel.model.request.HotelServiceRequest;
import com.booking.service.hotel.model.response.PriceBreakDownService;
import com.booking.service.hotel.model.response.ResultServiceResponse;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.reactive.server.WebTestClient;
import reactor.core.publisher.Flux;

import java.util.List;

import static com.booking.common.Currency.CZK;
import static org.springframework.http.HttpMethod.GET;

@WebFluxTest
@ContextConfiguration(classes = {HotelController.class, HotelControllerFacade.class, HotelServiceFacade.class})
class HotelServiceApplicationTests {

    @Autowired
    WebTestClient webTestClient;

    @MockBean
    HotelServiceFacade hotelServiceFacade;

    @Test
    void whenFindHotelShouldReturnListOfHotels() throws Exception{

        HotelServiceRequest hotelServiceRequest = HotelServiceRequest.builder()
                .adultsNumber(2)
                .checkinDate("2022-08-05")
                .checkoutDate("2022-08-06")
                .destId("-553173")
                .destType("city")
                .filterByCurrency("AED")
                .locale("en-gb")
                .orderBy("popularity")
                .roomNumber(1)
                .units("metric")
                .build();


        HotelIntegrationRequest hotelIntegrationRequest = HotelIntegrationRequest.builder()
                .adultsNumber(2)
                .checkinDate("2022-08-05")
                .checkoutDate("2022-08-06")
                .destId("-553173")
                .destType("city")
                .filterByCurrency("AED")
                .locale("en-gb")
                .orderBy("popularity")
                .roomNumber(1)
                .units("metric")
                .build();

        ResultServiceResponse resultServiceResponse = ResultServiceResponse.builder()
                .hotelIncludeBreakfast(false)
                .hotelName("Stages Hotel Prague, a Tribute Portfolio Hotel")
                .city("Prague")
                .countryTrans("Czech Republic")
                .address("Ceskomoravska 19a")
                .reviewScore("9.3")
                .classHotel(4)
                .reviewScoreWord("Superb")
                .unitConfigurationLabel("Standard Twin Room with Courtyard View<br/><b>Hotel room</b>: 2 beds")
                .priceBreakDown(
                        PriceBreakDownService.builder()
                                .grossPrice(2245.0)
                                .currency(CZK)
                                .sumeXcludedraw(0.0)
                                .hasinCalculableCharges(0)
                                .build())
                .build();

        ResultControllerResponse resultExpected = ResultControllerResponse.builder()
                .hotelIncludeBreakfast(false)
                .hotelName("Stages Hotel Prague, a Tribute Portfolio Hotel")
                .city("Prague")
                .countryTrans("Czech Republic")
                .address("Ceskomoravska 19a")
                .reviewScore("9.3")
                .classHotel(4)
                .reviewScoreWord("Superb")
                .unitConfigurationLabel("Standard Twin Room with Courtyard View<br/><b>Hotel room</b>: 2 beds")
                .priceBreakDown(
                        PriceBreakDownController.builder()
                                .grossPrice(2245.0)
                                .currency(CZK)
                                .sumeXcludedraw(0.0)
                                .hasinCalculableCharges(0)
                                .build())
                .build();

        Mockito.when(hotelServiceFacade.find(hotelServiceRequest)).thenReturn(Flux.just(resultServiceResponse));

        webTestClient.method(GET)
                .uri(uriBuilder -> uriBuilder.path("/v1/hotels/")
                        .queryParam("checkoutDate", hotelIntegrationRequest.getCheckoutDate())
                        .queryParam("roomNumber", hotelIntegrationRequest.getRoomNumber())
                        .queryParam("filterByCurrency", hotelIntegrationRequest.getFilterByCurrency())
                        .queryParam("destType", hotelIntegrationRequest.getDestType())
                        .queryParam("locale", hotelIntegrationRequest.getLocale())
                        .queryParam("checkinDate", hotelIntegrationRequest.getCheckinDate())
                        .queryParam("adultsNumber", hotelIntegrationRequest.getAdultsNumber())
                        .queryParam("orderBy", hotelIntegrationRequest.getOrderBy())
                        .queryParam("units", hotelIntegrationRequest.getUnits())
                        .queryParam("destId", hotelIntegrationRequest.getDestId())
                        .build())
                .exchange()
                .expectStatus()
                .is2xxSuccessful()
                .expectBodyList(ResultControllerResponse.class)
                .isEqualTo(List.of(resultExpected));

    }

}