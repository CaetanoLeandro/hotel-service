package com.booking.controller.v1.photo.model.response;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class PhotoControllerResponse {

    private Integer photoId;
    private String urlSquare60;
    private String urlMax;
    private String url1440;
}
