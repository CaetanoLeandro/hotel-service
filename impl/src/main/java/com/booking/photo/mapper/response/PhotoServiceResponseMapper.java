package com.booking.photo.mapper.response;

import com.booking.photo.model.response.PhotoIntegrationResponse;
import com.booking.photo.model.response.PhotoServiceResponse;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class PhotoServiceResponseMapper {

    public static PhotoServiceResponse toPhotoServiceResponse(PhotoIntegrationResponse photoIntegrationResponse) {
        return PhotoServiceResponse.builder()
                .photoId(photoIntegrationResponse.getPhotoId())
                .url1440(photoIntegrationResponse.getUrl1440())
                .urlMax(photoIntegrationResponse.getUrlMax())
                .urlSquare60(photoIntegrationResponse.getUrlSquare60())
                .build();
    }
}