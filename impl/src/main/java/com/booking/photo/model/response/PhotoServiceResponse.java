package com.booking.photo.model.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class PhotoServiceResponse {

    private Integer photoId;
    private String urlSquare60;
    private String urlMax;
    private String url1440;
}
