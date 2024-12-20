# React and Spring Boot Application

## Overview
This project combines a React frontend and a Spring Boot backend to create a full-stack application. The application serves as a product management platform, allowing users to browse, search, and interact with products.

---

## Features

### Frontend
- **Framework**: React
- **Key Components**:
  - `Navbar.jsx`: A dynamic navigation bar with category selection, theme toggle, and search functionality.
  - `Home.jsx`: Displays products with filtering capabilities based on selected categories.
  - **API Integration**: Utilizes Axios for fetching product data and images.

### Backend
- **Framework**: Spring Boot
- **Endpoints**:
  - `GET /api/products`: Fetch all products.
  - `GET /api/products/search`: Search for products by name.
  - `GET /api/product/{id}/image`: Retrieve product images.
- **Database**: (Details not provided; replace with your database type, e.g., MySQL, PostgreSQL, etc.)

---

## Setup Instructions

### Prerequisites
- Node.js
- Java JDK 8 or above
- Maven or Gradle
- (Optional) A database setup (e.g., MySQL)

### Frontend Setup
1. Navigate to the `frontend` directory.
2. Install dependencies:
   ```bash
   npm install
   ```
3. Start the development server:
   ```bash
   npm start
   ```

### Backend Setup
1. Navigate to the `backend` directory.
2. Build the Spring Boot application:
   ```bash
   mvn clean install
   ```
3. Run the Spring Boot application:
   ```bash
   java -jar target/your-application.jar
   ```

### Database Configuration
- Update `application.properties` or `application.yml` in the Spring Boot backend with your database details.

---

## Usage
- Access the application at `http://localhost:3000` (React development server).
- The backend runs on `http://localhost:8080`.
- Use the navigation bar to explore categories or search for products.

---

## Project Structure

### Frontend
```
frontend/
  ├── src/
  │   ├── components/
  │   │   ├── Navbar.jsx
  │   │   ├── Home.jsx
  │   ├── utils/
  │   │   └── axios.jsx
  ├── package.json
```

### Backend
```
backend/
  ├── src/
  │   ├── main/
  │   │   ├── java/
  │   │   │   └── com/example/demo/
  │   │   └── resources/
  │   │       └── application.properties
  ├── pom.xml
```

---

## Technologies Used

- **Frontend**: React, Axios, Bootstrap
- **Backend**: Spring Boot, Java
- **Build Tools**: Maven

---

## Future Enhancements
- Add user authentication and authorization.
- Implement product ratings and reviews.
- Integrate with a cloud-based database.

---
