package pl.coderslab;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;

/**
 * PUBLIC_INTERFACE
 * Minimal Spring Security 6 configuration to ensure application starts after Boot 3 upgrade.
 * This keeps default form login and permits Swagger UI and static resources.
 */
@Configuration
@EnableWebSecurity
public class SecurityCompatibilityConfig {

    // PUBLIC_INTERFACE
    @Bean
    public SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
        /** Basic, permissive security config for compatibility; adjust as needed for project rules. */
        http
            .authorizeHttpRequests(auth -> auth
                .requestMatchers(
                    "/swagger-ui.html",
                    "/swagger-ui/**",
                    "/v3/api-docs/**",
                    "/webjars/**",
                    "/css/**",
                    "/js/**",
                    "/images/**"
                ).permitAll()
                .anyRequest().authenticated()
            )
            .formLogin(Customizer.withDefaults())
            .logout(Customizer.withDefaults())
            .csrf(Customizer.withDefaults());
        return http.build();
    }
}
