package com.booking.apis;

import com.booking.apis.photos.model.request.PhotoRequest;
import com.booking.apis.photos.model.response.PhotoResponse;
import lombok.AllArgsConstructor;
import reactor.core.publisher.Flux;

@AllArgsConstructor
public class PhotoServiceFacade {

    private final PhotosService photosService;


    public Flux<PhotoResponse> find(PhotoRequest photoRequest) {
        return photosService.find(photoRequest);
    }

}
