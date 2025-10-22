# CRM - Customer Relationship Managment

Simple CRM system, made as a final project for Java coding bootcamp in CodersLab.

Technologies used: Java 8, Spring Boot, Spring MVC, Spring Data, Hibernate, Spring Security, MySQL, Multithreading, JUnit and Thymeleaf.
Libraries used: Lombok, OpenCSV,  iText

Note: in this project a free bootstrap templete [Vali Admin](https://github.com/pratikborsadiya/vali-admin) is used.

## Main features:
- User roles: employee, manager, owner and admin
- Adding and editing users by admin
- Adding and editing clients
- Searching clients from employee city by employee
- Searching all clients in database by manager
- Import and export CSV files with clients data
- Generating contracts with client
- Accepting contracts depending on contract value and user role
- Printing PDF files
- Adding events with client
- Generating notifications for today's events
- API for clients

## Run locally

Prerequisites:
- Java 17+
- Internet access for Maven dependencies

Commands:
- Start on port 3001 (default):
  ./mvnw -DskipTests spring-boot:run

- Override port:
  ./mvnw -DskipTests spring-boot:run -Dspring-boot.run.arguments=--server.port=3001

Database:
- By default the app uses an in-memory H2 database so it can start without MySQL.
- To use MySQL, provide properties via environment variables or args, for example:
  SPRING_DATASOURCE_URL=jdbc:mysql://localhost:3306/crm \
  SPRING_DATASOURCE_USERNAME=root \
  SPRING_DATASOURCE_PASSWORD=secret \
  ./mvnw -DskipTests spring-boot:run

## Authors

Katarzyna Machowina - [machowina](https://github.com/machowina)
