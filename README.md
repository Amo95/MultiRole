# Multi-Role User Management API

This Spring Boot application provides a RESTful API for user management with role-based access control.

## Features

- User registration (public access)
- User retrieval (individual and paginated list)
- User update and deletion (admin access)
- HATEOAS-compliant responses
- Paginated results for user listing

## Endpoints

- `POST /api/public/register`: Register a new user
- `GET /api/admin/users`: Get all users (paginated, admin access)
- `GET /api/user/{id}`: Get user by ID
- `PUT /api/admin/users/{id}`: Update user (admin access)
- `DELETE /api/admin/users/{id}`: Delete user (admin access)

## Technologies

- Spring Boot
- Spring Security
- Spring Data JPA
- Spring HATEOAS
- JSON Web Tokens (JWT)

## Setup

1. Clone the repository
2. Configure your database in `application.properties`
3. Run the application using `./gradlew bootRun`

## API Documentation

API documentation is available via SpringDoc OpenAPI. Access it at `/swagger-ui.html` when running the application.

## Testing

Run tests using `./gradlew test`

## License

[Add your license information here]