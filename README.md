# Job Application Tracker

A backend REST API for managing and tracking job applications.

## Overview

The Job Application Tracker allows users to store and manage job application details such as company, role, location, application status, application date, job type, job URL, and notes.

The application is built using Java and Spring Boot, with MySQL used for persistent data storage.

## Features

- Create job applications
- View all applications
- Update application details
- Delete applications
- Filter applications by status
- Input validation
- Custom exception handling
- Enum-based application status
- MySQL database persistence

## Tech Stack

- **Java 21**
- **Spring Boot**
- **Spring Data JPA**
- **Hibernate**
- **MySQL**
- **Maven**
- **REST API**
- **Postman**
- **Git & GitHub**

## Application Data

Each job application can contain:

- Company
- Job role
- Location
- Application status
- Application date
- Job type
- Job URL
- Notes

Supported application statuses:

- APPLIED
- INTERVIEW
- OFFER
- REJECTED
- WITHDRAWN

## API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/api/applications` | Get all applications |
| POST | `/api/applications` | Create an application |
| PUT | `/api/applications/{id}` | Update an application |
| DELETE | `/api/applications/{id}` | Delete an application |
| GET | `/api/applications/status/{status}` | Filter applications by status |

## Example Request

```json
{
  "company": "Google",
  "role": "Software Engineer",
  "location": "Bangalore",
  "status": "APPLIED",
  "applicationDate": "2026-09-11",
  "jobType": "Full-time",
  "jobUrl": "https://careers.google.com/",
  "notes": "Applied through careers portal"
}
