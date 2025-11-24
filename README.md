# FarmChainX – Spring Boot Backend

FarmChainX is a backend system built using Spring Boot to provide transparency and traceability in the agricultural supply chain.  
The system manages crop details and supports a structured architecture using Controllers, Services, Repositories, and Models.

---

## Features

- RESTful APIs for crop management  
- Clean 3-layer architecture (Controller → Service → Repository)  
- Spring Data JPA for database operations  
- JSON-based request/response model  
- Can be extended for farmer management, traceability, and blockchain integration  
- Compatible with Postman for testing  

---

## Tech Stack

- Java 17+  
- Spring Boot 3+  
- Spring Web  
- Spring Data JPA  
- H2/MySQL (configurable)  
- IntelliJ IDEA  
- Git & GitHub for version control  

---

## Project Structure
src/
└── main/
├── java/
│ └── com.FarmChainX.FarmChainX
│ ├── Controller/
│ │ CropController.java
│ ├── Service/
│ │ CropService.java
│ ├── Repository/
│ │ CropRepository.java
│ └── Model/
│ Crop.java
└── resources/
application.properties

---

## API Endpoints (Crop Management)

### 1. Add Crop  
**POST** `/crops/add`  

2. Get Crop by ID

GET /crops/{id}

3. Get All Crops

GET /crops/all

4. Update Crop

PUT /crops/update/{id}

5. Delete Crop

DELETE /crops/delete/{id}

How to Run the Project
======================

=>Clone the repository

=>git clone <repo-url>

=>Open the project in IntelliJ IDEA

=>Run FarmChainXApplication.java

=>Use Postman or a browser to test APIs

Future Enhancements
===================

=>Farmer registration module

=>Batch management

=>TraceRecord (blockchain-style hashing)

=>Sensor/IoT data integration

=>AI-based crop recommendation

Author
=======

Preethi S — FarmChainX Java Developer
