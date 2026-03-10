# Secure Hospital Management System

A secure backend REST API for a Hospital Management System built using **Spring Boot, Spring Security, JWT Authentication, and OAuth2 Login (Google & GitHub)**.

This project demonstrates modern backend authentication and authorization architecture used in production systems.

---

# Features

- JWT-based Authentication
- OAuth2 Login (Google & GitHub)
- Role-Based Access Control (RBAC)
- Secure REST APIs
- Spring Security Integration
- PostgreSQL Database Integration
- DTO-based API architecture
- Global Exception Handling
- Environment variable configuration using `.env`

---

# Tech Stack

## Backend
- Java 21
- Spring Boot 3
- Spring Security
- OAuth2 Client
- JWT (jjwt)

## Database
- PostgreSQL
- Spring Data JPA
- Hibernate

## Tools
- Maven
- Lombok
- ModelMapper
- Git & GitHub

---

# Project Structure

```
src/main/java/com/codingshuttle/youtube

config
controller
dto
entity
repository
security
service
error
```

### Layer Explanation

**Controller**
Handles REST API endpoints.

**Service**
Contains the business logic of the application.

**Repository**
Handles database interaction using Spring Data JPA.

**Security**
Contains JWT authentication, OAuth2 configuration, and security filters.

**DTO**
Used for transferring data between client and server.

**Error**
Contains global exception handling.

---

# Authentication System

This project supports two authentication methods.

## JWT Authentication

Users can authenticate and receive a JWT token.

Example request header:

```
Authorization: Bearer <JWT_TOKEN>
```

Spring Security validates the token before granting access to protected APIs.

---

## OAuth2 Login

Supported providers:

- Google
- GitHub

Login URLs:

```
/oauth2/authorization/google
/oauth2/authorization/github
```

After successful login, Spring Security authenticates the user.

---

# Database Setup

PostgreSQL is used as the database.

Create the database:

```
CREATE DATABASE hospitalDB;
```

---

# Environment Variables

Create a `.env` file in the project root.

Example:

```
DB_USERNAME=postgres
DB_PASSWORD=postgres

GOOGLE_CLIENT_ID=your_google_client_id
GOOGLE_CLIENT_SECRET=your_google_client_secret

GITHUB_CLIENT_ID=your_github_client_id
GITHUB_CLIENT_SECRET=your_github_client_secret

JWT_SECRET=your_secret_key
```

⚠️ `.env` is ignored from GitHub for security.

---

# Running the Project

Clone the repository:

```
git clone https://github.com/Ravindrabijarniya/secure-hospital-management.git
```

Go to the project folder:

```
cd secure-hospital-management
```

Run the application:

```
mvn spring-boot:run
```

Application will start at:

```
http://localhost:8080
```

---

# API Base Path

```
/api/v1
```

---

# Security Flow

1. User logs in via OAuth2 or credentials.
2. Spring Security authenticates the user.
3. JWT token is generated.
4. Client includes JWT token in request headers.
5. Spring Security validates the token before allowing access to APIs.

---

# Future Improvements

- Docker containerization
- Swagger API documentation
- Redis caching
- Microservices architecture
- CI/CD pipeline using GitHub Actions
- Admin dashboard for hospital management

---

# Author

**Ravindra Bijarniya**

B.Tech Civil Engineering  
Indian Institute of Engineering Science and Technology, Shibpur

Backend Developer  
Java | Spring Boot | REST APIs

---

# License

This project is for learning and demonstration purposes.
