# Spring Boot Multi-Module Template

A clean, scalable, and modular Spring Boot project structure designed for enterprise-grade applications. This template separates API exposure logic from the core application logic, making it ideal for microservices, SDK providers, or layered architecture setups.

---

## 📁 Project Structure

```
spring-boot-multi-module-template/
├── api/ # Module exposing APIs or SDKs for consumers
├── implementation/ # Core application logic and service implementations
├── build.gradle # Root build configuration
├── settings.gradle # Module declarations
└── README.md # Project documentation
```


### Module Overview

- **api**:
    - Acts as a contract layer for external consumers (e.g., SDKs or REST API definitions).
    - Can be used in other services without pulling the entire application logic.
    - Contains DTOs, controller interfaces, or enums (if applicable).

- **implementation**:
    - Contains the actual business logic, services, entities, repositories, and Spring Boot main class.
    - Depends on `api` but not vice versa (maintains separation of concerns).

---

## 🚀 Getting Started

### Prerequisites

- Java 17+
- Gradle 8+
- IDE (IntelliJ IDEA recommended)

### Clone the Repository

```
git clone https://github.com/sankalpbhatt/spring-boot-multi-module-template.git
```
```
cd spring-boot-multi-module-template
```

### Build the Project
```bash
  ./gradlew clean build
```

### Run the Application

```bash
  ./gradlew :implementation:bootRun
```

### 🛠️ Tech Stack
1. Java 17
2. Spring Boot
3. Gradle (multi-module)

### 🧩 Extending the Template

This template is built with extensibility in mind:
1. Add more modules (e.g., domain, web, core, batch) as your app grows.
2. Use the api module in other services as an SDK dependency.
3. Enable features like Docker, Swagger/OpenAPI, or GitHub Actions as needed.