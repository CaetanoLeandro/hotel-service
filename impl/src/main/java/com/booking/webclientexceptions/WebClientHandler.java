package com.booking.webclientexceptions;

import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

@RestControllerAdvice
public class WebClientHandler {

    public WebClientHandlerDetails webClientException(WebClientException e) {
        return WebClientHandlerDetails.builder()
                .timestamp(LocalDateTime.now().truncatedTo(ChronoUnit.SECONDS))
                .status
                .build();
    }

}

