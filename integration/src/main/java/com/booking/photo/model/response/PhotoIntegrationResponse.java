package com.booking.photo.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class PhotoIntegrationResponse {

    @JsonProperty("photo_id")
    private Integer photoId;
    @JsonProperty("url_square60")
    private String urlSquare60;
    @JsonProperty("url_max")
    private String urlMax;
    @JsonProperty("url_1440")
    private String url1440;
}
