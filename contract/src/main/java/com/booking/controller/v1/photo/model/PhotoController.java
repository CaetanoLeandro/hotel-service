package com.booking.controller.v1.photo.model;

import com.booking.apis.PhotosService;
import com.booking.apis.photos.model.request.PhotoRequest;
import com.booking.apis.photos.model.response.PhotoResponse;
import io.swagger.annotations.Api;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;

import static org.springframework.http.HttpStatus.OK;


@RestController
@AllArgsConstructor
@RequestMapping("/photos")
@Api("Photos")
@CrossOrigin("http://localhost")
public class PhotoController {

    private final PhotosService photosService;

    @GetMapping
    @ResponseStatus(OK)
    public Flux<PhotoResponse> getPhoto(@RequestParam Integer hotelId, @RequestHeader String locale) {
        return photosService.find(PhotoRequest.builder()
                .hotelId(hotelId)
                .locale(locale)
                .build());
    }
}
