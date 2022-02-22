package com.booking.webclientexceptions;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class WebClientHandlerDetails {
    private String titile;
    private Integer status;
    private String details;
    private LocalDateTime timestamp;
    private String developerMessage;
}
