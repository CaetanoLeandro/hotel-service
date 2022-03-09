package com.booking.photo.mapper.request;

import com.booking.photo.model.request.PhotoIntegrationRequest;
import com.booking.photo.model.request.PhotoServiceRequest;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.Optional;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class PhotoServiceRequestMapper {

    public static PhotoIntegrationRequest toPhotoIntegrationRequest(PhotoServiceRequest photoServiceRequest) {
        return Optional.ofNullable(photoServiceRequest)
                .map(photo -> PhotoIntegrationRequest.builder()
                        .locale(photo.getLocale())
                        .hotelId(photo.getHotelId())
                        .build())
                .orElse(null);
    }
}
