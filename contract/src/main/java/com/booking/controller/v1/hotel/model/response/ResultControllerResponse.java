package com.booking.controller.v1.hotel.model.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class ResultControllerResponse {

    private List<HotelControllerResponse> result;

}
