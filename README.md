# Tester Match - Angular + Spring Boot, JPA, Rest API

Application that list the matching testers based on the search criteria.

## Requirements

1. Java - 1.8.x

2. Maven

3. PostgreSQL

4. NodeJS

5. Angular 13
## Rest APIs

The app defines following CRUD APIs.

    GET /api/v1/look-up - to list all countries and devices 
    
    POST /api/v1/tester-match - to search with given search criteria
    sample Request: 
        {
            "countries": [
                "GB",
                "JP",
                "US"
                ],
            "devices": [
                {
                "id": 1,
                "description": "Iphone 4"
                }
                ]
        }
    
### Execution Steps:
1. Set Up the PostgreSQL with the SQL script: DB\ddl-dml.sql 
2. Start the springboot application
3. Open the Terminal and run:  <i> ng serve </i>
    
### Test Instructions:
![image](https://user-images.githubusercontent.com/99636443/153822980-7cbe7b2c-7650-4642-b39b-30ce9360faf0.png)

![image](https://user-images.githubusercontent.com/99636443/153822809-fc08bd2d-6ecd-4037-a0fa-7b9b7973bb90.png)
