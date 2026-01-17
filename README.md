# Game Tracker API
*REST API to manage and track your personal game library across multiple platforms.*

## Stack
- Java 21
- Spring Boot
- Spring Data JPA
- PostgreSQL
- Flyway
- Docker Compose
- Testcontainers (for integration testing)

## Getting Started 
### Prerequisites
- [Java 21](https://adoptium.net/) 
- [Maven](https://maven.apache.org/) 
- [Docker](https://www.docker.com/) 

### Running Database (Docker Compose)
Start PostgreSQL with Docker Compose:

```bash 
docker-compose up -d
```
*This will launch a PostgreSQL container on* `port 5432`.

### Running the API
Use Maven to start the Spring Boot application:

```bash
mvn spring-boot:run
```

The API will be available at:

```bash
http://localhost:8080
```

### Testing
Run tests with:

```bash
mvn test
```