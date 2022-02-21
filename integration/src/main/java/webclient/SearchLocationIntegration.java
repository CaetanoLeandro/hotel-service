package webclient;

import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

import static org.springframework.http.HttpHeaders.CONTENT_TYPE;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@Configuration
@AllArgsConstructor
public class SearchLocationIntegration {

    @Bean
    public WebClient webClient(){
        return WebClient.builder()
                .baseUrl("https://booking-com.p.rapidapi.com")
                .defaultHeader("x-rapidapi-host: booking-com.p.rapidapi.com",
                        "x-rapidapi-key: d9b7923726msha973cbca83399e5p163066jsne50cc763cc8b")
                .defaultHeader(CONTENT_TYPE, APPLICATION_JSON_VALUE)
                .build();
    }
}
