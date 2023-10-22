# Backend Starter Kit

## Description

A comprehensive Spring Boot boilerplate project equipped with web, security, data JPA, actuator, and other essentials. This project serves as a foundation for various backend applications and can be easily forked and extended.

## Prerequisites

- Java 17 JDK
- Maven
- Docker
- PostgreSQL (If you're planning to use the database functionalities)

## Getting Started

### 1. Set Up Docker and PostgreSQL

#### Install Docker

If you haven't installed Docker on your Mac, download it from the official website [here](https://www.docker.com/products/docker-desktop) and install it. After installation, run Docker Desktop to ensure the Docker daemon is running.

#### Pull the PostgreSQL Docker Image

You can get the official PostgreSQL image from Docker Hub:

```bash
docker pull postgres
```

#### Run PostgreSQL in a Docker Container

Start a PostgreSQL container with the following command:

```bash
docker run --name postgres-docker -e POSTGRES_PASSWORD=pass -p 5432:5432 -d postgres
```

#### Stop and Remove the Container

To stop the container:

```bash
docker stop some-postgres
```

To remove it:

```bash
docker rm some-postgres
```

### 2. Build the Project

Build the project to fetch all dependencies and compile:

```bash
mvn clean install
```

### 3. Configure Database Connection

Update the `application.properties` with your database configurations, these next ones are the default ones and you can connect with these:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/db
spring.datasource.username=user
spring.datasource.password=pass
spring.jpa.hibernate.ddl-auto=update
```

**Note**: Ensure database security by not committing sensitive information like passwords. Use environment variables or other external configurations for sensitive data.

### 5. Run the Application

Run the application using:

```bash
mvn spring-boot:run
```

Access the application at: `http://localhost:8080/`.

## How to connect to Postgres
#### Connect to PostgreSQL

Once the container is running, connect to the PostgreSQL instance:

```bash
psql -h localhost -U postgres
```

When prompted, enter the password you set (`pass` in the example).
