package com.booking.entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Document ("location")
public class LocationEntity {
    private String destId;
    private String label;
    private String region;
    private String cityName;
    private String country;
}
