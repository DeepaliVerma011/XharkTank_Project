Annotations in the Project
General Spring Boot Annotations
@SpringBootApplication
Location: XharkTankApplication.java
Purpose: This annotation is a convenience annotation that adds all the following:
@Configuration: Tags the class as a source of bean definitions for the application context.
@EnableAutoConfiguration: Tells Spring Boot to start adding beans based on classpath settings, other beans, and various property settings.
@ComponentScan: Tells Spring to look for other components, configurations, and services in the specified package, allowing it to find the controllers.
Model Annotations
@Document

Location: Pitch.java, Investment.java
Purpose: Marks a class as a MongoDB document, meaning it will be mapped to a collection in MongoDB.
Example: @Document(collection = "pitches")
@Id

Location: Pitch.java, Investment.java
Purpose: Specifies the primary key field of the document. This field will be used to uniquely identify each document in the MongoDB collection.
@Data

Location: Pitch.java, Investment.java
Purpose: A Lombok annotation to generate boilerplate code such as getters, setters, toString, equals, and hashCode methods.
Repository Annotations
@Repository
Location: Implicitly used in PitchRepository.java and InvestmentRepository.java (since they extend MongoRepository)
Purpose: Indicates that the class is a repository that will interact with the database. Spring will automatically create implementations of these interfaces.
Service Annotations
@Service
Location: PitchService.java, InvestmentService.java
Purpose: Marks a class as a service provider. Services hold business logic and call repositories to perform database operations.
Controller Annotations
@RestController

Location: PitchController.java, InvestmentController.java
Purpose: Combines @Controller and @ResponseBody. It indicates that the class handles HTTP requests and each method returns a response body directly (not a view).
@RequestMapping

Location: PitchController.java, InvestmentController.java
Purpose: Maps HTTP requests to handler methods of MVC and REST controllers. Can be applied at the class level to define a base path and at the method level to define specific paths and HTTP methods.
Example: @RequestMapping("/api/pitches")
@PostMapping

Location: Methods in PitchController.java, InvestmentController.java
Purpose: A shorthand for @RequestMapping(method = RequestMethod.POST). It maps HTTP POST requests to specific handler methods.
Example: @PostMapping
@GetMapping

Location: Methods in PitchController.java, InvestmentController.java
Purpose: A shorthand for @RequestMapping(method = RequestMethod.GET). It maps HTTP GET requests to specific handler methods.
Example: @GetMapping("/{id}")
@PathVariable

Location: Parameters in PitchController.java, InvestmentController.java
Purpose: Indicates that a method parameter should be bound to a URI template variable. Used to extract values from the URL path.
Example: @PathVariable String id
@RequestBody

Location: Parameters in PitchController.java, InvestmentController.java
Purpose: Indicates that a method parameter should be bound to the body of the HTTP request. Used to deserialize the JSON request body into a Java object.
Example: @RequestBody Pitch pitch
@Autowired

Location: Fields in PitchService.java, InvestmentService.java, PitchController.java, InvestmentController.java
Purpose: Marks a constructor, field, setter method, or config method to be autowired by Spring’s dependency injection facilities. It’s used to inject dependencies.


Annotations in the Project
General Spring Boot Annotations
@SpringBootApplication
Location: XharkTankApplication.java
Purpose: This annotation is a convenience annotation that adds all the following:
@Configuration: Tags the class as a source of bean definitions for the application context.
@EnableAutoConfiguration: Tells Spring Boot to start adding beans based on classpath settings, other beans, and various property settings.
@ComponentScan: Tells Spring to look for other components, configurations, and services in the specified package, allowing it to find the controllers.
Model Annotations
@Document

Location: Pitch.java, Investment.java
Purpose: Marks a class as a MongoDB document, meaning it will be mapped to a collection in MongoDB.
Example: @Document(collection = "pitches")
@Id

Location: Pitch.java, Investment.java
Purpose: Specifies the primary key field of the document. This field will be used to uniquely identify each document in the MongoDB collection.
@Data

Location: Pitch.java, Investment.java
Purpose: A Lombok annotation to generate boilerplate code such as getters, setters, toString, equals, and hashCode methods.
Repository Annotations
@Repository
Location: Implicitly used in PitchRepository.java and InvestmentRepository.java (since they extend MongoRepository)
Purpose: Indicates that the class is a repository that will interact with the database. Spring will automatically create implementations of these interfaces.
Service Annotations
@Service
Location: PitchService.java, InvestmentService.java
Purpose: Marks a class as a service provider. Services hold business logic and call repositories to perform database operations.
Controller Annotations
@RestController

Location: PitchController.java, InvestmentController.java
Purpose: Combines @Controller and @ResponseBody. It indicates that the class handles HTTP requests and each method returns a response body directly (not a view).
@RequestMapping

Location: PitchController.java, InvestmentController.java
Purpose: Maps HTTP requests to handler methods of MVC and REST controllers. Can be applied at the class level to define a base path and at the method level to define specific paths and HTTP methods.
Example: @RequestMapping("/api/pitches")
@PostMapping

Location: Methods in PitchController.java, InvestmentController.java
Purpose: A shorthand for @RequestMapping(method = RequestMethod.POST). It maps HTTP POST requests to specific handler methods.
Example: @PostMapping
@GetMapping

Location: Methods in PitchController.java, InvestmentController.java
Purpose: A shorthand for @RequestMapping(method = RequestMethod.GET). It maps HTTP GET requests to specific handler methods.
Example: @GetMapping("/{id}")
@PathVariable

Location: Parameters in PitchController.java, InvestmentController.java
Purpose: Indicates that a method parameter should be bound to a URI template variable. Used to extract values from the URL path.
Example: @PathVariable String id
@RequestBody

Location: Parameters in PitchController.java, InvestmentController.java
Purpose: Indicates that a method parameter should be bound to the body of the HTTP request. Used to deserialize the JSON request body into a Java object.
Example: @RequestBody Pitch pitch
@Autowired

Location: Fields in PitchService.java, InvestmentService.java, PitchController.java, InvestmentController.java
Purpose: Marks a constructor, field, setter method, or config method to be autowired by Spring’s dependency injection facilities. It’s used to inject dependencies.