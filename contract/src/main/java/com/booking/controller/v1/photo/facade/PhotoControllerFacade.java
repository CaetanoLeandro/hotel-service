package com.booking.controller.v1.photo.facade;

import com.booking.controller.v1.photo.mapper.response.PhotoControllerResponseMapper;
import com.booking.controller.v1.photo.model.request.PhotoControllerRequest;
import com.booking.controller.v1.photo.model.response.PhotoControllerResponse;
import com.booking.photo.facade.PhotoServiceFacade;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

import static com.booking.controller.v1.photo.mapper.request.PhotoControllerRequestMapper.toPhotoServiceRequest;

@Component
@AllArgsConstructor
public class PhotoControllerFacade {

    private PhotoServiceFacade photoServiceFacade;

    public Flux<PhotoControllerResponse> find(PhotoControllerRequest photoControllerRequest){
        return photoServiceFacade.find(toPhotoServiceRequest(photoControllerRequest))
                .map(PhotoControllerResponseMapper::toPhotoControllerResponse);
    }
}