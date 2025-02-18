
# PC Configurator

## Project Overview
This project is a web application for configuring and building custom PCs. Users can select components (CPU, GPU, RAM, etc.), and the system will calculate the total cost and validate component compatibility.

## Current Tasks

### 1. Implement REST API
- **Completed**:
    - Developed REST API for managing the reference table for motherboard memory types.
    - Implemented the following endpoints:
        - `GET /api/motherboard-memory-types` — Retrieve all motherboard memory types.
        - `GET /api/motherboard-memory-types?name=ddr` — Filter motherboard memory types by name (e.g., "ddr").
        - `GET /api/motherboard-memory-types/1` — Retrieve a specific motherboard memory type by ID.

  **Examples of responses**:

  **GET /api/motherboard-memory-types** — All available motherboard memory types:
  ```json
  [
      {
          "id": 1,
          "name": "DDR4",
          "count": 3
      },
      {
          "id": 2,
          "name": "DDR5",
          "count": 2
      },
      {
          "id": 3,
          "name": "DDR3",
          "count": 0
      },
      {
          "id": 4,
          "name": "LPDDR5X",
          "count": 0
      },
      {
          "id": 5,
          "name": "GDDR6",
          "count": 0
      }
  ]
  ```

  **GET /api/motherboard-memory-types?name=gddr** — Filter motherboard memory types by name (e.g., "gddr"):
  ```json
  [
      {
          "id": 5,
          "name": "GDDR6",
          "count": 0
      }
  ]
  ```

  **GET /api/motherboard-memory-types/1** — Retrieve a specific motherboard memory type by ID:
  ```json
  {
      "id": 1,
      "name": "DDR4",
      "count": 3
  }
  ```

- **In Progress**:
    - Additional endpoints for other components (e.g., CPU, GPU) and configuration management (e.g., creating, updating, deleting configurations).
    - Implement logic for cost calculation and component compatibility validation.

### 2. Build a Simple Frontend
- **In Progress**:
    - Create a basic frontend to display available components, allow users to build and save configurations, and show configuration details, including total cost and compatibility status.

### 3. Component Compatibility Validation
- **Planned**:
    - Implement logic to ensure selected components are compatible (e.g., CPU socket matches motherboard, sufficient power supply).

### 4. Cost Calculation
- **Planned**:
    - Add functionality to calculate the total cost of a configuration based on selected components.

---

## Technologies
- **Backend**: Spring Boot.
- **Frontend**: Basic HTML/CSS/JavaScript (React or Vue.js for future scalability).
- **Database**: PostgreSQL.
- **Build Tool**: Maven.
