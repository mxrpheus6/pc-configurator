PC Configurator

## Project Overview
This project is a web application for configuring and building custom PCs. Users can select components (CPU, GPU, RAM, etc.), and the system will calculate the total cost and validate component compatibility.

## Current Tasks

### 1. Implement REST API
Develop a REST API to manage PC configurations. Key endpoints will include:
- Managing components (e.g., listing, adding, updating, deleting).
- Managing configurations (e.g., creating, editing, deleting, calculating costs).

### 2. Build a Simple Frontend
Create a basic frontend to:
- Display available components.
- Allow users to build and save configurations.
- Show configuration details, including total cost and compatibility status.

### 3. Component Compatibility Validation
Implement logic to ensure selected components are compatible (e.g., CPU socket matches motherboard, sufficient power supply, etc.).

### 4. Cost Calculation
Add functionality to calculate the total cost of a configuration based on selected components.

---

## Technologies
- **Backend**: Spring Boot.
- **Frontend**: Basic HTML/CSS/JavaScript (optional framework like React or Vue.js for future scalability).
- **Database**: PostgreSQL.
- **Build Tool**: Maven.