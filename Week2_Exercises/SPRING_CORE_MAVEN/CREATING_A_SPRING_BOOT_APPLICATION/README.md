# Library Management Spring Boot Application

## Overview

This Spring Boot application manages a simple library system with CRUD operations for books. It uses Spring Data JPA and H2 Database for data persistence.

## Project Structure

- `src/main/java/com/library/`
  - `LibraryManagementApplication.java`: Main class to run the Spring Boot application.
  - `Book.java`: Entity class representing a book.
  - `BookRepository.java`: JPA repository interface for accessing book data.
  - `BookController.java`: REST controller for handling book-related API requests.

- `src/main/resources/`
  - `application.properties`: Configuration file for database and JPA settings.
  - `data.sql`: Optional SQL script to pre-load data into the H2 database.

## Setup

1. **Clone the repository**:
    ```bash
    git clone https://github.com/yourusername/LibraryManagement.git
    ```

2. **Navigate to the project directory**:
    ```bash
    cd LibraryManagement
    ```

3. **Build the project**:
    ```bash
    mvn clean install
    ```

4. **Run the application**:
    ```bash
    mvn spring-boot:run
    ```

5. **Access H2 Console** (optional):
   - Navigate to [http://localhost:8080/h2-console](http://localhost:8080/h2-console)
   - JDBC URL: `jdbc:h2:mem:testdb`
   - User: `sa`
   - Password: `password`

## API Endpoints

- **GET /books**: Retrieve all books
- **GET /books/{id}**: Retrieve a book by ID
- **POST /books**: Create a new book
- **PUT /books/{id}**: Update a book by ID
- **DELETE /books/{id}**: Delete a book by ID

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
