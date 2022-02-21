<<<<<<< HEAD:integration/src/main/java/com/booking/config/model/LocationIntegration.java
package com.booking.config.model;
=======
package com.booking.location.model.request;
>>>>>>> ce0cbc6... atualizou as classes:integration/src/main/java/com/booking/location/model/request/LocationIntegrationRequest.java

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class LocationIntegration {

    private String locale;
    private String name;
}
