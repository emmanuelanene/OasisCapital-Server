# 🏨 OasisCapital Server – Hotel Booking Management System

OasisCapital is a robust, enterprise-grade hotel management backend that powers seamless room bookings, secure payments, and real-time notifications.  
Designed for performance, scalability, and reliability, it combines **Spring Boot’s** enterprise capabilities with **Stripe-powered payment automation** and **JWT-secured user sessions**.

💡 **OasisCapital Hotel** is a premier choice among Bali hotels — offering guests a seamless blend of comfort, style, and convenience, powered by this intelligent server platform.


---

## 🚀 Key Features
### 🧩 Core Capabilities

- **End-to-End Booking Flow** – From room selection to checkout and email confirmation
- **Secure Authentication** – JWT-based stateless sessions powered by Spring Security
- **Role-Based Access Control** – Separate access for users and administrators
- **Stripe Payments** – Integrated online payment with real-time booking updates
- **Automated Notifications** – Email confirmations for payments, bookings, and onboarding
- **Room Management System** – Advanced search, filtering, and image upload features  


---

## ⚙️ Architecture Overview
### 🏗️ System Design

OasisCapital follows a **layered architecture** with distinct, well-defined responsibilities for maintainability and scalability.

#### 🧱 High-Level Flow

```text
[ Client Application ]
         │
         ▼
[ Controller Layer ]  →  [ Service Layer ]  →  [ Repository Layer ]  →  [ MySQL Database ]
         │
         ├──► [ Security Layer (JWT) ]
         │
         └──► [ External Integrations: Stripe Payments, Email Notifications ]
```

---

## 🪄 Core Modules
- **Controllers** – REST endpoints for user, booking, and payment operations

- **Services** – Encapsulate business logic for hotel management

- **Repositories** – Handle persistence with JPA and Hibernate

- **Security** – Manages authentication, authorization, and token validation

- **Mailing & Payments** – Integrate third-party APIs like Stripe and Gmail SMTP


---


## 🧠 Technology Stack

### 🧩 Backend Framework
- **Spring Boot (Java)** – Application foundation and dependency management
- **Spring Web** – RESTful API design
- **Spring Data JPA & JDBC** – Database interaction using ORM and lightweight JDBC
- **Thymeleaf** – Dynamic server-side rendering for admin-facing views


### 🔐 Authentication & Security
- **Spring Security** – Core authentication and role-based access
- **Thymeleaf Security Extras** – Integrates security with server-rendered templates
- **JWT (JJWT)** – Stateless session management and secure API access
- **OAuth2 Client** – Third-party login (Google, GitHub) support
- **BCrypt** – Password hashing and storage security


### 🗄️ Database
- **MySQL** – Relational data storage with JPA/Hibernate ORM


### 💳 Payments
- **Stripe Java SDK** – Handles online transactions and booking-linked payments


### 📧 Mailing & Notifications
- **JavaMailSender (Spring Boot Mail)** – Sends transactional emails via Gmail SMTP
- **Async Notification Service** – Queues and persists notification events for tracking



### 🧰 Utilities
- **Lombok** – Reduces boilerplate (getters, setters, constructors)
- **ModelMapper** – DTO-to-entity mapping
- **Jackson** – JSON serialization and API response formatting



### 📘 API Documentation
- **SpringDoc OpenAPI / Swagger UI** – Interactive REST documentation
```bash
URL: http://localhost:8080/swagger-ui/index.html
```


---


## 🔐 Authentication & Security

OasisCapital implements **JWT-based stateless authentication** through **Spring Security**.

- Handles user registration, login, and role-based permissions
- Integrates `CustomUserDetailsService` for user credential validation
- Protects all routes except authentication and public listings
- Configures **CORS** for secure frontend–backend communication
- Uses **BCrypt** for password hashing and **JWT tokens** for access management


## 🏨 Room Management

