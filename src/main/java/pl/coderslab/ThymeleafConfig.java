package pl.coderslab;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.thymeleaf.extras.springsecurity6.dialect.SpringSecurityDialect;

/**
 * PUBLIC_INTERFACE
 * Thymeleaf configuration to expose Spring Security 6 dialect for use in templates.
 */
@Configuration
public class ThymeleafConfig {

    // PUBLIC_INTERFACE
    @Bean
    public SpringSecurityDialect springSecurityDialect() {
        /** Dialect bean enabling sec:* attributes in Thymeleaf templates. */
        return new SpringSecurityDialect();
    }
}
