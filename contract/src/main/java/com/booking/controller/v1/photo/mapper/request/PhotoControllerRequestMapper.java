package com.booking.controller.v1.photo.mapper.request;

import com.booking.controller.v1.photo.model.request.PhotoControllerRequest;
import com.booking.photo.model.request.PhotoServiceRequest;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.Optional;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class PhotoControllerRequestMapper {

    public static PhotoServiceRequest toPhotoServiceRequest(PhotoControllerRequest photoControllerRequest) {
        return Optional.ofNullable(photoControllerRequest)
                .map(photo -> PhotoServiceRequest.builder()
                        .locale(photo.getLocale())
                        .hotelId(photo.getHotelId())
                        .build())
                .orElse(null);
    }
}