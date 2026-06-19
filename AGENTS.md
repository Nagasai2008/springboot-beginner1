# AGENTS

## Purpose
This file helps AI coding agents understand the current repository structure, build commands, and project conventions.

## Project overview
- A minimal Spring Boot application using Java 21 and Spring Boot 4.0.7.
- Main application class: `src/main/java/com/nagasai/Springboot/SpringbootApplication.java`.
- A simple model class exists in `src/main/java/models/User.java`.
- Static UI assets are served from `src/main/resources/static`.
- Application configuration is in `src/main/resources/application.properties`.

## Build and run
- Build: `./mvnw clean package`
- Run tests: `./mvnw test`
- Start locally: `./mvnw spring-boot:run`

## Key conventions
- Preserve the existing package structure: `com.nagasai.Springboot` for application code.
- Avoid renaming the main package unless the user explicitly requests it.
- Keep static resource changes separate from backend logic changes when possible.

## Notes for agents
- The repository currently has no controller classes or REST endpoints defined.
- The `User` model is incomplete and appears to be a beginner implementation; use care when modifying it.
- The project includes SpringDoc OpenAPI dependency, so generate or extend API documentation accordingly if controllers are added.

## Useful files
- `README.md` — minimal project description.
- `pom.xml` — Maven dependencies, Java version, and build configuration.
- `src/main/resources/application.properties` — Spring Boot config.
