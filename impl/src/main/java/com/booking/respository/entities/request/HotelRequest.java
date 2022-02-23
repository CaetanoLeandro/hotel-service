package com.booking.respository.entities.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class HotelRequest {

    @Id
    private String id;
    private String label;
    private String region;
    private String cityName;
    private String country;
    private String externalDestId;

}
