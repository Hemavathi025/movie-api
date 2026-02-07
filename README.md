Movie REST API – Java Spring Boot

Description:
A simple Java Spring Boot REST API to manage movies using in-memory storage.

Tech Stack:
Java 17, Spring Boot, Maven

How to Run:
1. Import the project as an Existing Maven Project in Eclipse
2. Run MovieapiApplication.java
3. Server starts on http://localhost:8080

API Endpoints:

POST /movies
Description: Add a new movie
Request Body:
{
  "name": "RRR",
  "description": "Indian epic action drama",
  "rating": 8.0
}

GET /movies/{id}
Description: Get movie by ID

Data Storage:
In-memory using ArrayList (no database)

Notes:
This project is created as a sample backend assignment.
