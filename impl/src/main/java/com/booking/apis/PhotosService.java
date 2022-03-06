package com.booking.apis;

import com.booking.apis.photos.PhotosIntegration;
import com.booking.apis.photos.model.request.PhotoRequest;
import com.booking.apis.photos.model.response.PhotoResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
@AllArgsConstructor
public class PhotosService {

    private final PhotosIntegration photosIntegration;

    public Flux<PhotoResponse> find(PhotoRequest photoRequest){
        return photosIntegration.getPhotos(photoRequest);
    }
}
