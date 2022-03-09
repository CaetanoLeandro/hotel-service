package com.booking.controller.v1.photo;

import com.booking.controller.v1.photo.facade.PhotoControllerFacade;
import com.booking.controller.v1.photo.model.request.PhotoControllerRequest;
import com.booking.controller.v1.photo.model.response.PhotoControllerResponse;
import io.swagger.annotations.Api;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;

import static org.springframework.http.HttpStatus.OK;


@RestController
@AllArgsConstructor
@RequestMapping("/v1/photos")
@Api("Photos")
@CrossOrigin("http://localhost")
public class PhotoController {

    private final PhotoControllerFacade photoControllerFacade;

    @GetMapping
    @ResponseStatus(OK)
    public Flux<PhotoControllerResponse> getPhoto(@RequestParam Integer hotelId, @RequestHeader String locale) {
        return photoControllerFacade.find(PhotoControllerRequest.builder()
                .hotelId(hotelId)
                .locale(locale)
                .build());
    }
}
