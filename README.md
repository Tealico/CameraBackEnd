# CameraBackEnd
Camera Project is a spring boot application that provides a restful API (consumes/produces JSON object)
This project is back end by a NOSLQ database(MongoDB)

To get started:
- install [mongoDB](https://www.mongodb.com/docs/manual/administration/install-community/)
- install Java v-17+
- Make sure to have a known IDE for Java and a rest testing tool (i.e. [Postman](https://www.postman.com/) )

## Generate Spring Boot Project 
Generate project using [Spring Boot Initializr](https://start.spring.io/) and add the following maven dependencies:
1. Spring Web
2. Spring Data MongoDB

## Implementation

Create packages for controller, service, model, errors, and utils.\

### Controller
This project has only one controller which is named CameraController.
To identify this class as a controller the annotation **@RestController** should be added above the class declaration
This controller has implemented the following routers
- /camera [POST] => to create a new camera
- /camera [GET] => to get all cameras
- /camera/{cameraid} [GET] => to get a camera by id
- /camera/{cameraid} [POST] => to update a camera
- /camera/{cameraid} [DELETE] => to delete a camera

Use annotation **@Autowired** to let Spring controll Service connection management.

### Service
Service implements business logic and manipulates the database information.

Use **@Autowired** annotation to let Spring manage the repository connection.

### Repository
As a repository, the project uses a mongo DB repository which is responsible for managing database connections.
The repository has crud operations created by default for the specific class defined. For each query, the repository returns an Optional object(part of the MongoDB library).

### Model
The model also represents the database connection with the help of **@Document(collection = "cameras")**
instance params of camera model are:
- ID: string
- Name: string
- Model: string
- Resolution: string
- IP: IpV4

### Global Exception Handler
The project use **@RestControllerAdvice** to define a class which a should handle all unhandled errors and return formatted response.

## Postman 
Test the backend using the specified Postaman [collection](Camera.postman_collection.json).