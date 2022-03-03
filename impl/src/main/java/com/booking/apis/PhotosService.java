package com.booking.apis;

import com.booking.apis.photos.model.PhotosApi;
import com.booking.apis.photos.model.request.PhotoRequest;
import com.booking.apis.photos.model.response.PhotoResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
@AllArgsConstructor
public class PhotosService {

    private final PhotosApi photosApi;

    public Flux<PhotoResponse> find(PhotoRequest photoRequest){
        return photosApi.getPhotos(photoRequest);
    }
}
