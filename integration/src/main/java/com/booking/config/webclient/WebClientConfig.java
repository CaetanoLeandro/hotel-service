package com.booking.config.webclient;

import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

import static org.springframework.http.HttpHeaders.CONTENT_TYPE;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@AllArgsConstructor
@Configuration
public class WebClientConfig {

    @Bean
    public WebClient webClient(){
        return WebClient.builder()
                .baseUrl("https://booking-com.p.rapidapi.com")
                .defaultHeader(CONTENT_TYPE, APPLICATION_JSON_VALUE)
                .defaultHeader("x-rapidapi-host", "booking-com.p.rapidapi.com")
                .defaultHeader("x-rapidapi-key", "4d2d008aa4mshc6fa0920d106076p1557fejsnadbec0d7bcf3")
                .build();
    }
}
