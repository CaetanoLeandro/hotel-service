package com.booking.photo.model.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class PhotoIntegrationRequest {

    private String locale;
    private Integer hotelId;
}
