package com.booking.location.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class SearchLocationResponse {

    @JsonProperty(value = "has_extended_los")
    private Integer hasExtendedLos;
    private String experiment;
    @JsonProperty(value = "max_allowed_los")
    private String maxAllowedLos;
    @JsonProperty(value = "default_los")
    private Integer defaultLos;
    @JsonProperty(value = "is_fullon")
    private Integer isFullon;
    @JsonProperty(value = "extended_los")
    private String extendedLos;
}
