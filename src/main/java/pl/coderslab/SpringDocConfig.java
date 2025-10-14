package pl.coderslab;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springdoc.core.models.GroupedOpenApi;

/**
 * PUBLIC_INTERFACE
 * Springdoc OpenAPI configuration replacing Springfox Swagger for Spring Boot 3.
 * Provides grouped API documentation accessible via /swagger-ui.html and /v3/api-docs.
 */
@Configuration
public class SpringDocConfig {

    // PUBLIC_INTERFACE
    @Bean
    public GroupedOpenApi publicApi() {
        /** Configure OpenAPI group for all application endpoints. */
        return GroupedOpenApi.builder()
                .group("crm")
                .pathsToMatch("/**")
                .build();
    }
}
