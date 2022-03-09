package com.booking.photo.service;

import com.booking.photo.PhotosIntegration;
import com.booking.photo.model.request.PhotoIntegrationRequest;
import com.booking.photo.mapper.response.PhotoServiceResponseMapper;
import com.booking.photo.model.response.PhotoServiceResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
@AllArgsConstructor
public class PhotoService {

    private final PhotosIntegration photosIntegration;

    public Flux<PhotoServiceResponse> find(PhotoIntegrationRequest photoRequest){
        return photosIntegration.getPhotos(photoRequest)
                .map(PhotoServiceResponseMapper::toPhotoServiceResponse);
    }
}
