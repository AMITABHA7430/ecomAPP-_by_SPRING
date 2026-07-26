# 🛒 E-Commerce Backend API

A backend application for an E-Commerce platform built using **Java** and **Spring Boot**. This project provides RESTful APIs for managing products and demonstrates CRUD operations, search functionality, and database integration.

> **Note:** The backend was developed by me. An existing React frontend was used to test and integrate the REST APIs.

---

## 📌 Features

- 📦 Create, Read, Update and Delete (CRUD) Products
- 🔍 Search Products by keyword
- 🗄️ Database integration using Spring Data JPA
- 🔗 RESTful API development
- ⚡ Frontend and Backend integration
- 🏗️ Layered Architecture (Controller → Service → Repository)

---

## 🛠️ Tech Stack

### Backend
- Java
- Spring Boot
- Spring Data JPA
- Hibernate
- Maven
- H2 Database

### Frontend (Used for Integration)
- React (Vite)
- Axios

### Tools
- IntelliJ IDEA
- VS Code
- Postman
- Git & GitHub

---

## 📂 Project Structure

```
backend/
│── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── controller/
│   │   │   ├── model/
│   │   │   ├── repo/
│   │   │   ├── services/
│   │   │   └── DemoApplication.java
│   │   └── resources/
│   └── test/
│
├── pom.xml
└── mvnw
```

---

## 🚀 Getting Started

### Clone the Repository

```bash
git clone https://github.com/AMITABHA7430/ecomAPP_by_SPRING.git
```

### Navigate to the Backend

```bash
cd backend/demo
```

### Run the Application

```bash
mvn spring-boot:run
```

The backend will start on:

```
http://localhost:8080
```

---

## 📡 REST API Endpoints

| Method | Endpoint | Description |
|---------|----------|-------------|
| GET | `/products` | Retrieve all products |
| GET | `/product/{id}` | Retrieve product by ID |
| POST | `/product` | Add a new product |
| PUT | `/product/{id}` | Update an existing product |
| DELETE | `/product/{id}` | Delete a product |
| GET | `/products/search?keyword=` | Search products |

---

## 🎥 Demo

A demonstration video of the application is included in this repository.

---

## 📚 Key Learnings

- Building REST APIs with Spring Boot
- Spring MVC Architecture
- CRUD Operations using Spring Data JPA
- Database Integration with Hibernate
- Frontend–Backend Communication using REST APIs
- Maven Project Structure
- Git & GitHub Version Control

---

## 🚀 Future Improvements

- JWT Authentication & Authorization
- MySQL/PostgreSQL Integration
- Product Image Upload
- User Authentication
- Shopping Cart Persistence
- Order Management
- Wishlist
- Pagination & Sorting
- Docker Deployment

---

## 👨‍💻 Author

**Amitabha Ghosh**

- GitHub: https://github.com/AMITABHA7430
- LinkedIn:(https://www.linkedin.com/posts/amitabha-ghosh-bb132b313_java-springboot-reactjs-ugcPost-7487262527488229376-8fCy/?utm_source=share&utm_medium=member_desktop&rcm=ACoAAE-axvUBp28ZP7XKt1IHWI-InYwu486PMww)

---

⭐ If you found this project useful, consider giving it a star.
