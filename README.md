# Movie Management System - Spring Boot REST API

## Project Overview
The **Movie Management System** is a REST API developed using Spring Boot to manage movie data efficiently. It provides a suite of functionalities for performing CRUD (Create, Read, Update, Delete) operations on movie records while adhering to RESTful principles. The system ensures a seamless and scalable experience for developers and API consumers.

## **Features**
- **Create Users:** Add new users with details such as name, email, and phone number.
- **Retrieve Users:** Fetch user details by ID or retrieve a list of all users.
- **Update Users:** Modify existing user information.
- **Delete Users:** Remove user records from the system.
- **Consistent Error Handling:** Includes custom exceptions for improved error tracking.
- **Standardized Response Structure:** Ensures clarity and consistency for API consumers.

## Technologies Used
- **Framework**: Spring Boot
- **Language**: Java
- **Database**: MySQL Database
- **ORM Tool**: Spring Data JPA
- **Build Tool**: Maven

## **Project Structure**
```plaintext
src/main/java
├── com.spring.rest.mms
│   ├── controller   # REST controllers
│   ├── Entity       # Entity classes
│   ├── repository   # JPA repositories
│   ├── service      # Business logic
│   ├── exception    # Custom exceptions
│   ├── util         # Utility classes