- Create, update, delete, and fetch room listings
- Upload and serve images directly to the frontend’s public directory
- Search by room type, description, or feature tags
- Fetch available rooms by booking date range
- Predefined room types managed via **enumerations**


## 📅 Booking Operations

- Validates room availability before confirming bookings
- Automatically calculates total cost by duration and rate
- Generates unique 10-character booking reference codes
- Sends confirmation emails with embedded **Stripe payment links**
- Supports booking history and admin-level record access
- Updates booking and payment status in real time


## 💳 Payment Processing

- Integrated with **Stripe API** for secure transactions
- Tied directly to each booking to prevent duplicate payments
- Stores all transaction metadata and statuses
- Triggers automatic success/failure notifications
- Ensures complete transaction integrity through **Stripe PaymentIntents**  


## ✉️ Mailing & Notifications

- Powered by **JavaMailSender** with **Gmail SMTP**
- Sends:
    - Welcome emails
    - Booking confirmations
    - Payment status notifications
- Persists all notifications to the database for traceability
- Designed to support **SMS and WhatsApp** in future releases


## 👤 User Management

- Retrieve and update user profile details
- View personal booking history
- Admins can view all registered users and roles
- Supports account deletion and password updates


## 🧮 Utility Services

- **Booking Code Generator** – Ensures globally unique reference IDs
- **Validation Helpers** – Prevent duplicate bookings and code collisions
- **Centralized Error Handling** – Custom exceptions for robust API behavior  



---

## 🧩 Project Structure

```bash
src/main/java/com/emmanuelanene/OasisCapitalServer
│── config/             # Security & application configuration
│── controllers/        # REST API endpoints
│── dtos/               # Request and response data transfer objects
│── entities/           # Database models (JPA entities)
│── enums/              # Role and room type definitions
│── exceptions/         # Custom exception handling
│── payments/           # Stripe payment integration logic
│── repositories/       # Data persistence layer
│── security/           # JWT authentication and authorization
│── services/           # Business logic
│── OasisCapitalHotelsApp.java  # Application entry point
```

---

## ⚙️ Installation & Setup

### 🧱 Prerequisites
- **Java 17+**
- **Maven**
- **MySQL**

---

### 1️⃣ Clone Repository
```bash
git clone https://github.com/emmanuelanene/OasisCapital-Server.git
cd OasisCapital-Server
```

### 2️⃣ Install Dependencies
```bash
mvn clean install
```

### 3️⃣ Configure Environment
**Rename:**
```bash
application-dev.properties → application.properties
```
**Update the following in application.properties:**
- MySQL credentials
- Mail sender (SMTP)
- Frontend URLs

### 4️⃣ Run Application
```bash
mvn spring-boot:run
```

### 📘 API Documentation

Interactive documentation is available via **Swagger UI** at:
```bash
👉 [http://localhost:8080/swagger-ui/index.html](http://localhost:8080/swagger-ui/index.html)
```


---

## 🧠 System Capabilities Summary

| **Module**          | **Description** |
|----------------------|-----------------|
| **Auth & Security**  | JWT, OAuth2, BCrypt encryption |
| **Room Management**  | CRUD operations, image uploads |
| **Booking System**   | Date validation, total price calculation, unique reference codes |
| **Payment Gateway**  | Stripe integration with real-time updates |
| **Email System**     | Automated notifications via SMTP |
| **Admin Tools**      | Role-based management and analytics |



---


## 🧑‍💻 Contribution

**Want to contribute?**

1. Fork the repository
2. Create a new feature branch
3. Commit your changes
4. Submit a Pull Request

> Please follow **Java naming conventions** and **Spring Boot project structure** best practices.


---

## 📄 License

This project is licensed under the **MIT License** — you’re free to use, modify, and distribute.

---

---

## 🏁 Closing Note

**OasisCapital Server** — powering a smarter, faster, and more secure hotel experience.  

Built with ❤️ and **Spring Boot** by *Emmanuel Anene*.
