package com.booking.controller.v1.photo.mapper.response;

import com.booking.controller.v1.photo.model.response.PhotoControllerResponse;
import com.booking.photo.model.response.PhotoServiceResponse;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class PhotoControllerResponseMapper {

    public static PhotoControllerResponse toPhotoControllerResponse(PhotoServiceResponse photoServiceResponse) {
        return PhotoControllerResponse.builder()
                .photoId(photoServiceResponse.getPhotoId())
                .url1440(photoServiceResponse.getUrl1440())
                .urlMax(photoServiceResponse.getUrlMax())
                .urlSquare60(photoServiceResponse.getUrlSquare60())
                .build();
    }
}