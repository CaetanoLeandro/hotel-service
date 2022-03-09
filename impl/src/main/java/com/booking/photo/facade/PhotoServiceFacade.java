package com.booking.photo.facade;

import com.booking.photo.service.PhotoService;
import com.booking.photo.mapper.request.PhotoServiceRequestMapper;
import com.booking.photo.model.request.PhotoServiceRequest;
import com.booking.photo.model.response.PhotoServiceResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

@Component
@AllArgsConstructor
public class PhotoServiceFacade {

    private final PhotoService photosService;

    public Flux<PhotoServiceResponse> find(PhotoServiceRequest photoServiceRequest) {
        return photosService.find(PhotoServiceRequestMapper.toPhotoIntegrationRequest(photoServiceRequest));
    }
}
