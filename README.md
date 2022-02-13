# Ectools Aggregator
Microservice to handle employee management on a payroll system.
## Getting Started
These instructions will get you a copy of the project up and running
on your local machine for development, testing and even to production.

### Prerequisites
You need to install the following and add to system paths.
```
java
maven
mongodb
```
### Running
Clone or download repository and run maven in the root of the directory. A step by step
series of actions that tell you how to get project running. 
#### Running the microservice with maven
```
project_root_directory > mvn clean package
```
Compiles and builds classes and resources into jar file. A target folder 
is generated containing the build.
##### windows platform
```
project_root_directory > java -jar \target\taryafrik-payroll-1.0.jar
```
##### unix platform
```
project_root_directory > java -jar /target/taryafrik-payroll-1.0.jar
```
This will spin an embedded tomcat server and the application
can be accessed on localhost and port set in the application.properties
file in the source directory of the project
```
http://localhost:8080
```
## API Endpoints
METHOD     |     URL                                             | functionality                              |
-----------|-----------------------------------------------------|:-------------------------------------------|
  GET      | http://localhost:8080/api/v1/employees              | list all employees                         |
  GET      | http://localhost:8080/api/v1/employees/{id}         | get employee details                       |
  POST     | http://localhost:8080/api/v1/employees              | create a new employee                      |
  PUT      | http://localhost:8080/api/v1/employees/{id}         | update employee detail                     |
  DELETE   | http://localhost:8080/api/v1/employees/{id}         | delete an employee                         |


## Deployment
The build in the target folder can be executed on cloud or server hosting platform.

## Built With
- SpringBoot
- Maven
- Java 8

## Versioning
Version 1