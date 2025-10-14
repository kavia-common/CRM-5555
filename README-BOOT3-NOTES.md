# Spring Boot 3 migration notes

- Java 17 is required. This project sets `<java.version>17</java.version>`.
- Packages moved from javax.* to jakarta.*:
  - javax.validation.* -> jakarta.validation.*
  - javax.persistence.* -> jakarta.persistence.*
  - javax.servlet.* -> jakarta.servlet.*
- Security configuration class style changed to bean-based `SecurityFilterChain`. A minimal configuration is provided in `SecurityCompatibilityConfig`.
- Swagger (Springfox) is replaced by springdoc-openapi (`/swagger-ui.html`, `/v3/api-docs`).
- Thymeleaf security extras updated to `thymeleaf-extras-springsecurity6`.

If compilation errors reference javax.* packages, update imports to jakarta.* in those classes.
