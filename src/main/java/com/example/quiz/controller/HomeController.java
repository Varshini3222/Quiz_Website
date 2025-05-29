package com.example.quiz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.quiz.model.Question;
import com.example.quiz.model.Subject;
import com.example.quiz.repository.QuestionRepository;
import com.example.quiz.repository.SubjectRepository;

import jakarta.annotation.PostConstruct;

@Controller
public class HomeController {

    @Autowired
    private SubjectRepository subjectRepository;
    @Autowired
    private QuestionRepository questionRepository;

    // Initialize some sample data
    @PostConstruct
    public void init() {
        // Only add if database is empty
        if (subjectRepository.count() == 0) {
            subjectRepository.save(new Subject("Java", "Core Java,Advanced Java,Spring Boot,Hibernate,JDBC"));
            subjectRepository.save(new Subject("Data Structures & Algorithms", "Arrays,Linked Lists,Trees,Graphs,Sorting"));
            subjectRepository.save(new Subject("Python", "Basics,OOP,Data Science,Django,Flask"));
            subjectRepository.save(new Subject("Operating Systems", "Processes,Memory Management,File Systems,Deadlocks,Scheduling"));
            subjectRepository.save(new Subject("Database Management", "SQL,NoSQL,Normalization,Transactions,Indexing"));
        }
 // Initialize questions if none exist
    if (questionRepository.count() == 0) {
        // Core Java Questions
        questionRepository.save(new Question("Java", "Core Java", 
            "What is the default value of an int in Java?", 
            "0", "null", "1", "Not defined", "0", 1));
        questionRepository.save(new Question("Java", "Core Java", 
            "Which keyword is used for inheritance in Java?", 
            "extends", "inherits", "implements", "derives", "extends", 1));
        questionRepository.save(new Question("Java", "Core Java", 
            "Which of these is not a Java keyword?", 
            "abstract", "assert", "goto", "sizeof", "sizeof", 1));
        questionRepository.save(new Question("Java", "Core Java", 
            "What is the size of int in Java?", 
            "16-bit", "32-bit", "64-bit", "Depends on system", "32-bit", 1));
        questionRepository.save(new Question("Java", "Core Java", 
            "Which interface provides the compareTo() method?", 
            "Runnable", "Comparable", "Serializable", "Cloneable", "Comparable", 1));
        questionRepository.save(new Question("Java", "Core Java", 
        	    "Which method must be implemented by all threads in Java?", 
        	    "start()", "run()", "execute()", "launch()", "run()", 1));
        	questionRepository.save(new Question("Java", "Core Java", 
        	    "What is the parent class of all classes in Java?", 
        	    "Object", "Class", "Main", "Super", "Object", 1));
        	    
        	questionRepository.save(new Question("Java", "Core Java", 
        	    "Which collection implements FIFO (First-In-First-Out) principle?", 
        	    "List", "Set", "Queue", "Map", "Queue", 1));
        	    
        	questionRepository.save(new Question("Java", "Core Java", 
        	    "What is the default value of a boolean in Java?", 
        	    "true", "false", "null", "0", "false", 1));
        	    
        	questionRepository.save(new Question("Java", "Core Java", 
        	    "Which keyword is used to prevent method overriding?", 
        	    "static", "final", "private", "protected", "final", 1));
        	    
        	questionRepository.save(new Question("Java", "Core Java", 
        	    "What does JVM stand for?", 
        	    "Java Virtual Machine", "Java Visual Machine", "Java Verified Machine", "Java Variable Machine", "Java Virtual Machine", 1));
        	    
        	questionRepository.save(new Question("Java", "Core Java", 
        	    "Which of these is not a valid Java identifier?", 
        	    "_variable", "$variable", "2variable", "variable2", "2variable", 1));
        	    
        	questionRepository.save(new Question("Java", "Core Java", 
        	    "What is the superinterface of all collection interfaces?", 
        	    "Collection", "Iterable", "List", "Set", "Iterable", 1));
        	    
        	questionRepository.save(new Question("Java", "Core Java", 
        	    "Which keyword is used to create an instance of a class?", 
        	    "this", "super", "new", "instanceof", "new", 1));
        	    
        	questionRepository.save(new Question("Java", "Core Java", 
        	    "What is the return type of the hashCode() method?", 
        	    "String", "boolean", "int", "Object", "int", 1));
        	    
        	questionRepository.save(new Question("Java", "Core Java", 
        	    "Which exception is thrown when dividing by zero?", 
        	    "NullPointerException", "ArithmeticException", "ArrayIndexOutOfBoundsException", "NumberFormatException", "ArithmeticException", 1));
        	    
        	questionRepository.save(new Question("Java", "Core Java", 
        	    "What is the default capacity of ArrayList in Java?", 
        	    "0", "5", "10", "16", "10", 1));
        	    
        	questionRepository.save(new Question("Java", "Core Java", 
        	    "Which method is called when an object is garbage collected?", 
        	    "finalize()", "destroy()", "delete()", "cleanup()", "finalize()", 1));
        	    
        	questionRepository.save(new Question("Java", "Core Java", 
        	    "Which of these is a marker interface?", 
        	    "Runnable", "Serializable", "Comparator", "Callable", "Serializable", 1));
        	    
        	questionRepository.save(new Question("Java", "Core Java", 
        	    "What is the size of a char in Java?", 
        	    "8-bit", "16-bit", "32-bit", "64-bit", "16-bit", 1));

        // Advanced Java Questions
        questionRepository.save(new Question("Java", "Advanced Java", 
            "Which annotation is used for dependency injection in Java EE?", 
            "@Inject", "@Resource", "@Autowired", "@EJB", "@Inject", 1));
        questionRepository.save(new Question("Java", "Advanced Java", 
            "What is JNDI used for?", 
            "Network communication", "Database access", 
            "Naming and directory services", "GUI development", "Naming and directory services", 1));
        questionRepository.save(new Question("Java", "Advanced Java", 
            "Which design pattern is used in Java's Collection.iterator()?", 
            "Singleton", "Factory", "Iterator", "Observer", "Iterator", 1));
        questionRepository.save(new Question("Java", "Advanced Java", 
            "What does JPA stand for?", 
            "Java Persistence API", "Java Performance Analyzer", 
            "Java Protocol Architecture", "Java Process Automation", "Java Persistence API", 1));
        questionRepository.save(new Question("Java", "Advanced Java", 
            "Which method is called when a servlet is initialized?", 
            "start()", "init()", "service()", "doGet()", "init()", 1));
        questionRepository.save(new Question("Java", "Advanced Java", 
        	    "Which annotation is used to define a singleton EJB?", 
        	    "@Singleton", "@Stateless", "@Stateful", "@ApplicationScoped", "@Singleton", 1));
        	questionRepository.save(new Question("Java", "Advanced Java", 
        	    "What is the purpose of JTA (Java Transaction API)?", 
        	    "To handle database connections", "To manage distributed transactions", 
        	    "To create thread-safe beans", "To optimize JPA queries", "To manage distributed transactions", 1));
        	questionRepository.save(new Question("Java", "Advanced Java", 
        	    "Which HTTP method should be used to update a resource?", 
        	    "POST", "PUT", "GET", "DELETE", "PUT", 1));
        	questionRepository.save(new Question("Java", "Advanced Java", 
        	    "What is the default scope of a JSF managed bean?", 
        	    "@RequestScoped", "@SessionScoped", "@ApplicationScoped", "@ViewScoped", "@RequestScoped", 1));
        	questionRepository.save(new Question("Java", "Advanced Java", 
        	    "Which interface is used to implement a custom JAX-RS provider?", 
        	    "MessageBodyReader", "Servlet", "Filter", "Interceptor", "MessageBodyReader", 1));
        	questionRepository.save(new Question("Java", "Advanced Java", 
        	    "What does CDI stand for?", 
        	    "Component Dependency Injection", "Contexts and Dependency Injection", 
        	    "Container Dependency Injection", "Class Dependency Injection", "Contexts and Dependency Injection", 1));
        	questionRepository.save(new Question("Java", "Advanced Java", 
        	    "Which annotation is used to inject a JMS connection factory?", 
        	    "@Resource", "@Inject", "@PersistenceContext", "@EJB", "@Resource", 1));
        	questionRepository.save(new Question("Java", "Advanced Java", 
        	    "What is the purpose of the @Asynchronous annotation in EJB?", 
        	    "To run a method in a background thread", "To mark a method as deprecated", 
        	    "To enable caching", "To restrict access to the method", "To run a method in a background thread", 1));
        	questionRepository.save(new Question("Java", "Advanced Java", 
        	    "Which JAX-RS annotation is used to extract path parameters?", 
        	    "@PathParam", "@QueryParam", "@FormParam", "@HeaderParam", "@PathParam", 1));
        	questionRepository.save(new Question("Java", "Advanced Java", 
        	    "What is the default transaction type for EJBs?", 
        	    "REQUIRED", "REQUIRES_NEW", "SUPPORTS", "MANDATORY", "REQUIRED", 1));
        	questionRepository.save(new Question("Java", "Advanced Java", 
        	    "Which Java EE specification is used for security?", 
        	    "JASPIC", "JAAS", "JACC", "All of the above", "All of the above", 1));
        	questionRepository.save(new Question("Java", "Advanced Java", 
        	    "What is the purpose of the @Lock annotation in EJB?", 
        	    "To define thread-safety", "To control concurrent access", 
        	    "To enable caching", "To mark a method as synchronized", "To control concurrent access", 1));
        	questionRepository.save(new Question("Java", "Advanced Java", 
        	    "Which annotation is used to define a message-driven bean?", 
        	    "@MessageDriven", "@MDB", "@JMSListener", "@QueueListener", "@MessageDriven", 1));
        	questionRepository.save(new Question("Java", "Advanced Java", 
        	    "What is the default behavior of @Transactional in Java EE?", 
        	    "REQUIRED", "REQUIRES_NEW", "SUPPORTS", "NOT_SUPPORTED", "REQUIRED", 1));
        	questionRepository.save(new Question("Java", "Advanced Java", 
        	    "Which Java EE component is used for batch processing?", 
        	    "JMS", "JTA", "JSR 352", "JPA", "JSR 352", 1));
        	
        // Spring Boot Questions
        questionRepository.save(new Question("Java", "Spring Boot", 
            "What is the default embedded server in Spring Boot?", 
            "Tomcat", "Jetty", "Undertow", "Netty", "Tomcat", 1));
        questionRepository.save(new Question("Java", "Spring Boot", 
            "Which annotation is used to mark a Spring Boot application?", 
            "@SpringBoot", "@SpringApplication", 
            "@SpringBootApplication", "@SpringMain", "@SpringBootApplication", 1));
        questionRepository.save(new Question("Java", "Spring Boot", 
            "Where does Spring Boot look for properties by default?", 
            "application.yml", "application.properties", 
            "both a and b", "spring.config", "both a and b", 1));
        questionRepository.save(new Question("Java", "Spring Boot", 
            "What is the default port for Spring Boot web applications?", 
            "8080", "8000", "8443", "80", "8080", 1));
        questionRepository.save(new Question("Java", "Spring Boot", 
            "Which starter is needed for Spring Web MVC?", 
            "spring-boot-starter-web", "spring-boot-starter-mvc", 
            "spring-boot-starter-http", "spring-boot-starter-tomcat", "spring-boot-starter-web", 1));
        questionRepository.save(new Question("Java", "Spring Boot", 
        	    "Which property is used to change the default server port?", 
        	    "server.port", "server.http.port", "app.port", "spring.port", "server.port", 1));
        	questionRepository.save(new Question("Java", "Spring Boot", 
        	    "What is the purpose of @EnableAutoConfiguration?", 
        	    "To enable Spring MVC", "To enable automatic bean discovery", 
        	    "To enable security", "To enable transaction management", "To enable automatic bean discovery", 1));
        	questionRepository.save(new Question("Java", "Spring Boot", 
        	    "Which starter includes Spring Security?", 
        	    "spring-boot-starter-security", "spring-boot-starter-web-security", 
        	    "spring-boot-security", "spring-security-starter", "spring-boot-starter-security", 1));
        	questionRepository.save(new Question("Java", "Spring Boot", 
        	    "What is the default database used by Spring Boot if no dependency is specified?", 
        	    "H2", "MySQL", "PostgreSQL", "None", "None", 1));
        	questionRepository.save(new Question("Java", "Spring Boot", 
        	    "Which annotation is used to create a REST controller?", 
        	    "@RestController", "@Controller", "@Service", "@Repository", "@RestController", 1));
        	questionRepository.save(new Question("Java", "Spring Boot", 
        	    "What is the purpose of spring-boot-devtools?", 
        	    "To enable hot reloading", "To provide production monitoring", 
        	    "To optimize runtime performance", "To generate documentation", "To enable hot reloading", 1));
        	questionRepository.save(new Question("Java", "Spring Boot", 
        	    "Which file is used to define Spring Boot profiles?", 
        	    "application.yml", "bootstrap.yml", "profile.yml", "spring-profiles.yml", "application.yml", 1));
        	questionRepository.save(new Question("Java", "Spring Boot", 
        	    "What does @SpringBootApplication combine?", 
        	    "@Configuration @EnableAutoConfiguration @ComponentScan", 
        	    "@Configuration @Bean @Component", 
        	    "@Controller @Service @Repository", 
        	    "@EnableWeb @EnableSecurity @EnableJpa", 
        	    "@Configuration @EnableAutoConfiguration @ComponentScan", 1));
        	questionRepository.save(new Question("Java", "Spring Boot", 
        	    "Which property enables H2 console in development?", 
        	    "spring.h2.console.enabled=true", "spring.h2.console=true", 
        	    "h2.console.enabled=true", "spring.h2.enable-console=true", "spring.h2.console.enabled=true", 1));
        	questionRepository.save(new Question("Java", "Spring Boot", 
        	    "What is the purpose of @ConditionalOnProperty?", 
        	    "To conditionally create a bean based on a property", 
        	    "To define a property source", 
        	    "To validate properties", 
        	    "To encrypt properties", 
        	    "To conditionally create a bean based on a property", 1));
        	questionRepository.save(new Question("Java", "Spring Boot", 
        	    "Which annotation is used to schedule tasks?", 
        	    "@Scheduled", "@Async", "@Timer", "@EnableScheduling", "@Scheduled", 1));
        	questionRepository.save(new Question("Java", "Spring Boot", 
        	    "What is the default logging framework in Spring Boot?", 
        	    "Log4j", "Logback", "JUL", "SLF4J", "Logback", 1));
        	questionRepository.save(new Question("Java", "Spring Boot", 
        	    "Which starter is needed for Spring Data JPA?", 
        	    "spring-boot-starter-data", "spring-boot-starter-jpa", 
        	    "spring-boot-starter-data-jpa", "spring-jpa-starter", "spring-boot-starter-data-jpa", 1));
        	questionRepository.save(new Question("Java", "Spring Boot", 
        	    "What is the purpose of @ConfigurationProperties?", 
        	    "To bind external properties to a Java object", 
        	    "To define configuration classes", 
        	    "To enable property validation", 
        	    "To create dynamic properties", 
        	    "To bind external properties to a Java object", 1));
        	questionRepository.save(new Question("Java", "Spring Boot", 
        	    "Which command builds a Spring Boot executable JAR?", 
        	    "mvn package", "mvn install", "mvn spring-boot:build", "mvn compile", "mvn package", 1));
        	
        // Hibernate Questions
        questionRepository.save(new Question("Java", "Hibernate", 
            "What is the core interface of Hibernate?", 
            "Session", "SessionFactory", "Transaction", "Query", "Session", 1));
        questionRepository.save(new Question("Java", "Hibernate", 
            "Which annotation maps a class to a database table?", 
            "@Table", "@Entity", "@Column", "@Mapped", "@Entity", 1));
        questionRepository.save(new Question("Java", "Hibernate", 
            "What is HQL?", 
            "High Quality Language", "Hibernate Query Language", 
            "Hyper Query Language", "Hibernate Question Language", "Hibernate Query Language", 1));
        questionRepository.save(new Question("Java", "Hibernate", 
            "Which cache is the default first-level cache in Hibernate?", 
            "Session cache", "Query cache", 
            "Second-level cache", "Collection cache", "Session cache", 1));
        questionRepository.save(new Question("Java", "Hibernate", 
            "What does ORM stand for?", 
            "Object-Relational Mapping", "Object-Role Modeling", 
            "Object-Reference Model", "Object-Relational Model", "Object-Relational Mapping", 1));
        questionRepository.save(new Question("Java", "Hibernate", 
        	    "Which annotation is used to specify a composite primary key?", 
        	    "@CompositeKey", "@IdClass", "@EmbeddedId", "Both b and c", "Both b and c", 1));
        	questionRepository.save(new Question("Java", "Hibernate", 
        	    "What is the purpose of the @Version annotation?", 
        	    "To enable optimistic locking", "To specify schema version", 
        	    "To mark a deprecated entity", "To track entity changes", "To enable optimistic locking", 1));
        	questionRepository.save(new Question("Java", "Hibernate", 
        	    "Which fetch type minimizes database queries for associations?", 
        	    "EAGER", "LAZY", "DEFAULT", "PROXY", "LAZY", 1));
        	questionRepository.save(new Question("Java", "Hibernate", 
        	    "What is the purpose of the Hibernate Session?", 
        	    "To represent a database connection", "To manage persistence operations", 
        	    "To execute SQL queries", "To configure Hibernate", "To manage persistence operations", 1));
        	questionRepository.save(new Question("Java", "Hibernate", 
        	    "Which annotation maps an enum to a database column?", 
        	    "@Enum", "@Enumerated", "@EnumType", "@ColumnEnum", "@Enumerated", 1));
        	questionRepository.save(new Question("Java", "Hibernate", 
        	    "What is the difference between save() and persist()?", 
        	    "save() returns an identifier immediately", "persist() is JPA-standard", 
        	    "Both a and b", "There is no difference", "Both a and b", 1));
        	questionRepository.save(new Question("Java", "Hibernate", 
        	    "Which cache stores query results?", 
        	    "First-level cache", "Second-level cache", 
        	    "Query cache", "Collection cache", "Query cache", 1));
        	questionRepository.save(new Question("Java", "Hibernate", 
        	    "What does the @DynamicUpdate annotation do?", 
        	    "Updates only modified fields", "Forces full updates", 
        	    "Enables caching", "Disables dirty checking", "Updates only modified fields", 1));
        	questionRepository.save(new Question("Java", "Hibernate", 
        	    "Which interface is used for criteria queries?", 
        	    "Criteria", "CriteriaBuilder", "JpaCriteria", "QueryBuilder", "CriteriaBuilder", 1));
        	questionRepository.save(new Question("Java", "Hibernate", 
        	    "What is the purpose of @NamedQuery?", 
        	    "To define a reusable JPQL query", "To name an entity", 
        	    "To mark a query as cached", "To specify a native SQL query", "To define a reusable JPQL query", 1));
        	questionRepository.save(new Question("Java", "Hibernate", 
        	    "Which method flushes the Session manually?", 
        	    "session.commit()", "session.flush()", 
        	    "session.sync()", "session.update()", "session.flush()", 1));
        	questionRepository.save(new Question("Java", "Hibernate", 
        	    "What is the default cascade type for associations?", 
        	    "ALL", "PERSIST", "NONE", "MERGE", "NONE", 1));
        	questionRepository.save(new Question("Java", "Hibernate", 
        	    "Which annotation is used for inheritance mapping?", 
        	    "@Inheritance", "@Superclass", "@Subclass", "@EntityInheritance", "@Inheritance", 1));
        	questionRepository.save(new Question("Java", "Hibernate", 
        	    "What is the purpose of the @Temporal annotation?", 
        	    "To map date/time fields", "To enable caching", 
        	    "To mark transient fields", "To define a timeout", "To map date/time fields", 1));
        	questionRepository.save(new Question("Java", "Hibernate", 
        	    "Which exception is thrown when an entity is not found?", 
        	    "EntityNotFoundException", "ObjectNotFoundException", 
        	    "HibernateException", "NoResultException", "EntityNotFoundException", 1));
        	
        // JDBC Questions
        questionRepository.save(new Question("Java", "JDBC", 
            "Which interface is used to execute SQL statements?", 
            "Connection", "Statement", "ResultSet", "DriverManager", "Statement", 1));
        questionRepository.save(new Question("Java", "JDBC", 
            "Which method is used to perform DML operations?", 
            "executeQuery()", "executeUpdate()", 
            "execute()", "executeDML()", "executeUpdate()", 1));
        questionRepository.save(new Question("Java", "JDBC", 
            "What is the correct order of JDBC workflow?", 
            "Get Connection -> Create Statement -> Execute Query -> Process Results", 
            "Create Statement -> Get Connection -> Execute Query -> Process Results", 
            "Execute Query -> Get Connection -> Create Statement -> Process Results", 
            "Process Results -> Get Connection -> Create Statement -> Execute Query", 
            "Get Connection -> Create Statement -> Execute Query -> Process Results", 1));
        questionRepository.save(new Question("Java", "JDBC", 
            "Which type of Statement is preferred for repeated executions?", 
            "Statement", "PreparedStatement", 
            "CallableStatement", "ParameterizedStatement", "PreparedStatement", 1));
        questionRepository.save(new Question("Java", "JDBC", 
            "Which method is used to start a transaction?", 
            "begin()", "startTransaction()", 
            "setAutoCommit(false)", "commit()", "setAutoCommit(false)", 1));
        questionRepository.save(new Question("Java", "JDBC", 
        	    "Which method retrieves auto-generated keys after an INSERT?", 
        	    "getGeneratedKeys()", "getKeys()", 
        	    "retrieveKeys()", "fetchKeys()", "getGeneratedKeys()", 1));
        	questionRepository.save(new Question("Java", "JDBC", 
        	    "What is the purpose of the ResultSet interface?", 
        	    "To execute SQL queries", "To represent query results", 
        	    "To manage transactions", "To create statements", "To represent query results", 1));
        	questionRepository.save(new Question("Java", "JDBC", 
        	    "Which JDBC driver type communicates via middleware?", 
        	    "Type 1", "Type 2", "Type 3", "Type 4", "Type 3", 1));
        	questionRepository.save(new Question("Java", "JDBC", 
        	    "What is the purpose of the DatabaseMetaData interface?", 
        	    "To get database schema information", "To execute stored procedures", 
        	    "To manage connections", "To handle transactions", "To get database schema information", 1));
        	questionRepository.save(new Question("Java", "JDBC", 
        	    "Which method is used to call stored procedures?", 
        	    "prepareCall()", "createProcedure()", 
        	    "executeProcedure()", "callStoredProc()", "prepareCall()", 1));
        	questionRepository.save(new Question("Java", "JDBC", 
        	    "What is the default transaction isolation level in JDBC?", 
        	    "TRANSACTION_NONE", "TRANSACTION_READ_UNCOMMITTED", 
        	    "TRANSACTION_READ_COMMITTED", "TRANSACTION_REPEATABLE_READ", "TRANSACTION_READ_COMMITTED", 1));
        	questionRepository.save(new Question("Java", "JDBC", 
        	    "Which interface is used for batch updates?", 
        	    "BatchStatement", "Statement", 
        	    "PreparedStatement", "All of the above", "All of the above", 1));
        	questionRepository.save(new Question("Java", "JDBC", 
        	    "What is the purpose of the setFetchSize() method?", 
        	    "To limit the number of rows returned", "To optimize memory usage for large results", 
        	    "To define a timeout", "To enable caching", "To optimize memory usage for large results", 1));
        	questionRepository.save(new Question("Java", "JDBC", 
        	    "Which JDBC driver type is platform-independent?", 
        	    "Type 1", "Type 2", "Type 3", "Type 4", "Type 4", 1));
        	questionRepository.save(new Question("Java", "JDBC", 
        	    "What does the Connection.setReadOnly(true) method do?", 
        	    "Prevents all database writes", "Optimizes read performance", 
        	    "Enables caching", "Disables transactions", "Optimizes read performance", 1));
        	questionRepository.save(new Question("Java", "JDBC", 
        	    "Which method closes resources automatically in JDBC 4+?", 
        	    "try-with-resources", "closeAll()", 
        	    "autoClose()", "shutdown()", "try-with-resources", 1));
        	questionRepository.save(new Question("Java", "JDBC", 
        	    "What is the purpose of the RowSet interface?", 
        	    "To represent a disconnected ResultSet", "To execute SQL queries", 
        	    "To manage transactions", "To create statements", "To represent a disconnected ResultSet", 1));
        	questionRepository.save(new Question("Java", "JDBC", 
        	    "Which exception is thrown for SQL errors?", 
        	    "SQLException", "DatabaseException", 
        	    "JDBCException", "DataAccessException", "SQLException", 1));
        	questionRepository.save(new Question("Java", "JDBC", 
        	    "What is the purpose of the DataSource interface?", 
        	    "To manage connections", "To execute queries", 
        	    "To handle transactions", "To create statements", "To manage connections", 1));
        	questionRepository.save(new Question("Java", "JDBC", 
        	    "Which method is used to rollback a transaction?", 
        	    "Connection.undo()", "Connection.rollback()", 
        	    "Connection.cancel()", "Connection.revert()", "Connection.rollback()", 1));
        	
        // DSA - Arrays Questions
        questionRepository.save(new Question("Data Structures & Algorithms", "Arrays", 
            "What is the time complexity of accessing an element in an array?", 
            "O(1)", "O(n)", "O(log n)", "O(n^2)", "O(1)", 1));
        questionRepository.save(new Question("Data Structures & Algorithms", "Arrays", 
            "What is the worst-case time complexity of linear search?", 
            "O(1)", "O(log n)", "O(n)", "O(n^2)", "O(n)", 1));
        questionRepository.save(new Question("Data Structures & Algorithms", "Arrays", 
            "Which algorithm is most efficient for sorting small arrays?", 
            "Merge Sort", "Quick Sort", "Insertion Sort", "Heap Sort", "Insertion Sort", 1));
        questionRepository.save(new Question("Data Structures & Algorithms", "Arrays", 
            "What is the main advantage of dynamic arrays over static arrays?", 
            "Faster access", "Smaller memory footprint", 
            "Ability to resize", "Better cache locality", "Ability to resize", 1));
        questionRepository.save(new Question("Data Structures & Algorithms", "Arrays", 
            "In a circular array, how do you compute the next index after the last element?", 
            "(i + 1) % size", "i + 1", 
            "i % size", "size - i", "(i + 1) % size", 1));
        questionRepository.save(new Question("Data Structures & Algorithms", "Arrays", 
        	    "What is the time complexity of inserting an element at the beginning of an array?", 
        	    "O(1)", "O(n)", "O(log n)", "O(n^2)", "O(n)", 1));

        	questionRepository.save(new Question("Data Structures & Algorithms", "Arrays", 
        	    "Which algorithm uses a 'divide and conquer' approach to search sorted arrays?", 
        	    "Linear Search", "Binary Search", "Jump Search", "Interpolation Search", "Binary Search", 1));

        	questionRepository.save(new Question("Data Structures & Algorithms", "Arrays", 
        	    "What is the time complexity of binary search on a sorted array?", 
        	    "O(1)", "O(n)", "O(log n)", "O(n log n)", "O(log n)", 1));

        	questionRepository.save(new Question("Data Structures & Algorithms", "Arrays", 
        	    "Which operation has O(1) time complexity in both static and dynamic arrays?", 
        	    "Insertion at beginning", "Deletion at end", 
        	    "Random access", "Searching", "Random access", 1));

        	questionRepository.save(new Question("Data Structures & Algorithms", "Arrays", 
        	    "What is the main disadvantage of using arrays compared to linked lists?", 
        	    "Fixed size", "Slower access time", 
        	    "More memory usage", "Complex implementation", "Fixed size", 1));

        	questionRepository.save(new Question("Data Structures & Algorithms", "Arrays", 
        	    "Which sorting algorithm has O(n) time complexity in its best case?", 
        	    "Quick Sort", "Merge Sort", 
        	    "Bubble Sort", "Insertion Sort", "Insertion Sort", 1));

        	questionRepository.save(new Question("Data Structures & Algorithms", "Arrays", 
        	    "What is the time complexity of reversing an array in-place?", 
        	    "O(1)", "O(n)", "O(log n)", "O(n^2)", "O(n)", 1));

        	questionRepository.save(new Question("Data Structures & Algorithms", "Arrays", 
        	    "Which data structure is typically used to implement dynamic arrays?", 
        	    "Linked List", "Hash Table", 
        	    "Stack", "None of the above", "None of the above", 1));

        	questionRepository.save(new Question("Data Structures & Algorithms", "Arrays", 
        	    "What is the time complexity of finding the maximum element in an unsorted array?", 
        	    "O(1)", "O(n)", "O(log n)", "O(n^2)", "O(n)", 1));

        	questionRepository.save(new Question("Data Structures & Algorithms", "Arrays", 
        	    "Which algorithm is most efficient for sorting large arrays with O(n log n) worst-case time?", 
        	    "Quick Sort", "Merge Sort", 
        	    "Heap Sort", "Both b and c", "Both b and c", 1));

        	questionRepository.save(new Question("Data Structures & Algorithms", "Arrays", 
        	    "What is the space complexity of merge sort for arrays?", 
        	    "O(1)", "O(n)", "O(log n)", "O(n^2)", "O(n)", 1));

        	questionRepository.save(new Question("Data Structures & Algorithms", "Arrays", 
        	    "Which operation is most efficient with arrays compared to linked lists?", 
        	    "Insertion at beginning", "Deletion at random position", 
        	    "Random access", "Frequent resizing", "Random access", 1));

        	questionRepository.save(new Question("Data Structures & Algorithms", "Arrays", 
        	    "What is the time complexity of removing an element from the middle of an array?", 
        	    "O(1)", "O(n)", "O(log n)", "O(n^2)", "O(n)", 1));

        	questionRepository.save(new Question("Data Structures & Algorithms", "Arrays", 
        	    "Which searching algorithm is best suited for uniformly distributed sorted arrays?", 
        	    "Binary Search", "Jump Search", 
        	    "Interpolation Search", "Linear Search", "Interpolation Search", 1));

        	questionRepository.save(new Question("Data Structures & Algorithms", "Arrays", 
        	    "What is the main advantage of using a two-dimensional array?", 
        	    "Better cache locality", "Represent matrix-like data", 
        	    "Faster access", "Dynamic resizing", "Represent matrix-like data", 1));

        // DSA - Linked Lists Questions
        questionRepository.save(new Question("Data Structures & Algorithms", "Linked Lists", 
            "What is the time complexity of inserting at the head of a linked list?", 
            "O(1)", "O(n)", "O(log n)", "O(n^2)", "O(1)", 1));
        questionRepository.save(new Question("Data Structures & Algorithms", "Linked Lists", 
            "Which of these is not a type of linked list?", 
            "Singly linked", "Doubly linked", 
            "Circular linked", "Multi-dimensional linked", "Multi-dimensional linked", 1));
        questionRepository.save(new Question("Data Structures & Algorithms", "Linked Lists", 
            "What is the main disadvantage of linked lists compared to arrays?", 
            "Slower access time", "Fixed size", 
            "More memory usage", "Complex implementation", "Slower access time", 1));
        questionRepository.save(new Question("Data Structures & Algorithms", "Linked Lists", 
            "How do you detect a cycle in a linked list?", 
            "Hash table", "Floyd's cycle-finding algorithm", 
            "Both a and b", "Neither a nor b", "Both a and b", 1));
        questionRepository.save(new Question("Data Structures & Algorithms", "Linked Lists", 
            "What is a sentinel node in a linked list?", 
            "A node with special data", "A dummy node to simplify operations", 
            "The first node", "The last node", "A dummy node to simplify operations", 1));
        questionRepository.save(new Question("Data Structures & Algorithms", "Linked Lists", 
        	    "What is the time complexity to delete the last node in a singly linked list?", 
        	    "O(1)", "O(n)", "O(log n)", "O(n^2)", "O(n)", 1));
        	questionRepository.save(new Question("Data Structures & Algorithms", "Linked Lists", 
        	    "How do you reverse a singly linked list iteratively?", 
        	    "Using a stack", "By swapping data", 
        	    "By reversing pointers", "All of the above", "By reversing pointers", 1));
        	questionRepository.save(new Question("Data Structures & Algorithms", "Linked Lists", 
        	    "What is the advantage of a doubly linked list over a singly linked list?", 
        	    "Faster insertion", "Lower memory usage", 
        	    "Bidirectional traversal", "Faster search", "Bidirectional traversal", 1));
        	questionRepository.save(new Question("Data Structures & Algorithms", "Linked Lists", 
        	    "Which operation is O(1) in a linked list with a tail pointer?", 
        	    "Insert at head", "Insert at tail", 
        	    "Delete at head", "Search", "Insert at tail", 1));
        	questionRepository.save(new Question("Data Structures & Algorithms", "Linked Lists", 
        	    "What is the purpose of a dummy node in a linked list?", 
        	    "To store metadata", "To simplify edge cases", 
        	    "To improve performance", "To enable random access", "To simplify edge cases", 1));
        	questionRepository.save(new Question("Data Structures & Algorithms", "Linked Lists", 
        	    "How do you find the middle node of a linked list in one pass?", 
        	    "Use two pointers (slow and fast)", "Count nodes and traverse again", 
        	    "Use a stack", "Store nodes in an array", "Use two pointers (slow and fast)", 1));
        	questionRepository.save(new Question("Data Structures & Algorithms", "Linked Lists", 
        	    "What is the time complexity to merge two sorted linked lists?", 
        	    "O(1)", "O(n)", "O(n log n)", "O(n^2)", "O(n)", 1));
        	questionRepository.save(new Question("Data Structures & Algorithms", "Linked Lists", 
        	    "Which problem can be solved using Floyd's cycle-finding algorithm?", 
        	    "Reversing a list", "Finding duplicates", 
        	    "Detecting a cycle", "Sorting a list", "Detecting a cycle", 1));
        	questionRepository.save(new Question("Data Structures & Algorithms", "Linked Lists", 
        	    "What is the space complexity of recursively reversing a linked list?", 
        	    "O(1)", "O(n)", "O(log n)", "O(n^2)", "O(n)", 1));
        	questionRepository.save(new Question("Data Structures & Algorithms", "Linked Lists", 
        	    "How do you remove duplicates from a sorted linked list?", 
        	    "Using a hash set", "By comparing adjacent nodes", 
        	    "By sorting again", "By reversing the list", "By comparing adjacent nodes", 1));
        	questionRepository.save(new Question("Data Structures & Algorithms", "Linked Lists", 
        	    "What is the time complexity to insert a node after a given node?", 
        	    "O(1)", "O(n)", "O(log n)", "O(n^2)", "O(1)", 1));
        	questionRepository.save(new Question("Data Structures & Algorithms", "Linked Lists", 
        	    "Which data structure is typically used to implement a LRU cache?", 
        	    "Array", "Hash table + Doubly linked list", 
        	    "Binary heap", "Stack", "Hash table + Doubly linked list", 1));
        	questionRepository.save(new Question("Data Structures & Algorithms", "Linked Lists", 
        	    "What is the term for a linked list where the last node points to the first?", 
        	    "Singly linked", "Doubly linked", 
        	    "Circular linked", "Multi-linked", "Circular linked", 1));
        	questionRepository.save(new Question("Data Structures & Algorithms", "Linked Lists", 
        	    "How do you check if two linked lists intersect?", 
        	    "Compare all pairs of nodes", "Use a hash set", 
        	    "Traverse and compare tail nodes", "Both b and c", "Both b and c", 1));
        	questionRepository.save(new Question("Data Structures & Algorithms", "Linked Lists", 
        	    "What is the time complexity to find the Nth node from the end?", 
        	    "O(1)", "O(n)", "O(log n)", "O(n^2)", "O(n)", 1));
        
       //Trees
        questionRepository.save(new Question("Data Structures & Algorithms", "Trees", 
                "What is the maximum number of nodes in a binary tree of height h?", 
                "2^h - 1", "2^(h+1) - 1", "h^2", "h^3", "2^h - 1", 1));
            questionRepository.save(new Question("Data Structures & Algorithms", "Trees", 
                "Which traversal gives nodes in non-decreasing order in BST?", 
                "Pre-order", "In-order", "Post-order", "Level-order", "In-order", 1));
            questionRepository.save(new Question("Data Structures & Algorithms", "Trees", 
                "What is the time complexity of searching in a balanced BST?", 
                "O(1)", "O(n)", "O(log n)", "O(n log n)", "O(log n)", 1));
            questionRepository.save(new Question("Data Structures & Algorithms", "Trees", 
                "Which of these is not a self-balancing BST?", 
                "AVL Tree", "Red-Black Tree", "B-Tree", "Splay Tree", "B-Tree", 1));
            questionRepository.save(new Question("Data Structures & Algorithms", "Trees", 
                "What is the height of a complete binary tree with n nodes?", 
                "log n", "n/2", "log(n+1) - 1", "n", "log(n+1) - 1", 1));
            questionRepository.save(new Question("Data Structures & Algorithms", "Trees", 
            	    "What is the minimum height of a binary tree with n nodes?", 
            	    "log n", "n", "log(n+1) - 1", "n/2", "log(n+1) - 1", 1));
            	questionRepository.save(new Question("Data Structures & Algorithms", "Trees", 
            	    "Which traversal is used to delete a binary tree?", 
            	    "Pre-order", "In-order", "Post-order", "Level-order", "Post-order", 1));
            	questionRepository.save(new Question("Data Structures & Algorithms", "Trees", 
            	    "What is the time complexity to find the lowest common ancestor (LCA) in a BST?", 
            	    "O(1)", "O(n)", "O(log n)", "O(n log n)", "O(log n)", 1));
            	questionRepository.save(new Question("Data Structures & Algorithms", "Trees", 
            	    "Which tree property ensures O(log n) height?", 
            	    "Complete", "Balanced", "Full", "Perfect", "Balanced", 1));
            	questionRepository.save(new Question("Data Structures & Algorithms", "Trees", 
            	    "What is the maximum number of nodes at level L in a binary tree?", 
            	    "L", "2^L", "2^(L+1)", "L^2", "2^L", 1));
            	questionRepository.save(new Question("Data Structures & Algorithms", "Trees", 
            	    "Which of these is not a binary tree?", 
            	    "AVL Tree", "B-Tree", "Red-Black Tree", "Splay Tree", "B-Tree", 1));
            	questionRepository.save(new Question("Data Structures & Algorithms", "Trees", 
            	    "What is the time complexity of inserting into a heap?", 
            	    "O(1)", "O(n)", "O(log n)", "O(n log n)", "O(log n)", 1));
            	questionRepository.save(new Question("Data Structures & Algorithms", "Trees", 
            	    "Which tree is used in Unix file systems?", 
            	    "Binary Search Tree", "B-Tree", 
            	    "Trie", "Heap", "B-Tree", 1));
            	questionRepository.save(new Question("Data Structures & Algorithms", "Trees", 
            	    "What is the purpose of a trie?", 
            	    "Efficient searching of strings", "Balancing trees", 
            	    "Sorting numbers", "Graph traversal", "Efficient searching of strings", 1));
            	questionRepository.save(new Question("Data Structures & Algorithms", "Trees", 
            	    "Which traversal is used to copy a binary tree?", 
            	    "Pre-order", "In-order", "Post-order", "Level-order", "Pre-order", 1));
            	questionRepository.save(new Question("Data Structures & Algorithms", "Trees", 
            	    "What is the time complexity to check if a tree is a BST?", 
            	    "O(1)", "O(n)", "O(log n)", "O(n^2)", "O(n)", 1));
            	questionRepository.save(new Question("Data Structures & Algorithms", "Trees", 
            	    "Which tree guarantees O(1) for search, insert, and delete in average case?", 
            	    "AVL Tree", "Red-Black Tree", 
            	    "Hash Tree", "Treap", "Treap", 1));
            	questionRepository.save(new Question("Data Structures & Algorithms", "Trees", 
            	    "What is the main advantage of a B-Tree over a BST?", 
            	    "Faster insertions", "Better cache performance", 
            	    "Lower memory usage", "Simpler implementation", "Better cache performance", 1));
            	questionRepository.save(new Question("Data Structures & Algorithms", "Trees", 
            	    "Which tree is used in Huffman coding?", 
            	    "Binary Search Tree", "Heap", 
            	    "Trie", "AVL Tree", "Heap", 1));
            	questionRepository.save(new Question("Data Structures & Algorithms", "Trees", 
            	    "What is the time complexity of finding the smallest element in a BST?", 
            	    "O(1)", "O(n)", "O(log n)", "O(n log n)", "O(log n)", 1));

            // Graphs Questions
            questionRepository.save(new Question("Data Structures & Algorithms", "Graphs", 
                "Which algorithm is used to find shortest path in unweighted graphs?", 
                "Dijkstra's", "Bellman-Ford", "BFS", "DFS", "BFS", 1));
            questionRepository.save(new Question("Data Structures & Algorithms", "Graphs", 
                "What is the time complexity of DFS on a graph with V vertices and E edges?", 
                "O(V)", "O(E)", "O(V + E)", "O(V * E)", "O(V + E)", 1));
            questionRepository.save(new Question("Data Structures & Algorithms", "Graphs", 
                "Which graph representation is most space-efficient for sparse graphs?", 
                "Adjacency Matrix", "Adjacency List", 
                "Incidence Matrix", "Edge List", "Adjacency List", 1));
            questionRepository.save(new Question("Data Structures & Algorithms", "Graphs", 
                "What is the minimum number of edges in a connected graph with n vertices?", 
                "n", "n-1", "n^2", "n(n-1)/2", "n-1", 1));
            questionRepository.save(new Question("Data Structures & Algorithms", "Graphs", 
                "Which algorithm is used to detect cycles in a directed graph?", 
                "Kruskal's", "Prim's", "DFS", "BFS", "DFS", 1));
            questionRepository.save(new Question("Data Structures & Algorithms", "Graphs", 
            	    "Which algorithm is used to find the shortest path in a weighted graph with no negative edges?", 
            	    "BFS", "DFS", "Dijkstra's", "Bellman-Ford", "Dijkstra's", 1));
            	questionRepository.save(new Question("Data Structures & Algorithms", "Graphs", 
            	    "What is the time complexity of Dijkstra's algorithm with a binary heap?", 
            	    "O(V)", "O(E)", "O((V + E) log V)", "O(V log E)", "O((V + E) log V)", 1));
            	questionRepository.save(new Question("Data Structures & Algorithms", "Graphs", 
            	    "Which algorithm is used to find the minimum spanning tree (MST)?", 
            	    "Dijkstra's", "Bellman-Ford", "Kruskal's", "Floyd-Warshall", "Kruskal's", 1));
            	questionRepository.save(new Question("Data Structures & Algorithms", "Graphs", 
            	    "What is the time complexity of Kruskal's algorithm?", 
            	    "O(V)", "O(E log E)", "O(V log V)", "O(V^2)", "O(E log E)", 1));
            	questionRepository.save(new Question("Data Structures & Algorithms", "Graphs", 
            	    "Which graph algorithm uses a greedy approach?", 
            	    "DFS", "BFS", "Prim's", "Floyd-Warshall", "Prim's", 1));
            	questionRepository.save(new Question("Data Structures & Algorithms", "Graphs", 
            	    "What is the purpose of topological sorting?", 
            	    "To sort edges by weight", "To order vertices in a DAG", 
            	    "To find cycles", "To compute shortest paths", "To order vertices in a DAG", 1));
            	questionRepository.save(new Question("Data Structures & Algorithms", "Graphs", 
            	    "Which algorithm is used to find strongly connected components?", 
            	    "Kosaraju's", "Dijkstra's", 
            	    "Prim's", "Kruskal's", "Kosaraju's", 1));
            	questionRepository.save(new Question("Data Structures & Algorithms", "Graphs", 
            	    "What is the time complexity of the Floyd-Warshall algorithm?", 
            	    "O(V)", "O(V^2)", "O(V^3)", "O(V log V)", "O(V^3)", 1));
            	questionRepository.save(new Question("Data Structures & Algorithms", "Graphs", 
            	    "Which graph representation is best for dense graphs?", 
            	    "Adjacency List", "Adjacency Matrix", 
            	    "Edge List", "Incidence Matrix", "Adjacency Matrix", 1));
            	questionRepository.save(new Question("Data Structures & Algorithms", "Graphs", 
            	    "What is the maximum number of edges in a directed graph with n vertices?", 
            	    "n", "n(n-1)/2", "n(n-1)", "n^2", "n(n-1)", 1));
            	questionRepository.save(new Question("Data Structures & Algorithms", "Graphs", 
            	    "Which algorithm is used to solve the all-pairs shortest path problem?", 
            	    "Dijkstra's", "Bellman-Ford", 
            	    "Floyd-Warshall", "Prim's", "Floyd-Warshall", 1));
            	questionRepository.save(new Question("Data Structures & Algorithms", "Graphs", 
            	    "What is the time complexity of Prim's algorithm with a binary heap?", 
            	    "O(V)", "O(E log V)", "O(V log V)", "O(V^2)", "O(E log V)", 1));
            	questionRepository.save(new Question("Data Structures & Algorithms", "Graphs", 
            	    "Which problem can be solved using the Union-Find data structure?", 
            	    "Shortest path", "Cycle detection", 
            	    "Topological sort", "Strongly connected components", "Cycle detection", 1));
            	questionRepository.save(new Question("Data Structures & Algorithms", "Graphs", 
            	    "What is the purpose of the Bellman-Ford algorithm?", 
            	    "To find MST", "To detect negative cycles", 
            	    "To perform topological sort", "To find SCCs", "To detect negative cycles", 1));
            	questionRepository.save(new Question("Data Structures & Algorithms", "Graphs", 
            	    "Which graph traversal is used for backtracking problems?", 
            	    "BFS", "DFS", "Dijkstra's", "A*", "DFS", 1));

            // Sorting Questions
            questionRepository.save(new Question("Data Structures & Algorithms", "Sorting", 
                "Which sorting algorithm has worst-case O(n^2) but average O(n log n)?", 
                "Merge Sort", "Quick Sort", "Heap Sort", "Bubble Sort", "Quick Sort", 1));
            questionRepository.save(new Question("Data Structures & Algorithms", "Sorting", 
                "What is the best sorting algorithm when input is mostly sorted?", 
                "Merge Sort", "Insertion Sort", "Quick Sort", "Selection Sort", "Insertion Sort", 1));
            questionRepository.save(new Question("Data Structures & Algorithms", "Sorting", 
                "Which is not a stable sorting algorithm?", 
                "Merge Sort", "Bubble Sort", "Quick Sort", "Insertion Sort", "Quick Sort", 1));
            questionRepository.save(new Question("Data Structures & Algorithms", "Sorting", 
                "What is the time complexity of Heap Sort?", 
                "O(n)", "O(n log n)", "O(n^2)", "O(log n)", "O(n log n)", 1));
            questionRepository.save(new Question("Data Structures & Algorithms", "Sorting", 
                "Which algorithm uses divide and conquer approach?", 
                "Bubble Sort", "Selection Sort", "Merge Sort", "Insertion Sort", "Merge Sort", 1));
            questionRepository.save(new Question("Data Structures & Algorithms", "Sorting", 
            	    "Which sorting algorithm works by repeatedly selecting the smallest element?", 
            	    "Insertion Sort", "Selection Sort", 
            	    "Bubble Sort", "Quick Sort", "Selection Sort", 1));
            	questionRepository.save(new Question("Data Structures & Algorithms", "Sorting", 
            	    "What is the best-case time complexity of Bubble Sort?", 
            	    "O(n)", "O(n log n)", "O(n^2)", "O(log n)", "O(n)", 1));
            	questionRepository.save(new Question("Data Structures & Algorithms", "Sorting", 
            	    "Which sorting algorithm is not comparison-based?", 
            	    "Merge Sort", "Quick Sort", 
            	    "Counting Sort", "Heap Sort", "Counting Sort", 1));
            	questionRepository.save(new Question("Data Structures & Algorithms", "Sorting", 
            	    "What is the time complexity of Counting Sort for a range of size k?", 
            	    "O(n)", "O(n + k)", "O(n log n)", "O(n^2)", "O(n + k)", 1));
            	questionRepository.save(new Question("Data Structures & Algorithms", "Sorting", 
            	    "Which algorithm is efficient for sorting linked lists?", 
            	    "Quick Sort", "Merge Sort", 
            	    "Heap Sort", "Insertion Sort", "Merge Sort", 1));
            	questionRepository.save(new Question("Data Structures & Algorithms", "Sorting", 
            	    "What is the space complexity of Quick Sort in the worst case?", 
            	    "O(1)", "O(n)", "O(log n)", "O(n^2)", "O(n)", 1));
            	questionRepository.save(new Question("Data Structures & Algorithms", "Sorting", 
            	    "Which sorting algorithm is in-place but not stable?", 
            	    "Merge Sort", "Quick Sort", 
            	    "Insertion Sort", "Bubble Sort", "Quick Sort", 1));
            	questionRepository.save(new Question("Data Structures & Algorithms", "Sorting", 
            	    "What is the time complexity of Radix Sort for n numbers with d digits?", 
            	    "O(n)", "O(n log n)", "O(dn)", "O(n^2)", "O(dn)", 1));
            	questionRepository.save(new Question("Data Structures & Algorithms", "Sorting", 
            	    "Which algorithm is used internally by Java's Arrays.sort() for primitives?", 
            	    "Quick Sort", "Merge Sort", 
            	    "Tim Sort", "Heap Sort", "Quick Sort", 1));
            	questionRepository.save(new Question("Data Structures & Algorithms", "Sorting", 
            	    "What is the worst-case time complexity of Merge Sort?", 
            	    "O(n)", "O(n log n)", "O(n^2)", "O(log n)", "O(n log n)", 1));
            	questionRepository.save(new Question("Data Structures & Algorithms", "Sorting", 
            	    "Which sorting algorithm is adaptive?", 
            	    "Selection Sort", "Quick Sort", 
            	    "Insertion Sort", "Heap Sort", "Insertion Sort", 1));
            	questionRepository.save(new Question("Data Structures & Algorithms", "Sorting", 
            	    "What is the main disadvantage of Bubble Sort?", 
            	    "High time complexity", "Not stable", 
            	    "High space complexity", "Not in-place", "High time complexity", 1));
            	questionRepository.save(new Question("Data Structures & Algorithms", "Sorting", 
            	    "Which algorithm is hybrid (combines two approaches)?", 
            	    "Tim Sort", "Quick Sort", 
            	    "Heap Sort", "Merge Sort", "Tim Sort", 1));
            	questionRepository.save(new Question("Data Structures & Algorithms", "Sorting", 
            	    "What is the time complexity of Shell Sort in the worst case?", 
            	    "O(n)", "O(n log n)", "O(n^2)", "O(log n)", "O(n^2)", 1));
            	questionRepository.save(new Question("Data Structures & Algorithms", "Sorting", 
            	    "Which sorting algorithm is used for external sorting?", 
            	    "Quick Sort", "Merge Sort", 
            	    "Heap Sort", "Insertion Sort", "Merge Sort", 1));

            // ========== Python Questions ==========
            // Basics Questions
            questionRepository.save(new Question("Python", "Basics", 
                "Which of these is not a core data type in Python?", 
                "List", "Class", "Dictionary", "Tuple", "Class", 1));
            questionRepository.save(new Question("Python", "Basics", 
                "How do you start a Python interactive shell?", 
                "python start", "python shell", 
                "python", "py", "python", 1));
            questionRepository.save(new Question("Python", "Basics", 
                "What is the output of 'hello'[1:]?", 
                "h", "e", "ello", "hello", "ello", 1));
            questionRepository.save(new Question("Python", "Basics", 
                "Which keyword is used for function definition?", 
                "def", "function", "define", "func", "def", 1));
            questionRepository.save(new Question("Python", "Basics", 
                "What does PEP stand for in Python?", 
                "Python Enhancement Proposal", "Python Execution Process", 
                "Python Evaluation Protocol", "Python Extension Package", "Python Enhancement Proposal", 1));
            questionRepository.save(new Question("Python", "Basics", 
            	    "Which operator is used for exponentiation in Python?", 
            	    "^", "**", "^^", "*^", "**", 1));
            	questionRepository.save(new Question("Python", "Basics", 
            	    "What is the output of `print(3 * 'abc')`?", 
            	    "abcabcabc", "3abc", "abc3", "Error", "abcabcabc", 1));
            	questionRepository.save(new Question("Python", "Basics", 
            	    "How do you comment multiple lines in Python?", 
            	    "// ... //", "/* ... */", "# ... #", "\"\"\" ... \"\"\"", "\"\"\" ... \"\"\"", 1));
            	questionRepository.save(new Question("Python", "Basics", 
            	    "Which function converts a string to lowercase?", 
            	    "lower()", "toLower()", "casefold()", "Both a and c", "Both a and c", 1));
            	questionRepository.save(new Question("Python", "Basics", 
            	    "What does `range(5)` generate?", 
            	    "[0 1 2 3 4]", "[1 2 3 4 5]", "5 numbers starting from 0", "Both a and c", "Both a and c", 1));
            	questionRepository.save(new Question("Python", "Basics", 
            	    "Which is NOT a valid variable name?", 
            	    "_var", "var1", "1var", "var_1", "1var", 1));
            	questionRepository.save(new Question("Python", "Basics", 
            	    "What is the result of `10 / 3` in Python 3?", 
            	    "3", "3.333...", "3.0", "3.3333333333333335", "3.3333333333333335", 1));
            	questionRepository.save(new Question("Python", "Basics", 
            	    "How do you check a variable's type?", 
            	    "type()", "typeof()", "varType()", "checkType()", "type()", 1));
            	questionRepository.save(new Question("Python", "Basics", 
            	    "Which collection is ordered and changeable?", 
            	    "Set", "Tuple", "List", "Dictionary", "List", 1));
            	questionRepository.save(new Question("Python", "Basics", 
            	    "What does `'hello'.upper()` return?", 
            	    "HELLO", "Hello", "hello", "Error", "HELLO", 1));
            	questionRepository.save(new Question("Python", "Basics", 
            	    "How do you create an empty dictionary?", 
            	    "{}", "dict()", "[]", "Both a and b", "Both a and b", 1));
            	questionRepository.save(new Question("Python", "Basics", 
            	    "What is the output of `bool('False')`?", 
            	    "False", "True", "Error", "None", "True", 1));
            	questionRepository.save(new Question("Python", "Basics", 
            	    "Which module is used for command-line arguments?", 
            	    "sys", "os", "argparse", "Both a and c", "Both a and c", 1));
            	questionRepository.save(new Question("Python", "Basics", 
            	    "How do you open a file for reading?", 
            	    "open('file.txt'  'r')", "open('file.txt')", 
            	    "open('file.txt'  'read')", "Both a and b", "Both a and b", 1));
            	questionRepository.save(new Question("Python", "Basics", 
            	    "What does `__name__ == '__main__'` check?", 
            	    "If the script is imported", "If the script is run directly", 
            	    "If it's the main thread", "If the file exists", "If the script is run directly", 1));

            // OOP Questions
            questionRepository.save(new Question("Python", "OOP", 
                "Which method is called when an object is created?", 
                "__init__", "__new__", "__start__", "__create__", "__init__", 1));
            questionRepository.save(new Question("Python", "OOP", 
                "What is the purpose of self in Python methods?", 
                "Reference to the class", "Reference to the instance", 
                "Reference to the superclass", "Reference to the module", "Reference to the instance", 1));
            questionRepository.save(new Question("Python", "OOP", 
                "Which decorator is used for class methods?", 
                "@classmethod", "@staticmethod", 
                "@instancemethod", "@objectmethod", "@classmethod", 1));
            questionRepository.save(new Question("Python", "OOP", 
                "How do you make a member private in Python?", 
                "Using private keyword", "Prefix with __", 
                "Prefix with _", "Cannot be done", "Prefix with __", 1));
            questionRepository.save(new Question("Python", "OOP", 
                "What is multiple inheritance in Python?", 
                "A class with multiple methods", "A class inheriting from multiple classes", 
                "A class with multiple instances", "A class with multiple attributes", "A class inheriting from multiple classes", 1));
            questionRepository.save(new Question("Python", "OOP", 
            	    "Which method is called when an object is printed?", 
            	    "__str__", "__repr__", "__print__", "Both a and b", "Both a and b", 1));
            	questionRepository.save(new Question("Python", "OOP", 
            	    "How do you check if an object is an instance of a class?", 
            	    "instanceof()", "isinstance()", "type()", "checkClass()", "isinstance()", 1));
            	questionRepository.save(new Question("Python", "OOP", 
            	    "What is method overriding?", 
            	    "Changing method parameters", "Redefining a parent class method", 
            	    "Hiding a method", "Making a method private", "Redefining a parent class method", 1));
            	questionRepository.save(new Question("Python", "OOP", 
            	    "Which decorator is used for properties?", 
            	    "@property", "@attribute", "@getter", "@var", "@property", 1));
            	questionRepository.save(new Question("Python", "OOP", 
            	    "What is the purpose of `super()`?", 
            	    "To call parent class methods", "To create superclasses", 
            	    "To improve performance", "To make classes abstract", "To call parent class methods", 1));
            	questionRepository.save(new Question("Python", "OOP", 
            	    "How do you make an abstract class?", 
            	    "Using @abstract", "Inheriting from ABC", 
            	    "Using abstract keyword", "Both a and b", "Inheriting from ABC", 1));
            	questionRepository.save(new Question("Python", "OOP", 
            	    "What is encapsulation?", 
            	    "Hiding implementation details", "Combining data and methods", 
            	    "Both a and b", "Inheriting properties", "Both a and b", 1));
            	questionRepository.save(new Question("Python", "OOP", 
            	    "Which method is used for operator overloading?", 
            	    "__oper__", "__op__", "Special methods like __add__", "Cannot be done", "Special methods like __add__", 1));
            	questionRepository.save(new Question("Python", "OOP", 
            	    "What is polymorphism?", 
            	    "One interface - multiple forms", "Many classes - one form", 
            	    "Method hiding", "Data abstraction", "One interface - multiple forms", 1));
            	questionRepository.save(new Question("Python", "OOP", 
            	    "How do you create a static method?", 
            	    "@staticmethod", "@classmethod", 
            	    "static keyword", "Using self", "@staticmethod", 1));
            	questionRepository.save(new Question("Python", "OOP", 
            	    "What is the purpose of `__slots__`?", 
            	    "To limit attributes", "To improve performance", 
            	    "To make class immutable", "Both a and b", "Both a and b", 1));
            	questionRepository.save(new Question("Python", "OOP", 
            	    "Which method is called when an object is deleted?", 
            	    "__del__", "__delete__", "__remove__", "__destroy__", "__del__", 1));
            	questionRepository.save(new Question("Python", "OOP", 
            	    "What is a metaclass?", 
            	    "Class of a class", "Superclass", 
            	    "Abstract class", "Static class", "Class of a class", 1));
            	questionRepository.save(new Question("Python", "OOP", 
            	    "How do you implement interfaces in Python?", 
            	    "Using interface keyword", "Using abstract classes", 
            	    "Using protocols", "Both b and c", "Both b and c", 1));
            	questionRepository.save(new Question("Python", "OOP", 
            	    "What is the purpose of `__call__`?", 
            	    "To make instances callable", "To handle exceptions", 
            	    "To initialize objects", "To delete objects", "To make instances callable", 1));

            // Data Science Questions
            questionRepository.save(new Question("Python", "Data Science", 
                "Which library is fundamental for numerical computing in Python?", 
                "NumPy", "Pandas", "Matplotlib", "SciPy", "NumPy", 1));
            questionRepository.save(new Question("Python", "Data Science", 
                "What is the primary data structure in Pandas?", 
                "Array", "DataFrame", "List", "Dictionary", "DataFrame", 1));
            questionRepository.save(new Question("Python", "Data Science", 
                "Which method is used to read CSV files in Pandas?", 
                "read_csv()", "open_csv()", 
                "load_csv()", "import_csv()", "read_csv()", 1));
            questionRepository.save(new Question("Python", "Data Science", 
                "What does the 'iloc' method do in Pandas?", 
                "Index-based selection", "Label-based selection", 
                "Boolean indexing", "Random selection", "Index-based selection", 1));
            questionRepository.save(new Question("Python", "Data Science", 
                "Which library is used for plotting in Python?", 
                "NumPy", "Pandas", "Matplotlib", "SciPy", "Matplotlib", 1));
            questionRepository.save(new Question("Python", "Data Science", 
            	    "Which method is used to drop missing values in Pandas?", 
            	    "dropna()", "removeNA()", "clean()", "purge()", "dropna()", 1));
            	questionRepository.save(new Question("Python", "Data Science", 
            	    "What is the purpose of `groupby()` in Pandas?", 
            	    "To sort data", "To group data by categories", 
            	    "To filter data", "To merge DataFrames", "To group data by categories", 1));
            	questionRepository.save(new Question("Python", "Data Science", 
            	    "Which library is used for machine learning in Python?", 
            	    "NumPy", "Pandas", "scikit-learn", "TensorFlow", "scikit-learn", 1));
            	questionRepository.save(new Question("Python", "Data Science", 
            	    "How do you create a Series in Pandas?", 
            	    "pd.Series()", "pd.List()", "pd.Array()", "pd.Data()", "pd.Series()", 1));
            	questionRepository.save(new Question("Python", "Data Science", 
            	    "What does `df.describe()` return?", 
            	    "Statistical summary", "First 5 rows", 
            	    "Column names", "Data types", "Statistical summary", 1));
            	questionRepository.save(new Question("Python", "Data Science", 
            	    "Which method merges DataFrames?", 
            	    "concat()", "merge()", "join()", "All of the above", "All of the above", 1));
            	questionRepository.save(new Question("Python", "Data Science", 
            	    "What is the purpose of `sns.heatmap()`?", 
            	    "To plot histograms", "To visualize correlations", 
            	    "To create scatter plots", "To draw 3D plots", "To visualize correlations", 1));
            	questionRepository.save(new Question("Python", "Data Science", 
            	    "Which function creates a bar plot in Matplotlib?", 
            	    "plt.bar()", "plt.barplot()", 
            	    "plt.plot(kind='bar')", "Both a and c", "Both a and c", 1));
            	questionRepository.save(new Question("Python", "Data Science", 
            	    "How do you handle categorical data in scikit-learn?", 
            	    "LabelEncoder", "OneHotEncoder", 
            	    "Both a and b", "Cannot be done", "Both a and b", 1));
            	questionRepository.save(new Question("Python", "Data Science", 
            	    "What is the purpose of `train_test_split()`?", 
            	    "To split data into training and test sets", "To split arrays", 
            	    "To divide DataFrames", "To shuffle data", "To split data into training and test sets", 1));
            	questionRepository.save(new Question("Python", "Data Science", 
            	    "Which method is used to apply a function to a DataFrame?", 
            	    "apply()", "map()", "transform()", "convert()", "apply()", 1));
            	questionRepository.save(new Question("Python", "Data Science", 
            	    "What does `df.pivot_table()` do?", 
            	    "Creates a pivot table", "Transposes DataFrame", 
            	    "Melts DataFrame", "Filters data", "Creates a pivot table", 1));
            	questionRepository.save(new Question("Python", "Data Science", 
            	    "Which library is used for deep learning?", 
            	    "scikit-learn", "TensorFlow", 
            	    "NumPy", "Pandas", "TensorFlow", 1));
            	questionRepository.save(new Question("Python", "Data Science", 
            	    "How do you handle missing data in Pandas?", 
            	    "fillna()", "dropna()", 
            	    "interpolate()", "All of the above", "All of the above", 1));
            	questionRepository.save(new Question("Python", "Data Science", 
            	    "What is the purpose of `StandardScaler`?", 
            	    "To normalize data", "To encode labels", 
            	    "To split data", "To visualize data", "To normalize data", 1));
            
            // Django Questions
            questionRepository.save(new Question("Python", "Django", 
                "What is Django's primary database?", 
                "MySQL", "PostgreSQL", "SQLite", "Oracle", "SQLite", 1));
            questionRepository.save(new Question("Python", "Django", 
                "Which command starts a new Django project?", 
                "django-admin startproject", "django create project", 
                "python -m django new project", "python django startproject", "django-admin startproject", 1));
            questionRepository.save(new Question("Python", "Django", 
                "What is Django's ORM?", 
                "Object-Relational Mapping", "Object-Role Modeling", 
                "Object-Reference Model", "Object-Relational Model", "Object-Relational Mapping", 1));
            questionRepository.save(new Question("Python", "Django", 
                "Which file contains Django project settings?", 
                "settings.py", "config.py", 
                "django.conf", "project.ini", "settings.py", 1));
            questionRepository.save(new Question("Python", "Django", 
                "What is the purpose of Django's manage.py?", 
                "Database management", "Command-line utility", 
                "URL routing", "Template rendering", "Command-line utility", 1));
            questionRepository.save(new Question("Python", "Django", 
            	    "Which command creates a new Django app?", 
            	    "python manage.py startapp", "django-admin startapp", 
            	    "python manage.py newapp", "django createapp", "python manage.py startapp", 1));
            	questionRepository.save(new Question("Python", "Django", 
            	    "Where are Django templates stored?", 
            	    "templates/ directory", "static/ directory", 
            	    "appname/templates/appname/", "Both a and c", "Both a and c", 1));
            	questionRepository.save(new Question("Python", "Django", 
            	    "What is the purpose of `urls.py`?", 
            	    "To define URL patterns", "To configure settings", 
            	    "To handle requests", "To define models", "To define URL patterns", 1));
            	questionRepository.save(new Question("Python", "Django", 
            	    "Which ORM method performs SQL SELECT?", 
            	    "get()", "filter()", 
            	    "all()", "All of the above", "All of the above", 1));
            	questionRepository.save(new Question("Python", "Django", 
            	    "How do you create a superuser?", 
            	    "python manage.py createsuperuser", "django-admin createsuperuser", 
            	    "python manage.py admin create", "django create admin", "python manage.py createsuperuser", 1));
            	questionRepository.save(new Question("Python", "Django", 
            	    "What is the purpose of middleware?", 
            	    "To process requests/responses", "To define URLs", 
            	    "To create templates", "To handle forms", "To process requests/responses", 1));
            	questionRepository.save(new Question("Python", "Django", 
            	    "Which file defines database models?", 
            	    "models.py", "db.py", 
            	    "schema.py", "tables.py", "models.py", 1));
            	questionRepository.save(new Question("Python", "Django", 
            	    "What is Django REST framework?", 
            	    "A template engine", "An ORM", 
            	    "A toolkit for building APIs", "A testing framework", "A toolkit for building APIs", 1));
            	questionRepository.save(new Question("Python", "Django", 
            	    "How do you run Django tests?", 
            	    "python manage.py test", "django-admin test", 
            	    "python test.py", "django test", "python manage.py test", 1));
            	questionRepository.save(new Question("Python", "Django", 
            	    "What is the purpose of `STATIC_URL`?", 
            	    "To define static file URLs", "To configure databases", 
            	    "To set up email", "To define middleware", "To define static file URLs", 1));
            	questionRepository.save(new Question("Python", "Django", 
            	    "Which template tag loads static files?", 
            	    "{% load static %}", "{% static %}", 
            	    "{% load staticfiles %}", "{% include static %}", "{% load static %}", 1));
            	questionRepository.save(new Question("Python", "Django", 
            	    "What is the purpose of `migrations/`?", 
            	    "To store database schema changes", "To store static files", 
            	    "To handle URLs", "To define views", "To store database schema changes", 1));
            	questionRepository.save(new Question("Python", "Django", 
            	    "How do you include another URLconf?", 
            	    "include()", "extend()", 
            	    "import()", "route()", "include()", 1));
            	questionRepository.save(new Question("Python", "Django", 
            	    "Which method handles GET requests in a view?", 
            	    "get()", "get_object()", 
            	    "get_context_data()", "All of the above", "get()", 1));
            	questionRepository.save(new Question("Python", "Django", 
            	    "What is the purpose of `@login_required`?", 
            	    "To restrict access to logged-in users", "To handle logins", 
            	    "To create user accounts", "To check permissions", "To restrict access to logged-in users", 1));

            // Flask Questions
            questionRepository.save(new Question("Python", "Flask", 
                "Flask is a:", 
                "Full-stack framework", "Microframework", 
                "Asynchronous framework", "ORM framework", "Microframework", 1));
            questionRepository.save(new Question("Python", "Flask", 
                "Which decorator is used to define routes in Flask?", 
                "@route", "@app.route", 
                "@flask.route", "@path", "@app.route", 1));
            questionRepository.save(new Question("Python", "Flask", 
                "How do you run a Flask application?", 
                "flask run", "python app.py", 
                "Both a and b", "Neither a nor b", "Both a and b", 1));
            questionRepository.save(new Question("Python", "Flask", 
                "What is the default template engine in Flask?", 
                "Mako", "Jinja2", 
                "Django Templates", "Cheetah", "Jinja2", 1));
            questionRepository.save(new Question("Python", "Flask", 
                "How do you access request data in Flask?", 
                "request.args", "request.form", 
                "request.json", "All of the above", "All of the above", 1));
            questionRepository.save(new Question("Python", "Flask", 
            	    "How do you set a secret key in Flask?", 
            	    "app.key = 'secret'", "app.secret_key = 'secret'", 
            	    "app.config['SECRET_KEY'] = 'secret'", "Both b and c", "Both b and c", 1));
            	questionRepository.save(new Question("Python", "Flask", 
            	    "What is the purpose of `url_for()`?", 
            	    "To generate URLs", "To parse URLs", 
            	    "To validate URLs", "To redirect URLs", "To generate URLs", 1));
            	questionRepository.save(new Question("Python", "Flask", 
            	    "How do you create a Flask Blueprint?", 
            	    "Blueprint()", "FlaskBlueprint()", 
            	    "create_blueprint()", "new_blueprint()", "Blueprint()", 1));
            	questionRepository.save(new Question("Python", "Flask", 
            	    "Which extension is used for Flask-SQLAlchemy?", 
            	    "flask_sqlalchemy", "flask_sql", 
            	    "flask_db", "flask_orm", "flask_sqlalchemy", 1));
            	questionRepository.save(new Question("Python", "Flask", 
            	    "How do you access form data in Flask?", 
            	    "request.form", "request.data", 
            	    "request.args", "request.json", "request.form", 1));
            	questionRepository.save(new Question("Python", "Flask", 
            	    "What is the purpose of `flash()`?", 
            	    "To display messages", "To handle errors", 
            	    "To log events", "To cache data", "To display messages", 1));
            	questionRepository.save(new Question("Python", "Flask", 
            	    "How do you enable debug mode?", 
            	    "app.debug = True", "app.run(debug=True)", 
            	    "Both a and b", "FLASK_DEBUG=1", "Both a and b", 1));
            	questionRepository.save(new Question("Python", "Flask", 
            	    "Which decorator handles errors?", 
            	    "@errorhandler", "@flask.error", 
            	    "@app.error", "@handle_error", "@errorhandler", 1));
            	questionRepository.save(new Question("Python", "Flask", 
            	    "How do you serve static files in Flask?", 
            	    "static/ directory", "Using send_static_file()", 
            	    "Both a and b", "Cannot be done", "Both a and b", 1));
            	questionRepository.save(new Question("Python", "Flask", 
            	    "What is the purpose of `g` object?", 
            	    "To store global data", "To handle GET requests", 
            	    "To generate URLs", "To manage sessions", "To store global data", 1));
            	questionRepository.save(new Question("Python", "Flask", 
            	    "Which extension is used for authentication?", 
            	    "Flask-Login", "Flask-Auth", 
            	    "Flask-User", "Flask-Security", "Flask-Login", 1));
            	questionRepository.save(new Question("Python", "Flask", 
            	    "How do you create a REST API in Flask?", 
            	    "Flask-RESTful", "Flask-API", 
            	    "Manually with routes", "All of the above", "All of the above", 1));
            	questionRepository.save(new Question("Python", "Flask", 
            	    "What is the purpose of `before_request`?", 
            	    "To run code before each request", "To handle errors", 
            	    "To validate data", "To cache responses", "To run code before each request", 1));
            	questionRepository.save(new Question("Python", "Flask", 
            	    "How do you parse JSON requests?", 
            	    "request.json", "request.get_json()", 
            	    "Both a and b", "Cannot be done", "Both a and b", 1));
            	questionRepository.save(new Question("Python", "Flask", 
            	    "Which command runs a Flask app in production?", 
            	    "flask run", "gunicorn", 
            	    "python app.py", "Both b and c", "Both b and c", 1));

            // ========== Operating Systems Questions ==========
            // Processes Questions
            questionRepository.save(new Question("Operating Systems", "Processes", 
                "What is a process in OS?", 
                "A program in execution", "A file on disk", 
                "A memory location", "A CPU register", "A program in execution", 1));
            questionRepository.save(new Question("Operating Systems", "Processes", 
                "What is PCB?", 
                "Process Control Block", "Program Counter Block", 
                "Process Communication Bus", "Processor Cache Buffer", "Process Control Block", 1));
            questionRepository.save(new Question("Operating Systems", "Processes", 
                "Which state is not a process state?", 
                "New", "Ready", "Running", "Destroyed", "Destroyed", 1));
            questionRepository.save(new Question("Operating Systems", "Processes", 
                "What is context switching?", 
                "Changing CPU registers", "Swapping processes", 
                "Saving/restoring process state", "All of the above", "All of the above", 1));
            questionRepository.save(new Question("Operating Systems", "Processes", 
                "What is the main difference between process and thread?", 
                "Processes share memory", "Threads are lighter", 
                "Processes have own address space", "Both b and c", "Both b and c", 1));
            questionRepository.save(new Question("Operating Systems", "Processes", 
            	    "What is a zombie process?", 
            	    "A process that has completed but remains in process table",
            	    "A process using too much memory",
            	    "A crashed process",
            	    "A process waiting for I/O",
            	    "A process that has completed but remains in process table", 1));

            	questionRepository.save(new Question("Operating Systems", "Processes", 
            	    "What is the fork() system call used for?", 
            	    "Creating new processes",
            	    "Terminating processes",
            	    "Synchronizing processes",
            	    "Communicating between processes",
            	    "Creating new processes", 1));

            	questionRepository.save(new Question("Operating Systems", "Processes", 
            	    "Which IPC mechanism is fastest?", 
            	    "Pipes",
            	    "Message queues",
            	    "Shared memory",
            	    "Sockets",
            	    "Shared memory", 1));

            	questionRepository.save(new Question("Operating Systems", "Processes", 
            	    "What is the main purpose of system calls?", 
            	    "User-space to kernel-space communication",
            	    "Process scheduling",
            	    "Memory allocation",
            	    "File system operations",
            	    "User-space to kernel-space communication", 1));

            	questionRepository.save(new Question("Operating Systems", "Processes", 
            	    "Which is NOT a process scheduling queue?", 
            	    "Ready queue",
            	    "Job queue",
            	    "Device queue",
            	    "Termination queue",
            	    "Termination queue", 1));

            	questionRepository.save(new Question("Operating Systems", "Processes", 
            	    "What is process synchronization needed for?", 
            	    "Preventing race conditions",
            	    "Reducing context switches",
            	    "Improving CPU utilization",
            	    "All of the above",
            	    "Preventing race conditions", 1));

            	questionRepository.save(new Question("Operating Systems", "Processes", 
            	    "Which is NOT a process termination reason?", 
            	    "Normal exit",
            	    "Error exit",
            	    "Fatal error",
            	    "Context switch",
            	    "Context switch", 1));

            	questionRepository.save(new Question("Operating Systems", "Processes", 
            	    "What is the main advantage of multithreading?", 
            	    "Reduced memory usage",
            	    "Faster process creation",
            	    "Better resource sharing",
            	    "All of the above",
            	    "All of the above", 1));

            	questionRepository.save(new Question("Operating Systems", "Processes", 
            	    "What is the purpose of exec() system call?", 
            	    "Replace process image",
            	    "Create new process",
            	    "Terminate process",
            	    "Suspend process",
            	    "Replace process image", 1));

            	questionRepository.save(new Question("Operating Systems", "Processes", 
            	    "Which is NOT a thread state?", 
            	    "Running",
            	    "Ready",
            	    "Blocked",
            	    "Swapped",
            	    "Swapped", 1));

            	questionRepository.save(new Question("Operating Systems", "Processes", 
            	    "What is a daemon process?", 
            	    "A background service process",
            	    "A high-priority process",
            	    "A zombie process",
            	    "A terminated process",
            	    "A background service process", 1));

            	questionRepository.save(new Question("Operating Systems", "Processes", 
            	    "What is the main disadvantage of process creation?", 
            	    "High overhead",
            	    "Limited sharing",
            	    "Complex synchronization",
            	    "All of the above",
            	    "All of the above", 1));

            	questionRepository.save(new Question("Operating Systems", "Processes", 
            	    "Which is NOT a benefit of multiprocessing?", 
            	    "Increased throughput",
            	    "Economy of scale",
            	    "Increased reliability",
            	    "Simpler programming",
            	    "Simpler programming", 1));

            	questionRepository.save(new Question("Operating Systems", "Processes", 
            	    "What is the purpose of wait() system call?", 
            	    "Parent waits for child process",
            	    "Child waits for parent",
            	    "Process waits for I/O",
            	    "Process waits for signal",
            	    "Parent waits for child process", 1));

            	questionRepository.save(new Question("Operating Systems", "Processes", 
            	    "What is the main difference between user and kernel threads?", 
            	    "Kernel threads are managed by OS",
            	    "User threads are faster",
            	    "Kernel threads can utilize multiple CPUs",
            	    "All of the above",
            	    "All of the above", 1));

            // Memory Management Questions
            questionRepository.save(new Question("Operating Systems", "Memory Management", 
                "What is virtual memory?", 
                "Extra RAM", "Disk space used as RAM", 
                "CPU cache", "ROM space", "Disk space used as RAM", 1));
            questionRepository.save(new Question("Operating Systems", "Memory Management", 
                "What is paging?", 
                "Dividing memory into fixed-size blocks", "Dividing memory into variable-size blocks", 
                "Memory compression", "Memory defragmentation", "Dividing memory into fixed-size blocks", 1));
            questionRepository.save(new Question("Operating Systems", "Memory Management", 
                "What is thrashing?", 
                "Excessive page faults", "Memory leaks", 
                "Cache misses", "Disk fragmentation", "Excessive page faults", 1));
            questionRepository.save(new Question("Operating Systems", "Memory Management", 
                "Which page replacement algorithm replaces the oldest page?", 
                "FIFO", "LRU", 
                "Optimal", "LFU", "FIFO", 1));
            questionRepository.save(new Question("Operating Systems", "Memory Management", 
                "What is the purpose of TLB?", 
                "Cache disk blocks", "Cache page table entries", 
                "Cache file descriptors", "Cache process states", "Cache page table entries", 1));
            questionRepository.save(new Question("Operating Systems", "Memory Management", 
            	    "What is memory fragmentation?", 
            	    "Wasted memory due to allocation patterns",
            	    "Memory leaks",
            	    "Corrupted memory",
            	    "Memory protection faults",
            	    "Wasted memory due to allocation patterns", 1));

            	questionRepository.save(new Question("Operating Systems", "Memory Management", 
            	    "Which memory allocation scheme suffers from external fragmentation?", 
            	    "Paging",
            	    "Segmentation",
            	    "Virtual memory",
            	    "Demand paging",
            	    "Segmentation", 1));

            	questionRepository.save(new Question("Operating Systems", "Memory Management", 
            	    "What is the working set of a process?", 
            	    "Total memory allocated",
            	    "Pages currently in use",
            	    "Memory requested but not allocated",
            	    "Memory shared with other processes",
            	    "Pages currently in use", 1));

            	questionRepository.save(new Question("Operating Systems", "Memory Management", 
            	    "What is the purpose of memory protection?", 
            	    "Prevent processes from accessing others' memory",
            	    "Reduce page faults",
            	    "Improve cache performance",
            	    "All of the above",
            	    "Prevent processes from accessing others' memory", 1));

            	questionRepository.save(new Question("Operating Systems", "Memory Management", 
            	    "Which is NOT a page replacement algorithm?", 
            	    "FIFO",
            	    "LRU",
            	    "MRU",
            	    "LFU",
            	    "MRU", 1));

            	questionRepository.save(new Question("Operating Systems", "Memory Management", 
            	    "What is demand paging?", 
            	    "Loading pages only when needed",
            	    "Preloading all pages",
            	    "Swapping entire processes",
            	    "Compressing pages in memory",
            	    "Loading pages only when needed", 1));

            	questionRepository.save(new Question("Operating Systems", "Memory Management", 
            	    "What is the purpose of copy-on-write?", 
            	    "Optimize fork() system call",
            	    "Reduce page faults",
            	    "Improve cache performance",
            	    "All of the above",
            	    "Optimize fork() system call", 1));

            	questionRepository.save(new Question("Operating Systems", "Memory Management", 
            	    "What is the main advantage of segmentation over paging?", 
            	    "Supports logical memory organization",
            	    "No external fragmentation",
            	    "Faster address translation",
            	    "Smaller page tables",
            	    "Supports logical memory organization", 1));

            	questionRepository.save(new Question("Operating Systems", "Memory Management", 
            	    "What is the purpose of memory-mapped files?", 
            	    "Treat files as memory",
            	    "Map physical to virtual memory",
            	    "Share memory between processes",
            	    "All of the above",
            	    "Treat files as memory", 1));

            	questionRepository.save(new Question("Operating Systems", "Memory Management", 
            	    "What is the main disadvantage of pure demand paging?", 
            	    "High page fault rate at startup",
            	    "Large page tables",
            	    "Complex implementation",
            	    "Memory fragmentation",
            	    "High page fault rate at startup", 1));

            	questionRepository.save(new Question("Operating Systems", "Memory Management", 
            	    "What is the purpose of the dirty bit in page tables?", 
            	    "Track modified pages",
            	    "Track accessed pages",
            	    "Track shared pages",
            	    "Track locked pages",
            	    "Track modified pages", 1));

            	questionRepository.save(new Question("Operating Systems", "Memory Management", 
            	    "What is the main advantage of inverted page tables?", 
            	    "Reduce page table size",
            	    "Faster address translation",
            	    "Support larger address spaces",
            	    "All of the above",
            	    "Reduce page table size", 1));

            	questionRepository.save(new Question("Operating Systems", "Memory Management", 
            	    "What is the purpose of the reference bit in page tables?", 
            	    "Track accessed pages",
            	    "Track modified pages",
            	    "Track shared pages",
            	    "Track locked pages",
            	    "Track accessed pages", 1));

            	questionRepository.save(new Question("Operating Systems", "Memory Management", 
            	    "What is the main advantage of multilevel page tables?", 
            	    "Reduce memory usage for page tables",
            	    "Faster address translation",
            	    "Support larger address spaces",
            	    "All of the above",
            	    "Reduce memory usage for page tables", 1));

            	questionRepository.save(new Question("Operating Systems", "Memory Management", 
            	    "What is the purpose of the valid bit in page tables?", 
            	    "Indicate page is in memory",
            	    "Track modified pages",
            	    "Track accessed pages",
            	    "Track shared pages",
            	    "Indicate page is in memory", 1));

            // File Systems Questions
            questionRepository.save(new Question("Operating Systems", "File Systems", 
                "What is inode in Unix?", 
                "File name", "File metadata", 
                "File content", "File path", "File metadata", 1));
            questionRepository.save(new Question("Operating Systems", "File Systems", 
                "Which is not a file allocation method?", 
                "Contiguous", "Linked", 
                "Indexed", "Hashed", "Hashed", 1));
            questionRepository.save(new Question("Operating Systems", "File Systems", 
                "What is journaling in file systems?", 
                "Logging changes", "Defragmenting disk", 
                "Compressing files", "Encrypting data", "Logging changes", 1));
            questionRepository.save(new Question("Operating Systems", "File Systems", 
                "What is RAID?", 
                "Redundant Array of Independent Disks", "Random Access of Indexed Data", 
                "Redundant Allocation of Identical Disks", "Random Array of Independent Data", "Redundant Array of Independent Disks", 1));
            questionRepository.save(new Question("Operating Systems", "File Systems", 
                "What is the purpose of fsck?", 
                "File compression", "File system check", 
                "File search", "File encryption", "File system check", 1));
            questionRepository.save(new Question("Operating Systems", "File Systems", 
            	    "What is the purpose of directory structure?", 
            	    "Organize files",
            	    "Improve performance",
            	    "Provide security",
            	    "All of the above",
            	    "Organize files", 1));

            	questionRepository.save(new Question("Operating Systems", "File Systems", 
            	    "Which is NOT a common file access method?", 
            	    "Sequential",
            	    "Direct",
            	    "Indexed",
            	    "Hashed",
            	    "Hashed", 1));

            	questionRepository.save(new Question("Operating Systems", "File Systems", 
            	    "What is the purpose of file permissions?", 
            	    "Control access to files",
            	    "Organize files",
            	    "Improve performance",
            	    "All of the above",
            	    "Control access to files", 1));

            	questionRepository.save(new Question("Operating Systems", "File Systems", 
            	    "What is the main advantage of journaling file systems?", 
            	    "Faster recovery after crashes",
            	    "Better performance",
            	    "Smaller disk usage",
            	    "All of the above",
            	    "Faster recovery after crashes", 1));

            	questionRepository.save(new Question("Operating Systems", "File Systems", 
            	    "What is the purpose of symbolic links?", 
            	    "Create file aliases",
            	    "Improve performance",
            	    "Save disk space",
            	    "All of the above",
            	    "Create file aliases", 1));

            	questionRepository.save(new Question("Operating Systems", "File Systems", 
            	    "Which is NOT a common disk scheduling algorithm?", 
            	    "FCFS",
            	    "SSTF",
            	    "SCAN",
            	    "LFU",
            	    "LFU", 1));

            	questionRepository.save(new Question("Operating Systems", "File Systems", 
            	    "What is the main purpose of disk formatting?", 
            	    "Prepare disk for use",
            	    "Improve performance",
            	    "Recover lost data",
            	    "All of the above",
            	    "Prepare disk for use", 1));

            	questionRepository.save(new Question("Operating Systems", "File Systems", 
            	    "What is the purpose of bad block management?", 
            	    "Handle defective disk sectors",
            	    "Improve performance",
            	    "Recover lost data",
            	    "All of the above",
            	    "Handle defective disk sectors", 1));

            	questionRepository.save(new Question("Operating Systems", "File Systems", 
            	    "What is the main advantage of RAID 1?", 
            	    "Redundancy",
            	    "Performance",
            	    "Capacity",
            	    "All of the above",
            	    "Redundancy", 1));

            	questionRepository.save(new Question("Operating Systems", "File Systems", 
            	    "What is the purpose of file system mounting?", 
            	    "Make file system available",
            	    "Improve performance",
            	    "Recover lost data",
            	    "All of the above",
            	    "Make file system available", 1));

            	questionRepository.save(new Question("Operating Systems", "File Systems", 
            	    "What is the main advantage of solid-state drives (SSDs)?", 
            	    "Faster access time",
            	    "Higher capacity",
            	    "Lower cost",
            	    "All of the above",
            	    "Faster access time", 1));

            	questionRepository.save(new Question("Operating Systems", "File Systems", 
            	    "What is the purpose of file system buffering?", 
            	    "Improve performance",
            	    "Provide security",
            	    "Organize files",
            	    "All of the above",
            	    "Improve performance", 1));

            	questionRepository.save(new Question("Operating Systems", "File Systems", 
            	    "What is the main purpose of file system check (fsck)?", 
            	    "Repair inconsistencies",
            	    "Improve performance",
            	    "Defragment disk",
            	    "All of the above",
            	    "Repair inconsistencies", 1));

            	questionRepository.save(new Question("Operating Systems", "File Systems", 
            	    "What is the main advantage of distributed file systems?", 
            	    "Shared access to files",
            	    "Improved performance",
            	    "Higher reliability",
            	    "All of the above",
            	    "Shared access to files", 1));

            	questionRepository.save(new Question("Operating Systems", "File Systems", 
            	    "What is the purpose of file system caching?", 
            	    "Improve performance",
            	    "Provide security",
            	    "Organize files",
            	    "All of the above",
            	    "Improve performance", 1));

            // Deadlocks Questions
            
            
            questionRepository.save(new Question("Operating Systems", "Deadlocks", 
                "What is the Banker's algorithm used for?", 
                "Memory allocation", "Deadlock avoidance", 
                "Process scheduling", "Disk scheduling", "Deadlock avoidance", 1));
            questionRepository.save(new Question("Operating Systems", "Deadlocks", 
                "Which deadlock handling strategy requires processes to request all resources initially?", 
                "Prevention", "Avoidance", 
                "Detection", "Recovery", "Prevention", 1));
            questionRepository.save(new Question("Operating Systems", "Deadlocks", 
                "What is resource allocation graph used for?", 
                "Deadlock detection", "Memory management", 
                "Process scheduling", "File allocation", "Deadlock detection", 1));
            questionRepository.save(new Question("Operating Systems", "Deadlocks", 
                "Which is not a deadlock recovery method?", 
                "Process termination", "Resource preemption", 
                "Rollback", "Priority inversion", "Priority inversion", 1));
//            questionRepository.save(new Question("Operating Systems", "Deadlocks", 
//                    "Which is not a necessary condition for deadlock?", 
//                    "Mutual exclusion", "Hold and wait", 
//                    "No preemption", "Circular wait", "None of the above", "None of the above", 1));
            questionRepository.save(new Question("Operating Systems", "Deadlocks", 
            	    "Which is NOT a necessary condition for deadlock?", 
            	    "Mutual exclusion",
            	    "Hold and wait",
            	    "No preemption",
            	    "Priority scheduling",
            	    "Priority scheduling", 1));

            	questionRepository.save(new Question("Operating Systems", "Deadlocks", 
            	    "What is the main disadvantage of deadlock prevention?", 
            	    "Reduced system throughput",
            	    "Increased complexity",
            	    "Higher memory usage",
            	    "All of the above",
            	    "Reduced system throughput", 1));

            	questionRepository.save(new Question("Operating Systems", "Deadlocks", 
            	    "What is the main advantage of deadlock avoidance?", 
            	    "Allows more concurrency than prevention",
            	    "Simpler to implement",
            	    "No prior knowledge needed",
            	    "All of the above",
            	    "Allows more concurrency than prevention", 1));

            	questionRepository.save(new Question("Operating Systems", "Deadlocks", 
            	    "What is the main disadvantage of deadlock detection?", 
            	    "Overhead of running algorithm",
            	    "Difficulty recovering from deadlock",
            	    "Both a and b",
            	    "Neither a nor b",
            	    "Both a and b", 1));

            	questionRepository.save(new Question("Operating Systems", "Deadlocks", 
            	    "What is the main purpose of the wait-for graph?", 
            	    "Detect deadlocks",
            	    "Prevent deadlocks",
            	    "Avoid deadlocks",
            	    "All of the above",
            	    "Detect deadlocks", 1));

            	questionRepository.save(new Question("Operating Systems", "Deadlocks", 
            	    "Which deadlock handling strategy is used by most operating systems?", 
            	    "Prevention",
            	    "Avoidance",
            	    "Detection",
            	    "Ignorance",
            	    "Ignorance", 1));

            	questionRepository.save(new Question("Operating Systems", "Deadlocks", 
            	    "What is the main advantage of resource preemption for deadlock recovery?", 
            	    "Can break circular wait",
            	    "Simple to implement",
            	    "No process termination needed",
            	    "All of the above",
            	    "Can break circular wait", 1));

            	questionRepository.save(new Question("Operating Systems", "Deadlocks", 
            	    "What is the main disadvantage of process termination for deadlock recovery?", 
            	    "Lost work",
            	    "Complex implementation",
            	    "High overhead",
            	    "All of the above",
            	    "Lost work", 1));

            	questionRepository.save(new Question("Operating Systems", "Deadlocks", 
            	    "What is the main purpose of the Banker's algorithm?", 
            	    "Deadlock avoidance",
            	    "Deadlock prevention",
            	    "Deadlock detection",
            	    "Deadlock recovery",
            	    "Deadlock avoidance", 1));

            	questionRepository.save(new Question("Operating Systems", "Deadlocks", 
            	    "What is the main disadvantage of the Banker's algorithm?", 
            	    "Requires advance knowledge of maximum needs",
            	    "High computational overhead",
            	    "Both a and b",
            	    "Neither a nor b",
            	    "Both a and b", 1));

            	questionRepository.save(new Question("Operating Systems", "Deadlocks", 
            	    "What is the main advantage of deadlock ignorance?", 
            	    "Low overhead",
            	    "No special mechanisms needed",
            	    "Both a and b",
            	    "Neither a nor b",
            	    "Both a and b", 1));

            	questionRepository.save(new Question("Operating Systems", "Deadlocks", 
            	    "What is the main disadvantage of deadlock ignorance?", 
            	    "System may hang",
            	    "User must handle deadlocks",
            	    "Both a and b",
            	    "Neither a nor b",
            	    "Both a and b", 1));

            	questionRepository.save(new Question("Operating Systems", "Deadlocks", 
            	    "What is the main purpose of the safety algorithm?", 
            	    "Determine if system is in safe state",
            	    "Detect deadlocks",
            	    "Prevent deadlocks",
            	    "All of the above",
            	    "Determine if system is in safe state", 1));

            	questionRepository.save(new Question("Operating Systems", "Deadlocks", 
            	    "What is the main advantage of wait-die scheme over wound-wait?", 
            	    "No preemption needed",
            	    "Older processes have priority",
            	    "Both a and b",
            	    "Neither a nor b",
            	    "Older processes have priority", 1));

            	questionRepository.save(new Question("Operating Systems", "Deadlocks", 
            	    "What is the main disadvantage of timeout-based deadlock detection?", 
            	    "False positives",
            	    "High overhead",
            	    "Both a and b",
            	    "Neither a nor b",
            	    "False positives", 1));

            	questionRepository.save(new Question("Operating Systems", "Deadlocks", 
            	    "What is the main purpose of the ostrich algorithm?", 
            	    "Ignore deadlocks",
            	    "Detect deadlocks",
            	    "Prevent deadlocks",
            	    "Avoid deadlocks",
            	    "Ignore deadlocks", 1));

            // Scheduling Questions
            questionRepository.save(new Question("Operating Systems", "Scheduling", 
                "Which scheduling algorithm gives priority to shortest jobs?", 
                "FCFS", "SJF", 
                "Round Robin", "Priority", "SJF", 1));
            questionRepository.save(new Question("Operating Systems", "Scheduling", 
                "What is the main advantage of Round Robin scheduling?", 
                "Low turnaround time", "High throughput", 
                "Fairness", "Priority handling", "Fairness", 1));
            questionRepository.save(new Question("Operating Systems", "Scheduling", 
                "What is convoy effect?", 
                "Many short jobs waiting for one long job", "Many I/O bound processes", 
                "CPU bound processes dominating", "All of the above", "Many short jobs waiting for one long job", 1));
            questionRepository.save(new Question("Operating Systems", "Scheduling", 
                "Which scheduling algorithm can lead to starvation?", 
                "FCFS", "Round Robin", 
                "SJF", "All of the above", "SJF", 1));
            questionRepository.save(new Question("Operating Systems", "Scheduling", 
                "What is the time quantum in Round Robin?", 
                "Time to complete a process", "Fixed time each process gets", 
                "Time between context switches", "Time to load a process", "Fixed time each process gets", 1));
            questionRepository.save(new Question("Operating Systems", "Scheduling", 
            	    "What is the main advantage of multilevel queue scheduling?", 
            	    "Different queues for different process types",
            	    "Better fairness",
            	    "Lower overhead",
            	    "All of the above",
            	    "Different queues for different process types", 1));

            	questionRepository.save(new Question("Operating Systems", "Scheduling", 
            	    "What is the main disadvantage of FCFS scheduling?", 
            	    "Convoy effect",
            	    "Starvation",
            	    "High overhead",
            	    "All of the above",
            	    "Convoy effect", 1));

            	questionRepository.save(new Question("Operating Systems", "Scheduling", 
            	    "What is the main advantage of SJF scheduling?", 
            	    "Minimizes average waiting time",
            	    "Fairness",
            	    "No starvation",
            	    "All of the above",
            	    "Minimizes average waiting time", 1));

            	questionRepository.save(new Question("Operating Systems", "Scheduling", 
            	    "What is the main disadvantage of priority scheduling?", 
            	    "Starvation",
            	    "High overhead",
            	    "Complex implementation",
            	    "All of the above",
            	    "Starvation", 1));

            	questionRepository.save(new Question("Operating Systems", "Scheduling", 
            	    "What is the main purpose of multilevel feedback queue scheduling?", 
            	    "Adapt to changing process behavior",
            	    "Improve fairness",
            	    "Reduce overhead",
            	    "All of the above",
            	    "Adapt to changing process behavior", 1));

            	questionRepository.save(new Question("Operating Systems", "Scheduling", 
            	    "What is the main advantage of round-robin scheduling?", 
            	    "Fairness",
            	    "Low response time",
            	    "No starvation",
            	    "All of the above",
            	    "All of the above", 1));

            	questionRepository.save(new Question("Operating Systems", "Scheduling", 
            	    "What is the main disadvantage of shortest remaining time first scheduling?", 
            	    "Difficult to predict remaining time",
            	    "Starvation",
            	    "High overhead",
            	    "All of the above",
            	    "Difficult to predict remaining time", 1));

            	questionRepository.save(new Question("Operating Systems", "Scheduling", 
            	    "What is the main purpose of real-time scheduling?", 
            	    "Meet timing constraints",
            	    "Maximize throughput",
            	    "Minimize response time",
            	    "All of the above",
            	    "Meet timing constraints", 1));

            	questionRepository.save(new Question("Operating Systems", "Scheduling", 
            	    "What is the main advantage of lottery scheduling?", 
            	    "Fair allocation of CPU time",
            	    "Low overhead",
            	    "No starvation",
            	    "All of the above",
            	    "Fair allocation of CPU time", 1));

            	questionRepository.save(new Question("Operating Systems", "Scheduling", 
            	    "What is the main disadvantage of multilevel queue scheduling?", 
            	    "Starvation between queues",
            	    "High overhead",
            	    "Complex implementation",
            	    "All of the above",
            	    "Starvation between queues", 1));

            	questionRepository.save(new Question("Operating Systems", "Scheduling", 
            	    "What is the main purpose of proportional-share scheduling?", 
            	    "Allocate CPU proportionally to shares",
            	    "Maximize throughput",
            	    "Minimize response time",
            	    "All of the above",
            	    "Allocate CPU proportionally to shares", 1));

            	questionRepository.save(new Question("Operating Systems", "Scheduling", 
            	    "What is the main advantage of fair-share scheduling?", 
            	    "Fair CPU allocation among users",
            	    "Low overhead",
            	    "No starvation",
            	    "All of the above",
            	    "Fair CPU allocation among users", 1));

            	questionRepository.save(new Question("Operating Systems", "Scheduling", 
            	    "What is the main disadvantage of real-time scheduling?", 
            	    "May degrade non-real-time performance",
            	    "High overhead",
            	    "Complex implementation",
            	    "All of the above",
            	    "May degrade non-real-time performance", 1));

            	questionRepository.save(new Question("Operating Systems", "Scheduling", 
            	    "What is the main purpose of gang scheduling?", 
            	    "Schedule related threads together",
            	    "Improve fairness",
            	    "Reduce overhead",
            	    "All of the above",
            	    "Schedule related threads together", 1));

            	questionRepository.save(new Question("Operating Systems", "Scheduling", 
            	    "What is the main advantage of dynamic priority scheduling?", 
            	    "Adapt to changing process behavior",
            	    "Fairness",
            	    "No starvation",
            	    "All of the above",
            	    "Adapt to changing process behavior", 1));

            // ========== Database Management Questions ==========
            // SQL Questions
            questionRepository.save(new Question("Database Management", "SQL", 
                "Which SQL statement is used to extract data from a database?", 
                "GET", "EXTRACT", "SELECT", "OPEN", "SELECT", 1));
            questionRepository.save(new Question("Database Management", "SQL", 
                "Which clause is used to filter groups in SQL?", 
                "WHERE", "HAVING", 
                "GROUP BY", "FILTER", "HAVING", 1));
            questionRepository.save(new Question("Database Management", "SQL", 
                "What is the purpose of JOIN in SQL?", 
                "Combine rows from tables", "Combine columns from tables", 
                "Create new tables", "Modify existing tables", "Combine rows from tables", 1));
            questionRepository.save(new Question("Database Management", "SQL", 
                "Which constraint ensures column values are unique?", 
                "PRIMARY KEY", "FOREIGN KEY", 
                "UNIQUE", "CHECK", "UNIQUE", 1));
            questionRepository.save(new Question("Database Management", "SQL", 
                "What does ACID stand for in databases?", 
                "Atomicity - Consistency - Isolation - Durability", 
                "Accuracy - Consistency - Integrity - Durability", 
                "Atomicity - Consistency - Integrity - Durability", 
                "Accuracy - Completeness - Isolation - Durability", 
                "Atomicity - Consistency - Isolation - Durability", 1));
            questionRepository.save(new Question("Database Management", "SQL", 
            	    "Which SQL function counts the number of rows?", 
            	    "SUM()", "COUNT()", "TOTAL()", "AVG()", "COUNT()", 1));

            	questionRepository.save(new Question("Database Management", "SQL", 
            	    "What is the purpose of the GROUP BY clause?", 
            	    "Filter rows", "Group rows by column values", 
            	    "Sort results", "Limit results", "Group rows by column values", 1));

            	questionRepository.save(new Question("Database Management", "SQL", 
            	    "Which JOIN returns all rows from both tables?", 
            	    "INNER JOIN", "LEFT JOIN", 
            	    "FULL OUTER JOIN", "CROSS JOIN", "FULL OUTER JOIN", 1));

            	questionRepository.save(new Question("Database Management", "SQL", 
            	    "What does the DISTINCT keyword do?", 
            	    "Sorts results", "Returns unique values", 
            	    "Filters duplicates", "Both b and c", "Both b and c", 1));

            	questionRepository.save(new Question("Database Management", "SQL", 
            	    "Which statement modifies existing data?", 
            	    "ALTER", "UPDATE", "MODIFY", "CHANGE", "UPDATE", 1));

            	questionRepository.save(new Question("Database Management", "SQL", 
            	    "What is the purpose of a subquery?", 
            	    "Query within a query", "Simple query", 
            	    "Stored procedure", "View definition", "Query within a query", 1));

            	questionRepository.save(new Question("Database Management", "SQL", 
            	    "Which constraint enforces referential integrity?", 
            	    "PRIMARY KEY", "FOREIGN KEY", 
            	    "UNIQUE", "CHECK", "FOREIGN KEY", 1));

            	questionRepository.save(new Question("Database Management", "SQL", 
            	    "What is the purpose of the ORDER BY clause?", 
            	    "Filter rows", "Group rows", 
            	    "Sort results", "Limit results", "Sort results", 1));

            	questionRepository.save(new Question("Database Management", "SQL", 
            	    "Which statement creates a database view?", 
            	    "CREATE VIEW", "DEFINE VIEW", 
            	    "MAKE VIEW", "BUILD VIEW", "CREATE VIEW", 1));

            	questionRepository.save(new Question("Database Management", "SQL", 
            	    "What is the purpose of the LIKE operator?", 
            	    "Numerical comparison", "Pattern matching", 
            	    "Date comparison", "Null checking", "Pattern matching", 1));

            	questionRepository.save(new Question("Database Management", "SQL", 
            	    "Which statement removes records from a table?", 
            	    "DELETE", "REMOVE", 
            	    "DROP", "TRUNCATE", "DELETE", 1));

            	questionRepository.save(new Question("Database Management", "SQL", 
            	    "What is the purpose of the BETWEEN operator?", 
            	    "Range selection", "Pattern matching", 
            	    "Null checking", "List checking", "Range selection", 1));

            	questionRepository.save(new Question("Database Management", "SQL", 
            	    "Which function combines strings?", 
            	    "MERGE()", "COMBINE()", 
            	    "CONCAT()", "JOIN()", "CONCAT()", 1));

            	questionRepository.save(new Question("Database Management", "SQL", 
            	    "What is the purpose of the CASE statement?", 
            	    "Conditional logic", "Loop control", 
            	    "Error handling", "Transaction control", "Conditional logic", 1));

            	questionRepository.save(new Question("Database Management", "SQL", 
            	    "Which statement creates an index?", 
            	    "CREATE INDEX", "MAKE INDEX", 
            	    "ADD INDEX", "DEFINE INDEX", "CREATE INDEX", 1));

            // NoSQL Questions
            questionRepository.save(new Question("Database Management", "NoSQL", 
                "Which is not a NoSQL database type?", 
                "Document", "Key-value", 
                "Column-family", "Table", "Table", 1));
            questionRepository.save(new Question("Database Management", "NoSQL", 
                "What is the main advantage of NoSQL databases?", 
                "ACID compliance", "Horizontal scalability", 
                "Complex joins", "Fixed schema", "Horizontal scalability", 1));
            questionRepository.save(new Question("Database Management", "NoSQL", 
                "Which database is document-oriented?", 
                "MongoDB", "Redis", 
                "Cassandra", "HBase", "MongoDB", 1));
            questionRepository.save(new Question("Database Management", "NoSQL", 
                "What is CAP theorem?",
                "Consistency - Availability - Partition tolerance", 
                "Consistency - Accuracy - Performance", 
                "Concurrency - Availability - Performance", 
                "Consistency - Atomicity - Partition tolerance", 
                "Consistency - Availability - Partition tolerance", 1));
            questionRepository.save(new Question("Database Management", "NoSQL", 
                "Which database is best for key-value storage?", 
                "MongoDB", "Redis", 
                "Cassandra", "Neo4j", "Redis", 1));
            questionRepository.save(new Question("Database Management", "NoSQL", 
            	    "Which database is column-oriented?", 
            	    "MongoDB", "Cassandra", 
            	    "Redis", "Neo4j", "Cassandra", 1));

            	questionRepository.save(new Question("Database Management", "NoSQL", 
            	    "What is eventual consistency?", 
            	    "Strong consistency", "Consistency achieved over time", 
            	    "No consistency", "Immediate consistency", "Consistency achieved over time", 1));

            	questionRepository.save(new Question("Database Management", "NoSQL", 
            	    "Which database is graph-based?", 
            	    "MongoDB", "Redis", 
            	    "Neo4j", "Cassandra", "Neo4j", 1));

            	questionRepository.save(new Question("Database Management", "NoSQL", 
            	    "What is sharding in NoSQL?", 
            	    "Data partitioning", "Data replication", 
            	    "Data compression", "Data encryption", "Data partitioning", 1));

            	questionRepository.save(new Question("Database Management", "NoSQL", 
            	    "Which is a characteristic of document databases?", 
            	    "Schema-less", "Fixed schema", 
            	    "Strong joins", "ACID compliance", "Schema-less", 1));

            	questionRepository.save(new Question("Database Management", "NoSQL", 
            	    "What is MapReduce?", 
            	    "Query language", "Programming model", 
            	    "Database type", "Indexing method", "Programming model", 1));

            	questionRepository.save(new Question("Database Management", "NoSQL", 
            	    "Which database uses JSON-like documents?", 
            	    "Redis", "MongoDB", 
            	    "Cassandra", "HBase", "MongoDB", 1));

            	questionRepository.save(new Question("Database Management", "NoSQL", 
            	    "What is the main disadvantage of NoSQL?", 
            	    "Lack of joins", "No transactions", 
            	    "Both a and b", "Neither a nor b", "Both a and b", 1));

            	questionRepository.save(new Question("Database Management", "NoSQL", 
            	    "Which database is best for caching?", 
            	    "MongoDB", "Redis", 
            	    "Cassandra", "Neo4j", "Redis", 1));

            	questionRepository.save(new Question("Database Management", "NoSQL", 
            	    "What is BASE in NoSQL?", 
            	    "Basic Availability - Soft state - Eventual consistency", 
            	    "Basic Atomicity - Soft state - Eventual consistency", 
            	    "Basic Availability - Strong consistency - Eventual state", 
            	    "Basic Atomicity - Strong consistency - Eventual state", 
            	    "Basic Availability - Soft state - Eventual consistency", 1));

            	questionRepository.save(new Question("Database Management", "NoSQL", 
            	    "Which database uses wide-column stores?", 
            	    "MongoDB", "Cassandra", 
            	    "Redis", "Neo4j", "Cassandra", 1));

            	questionRepository.save(new Question("Database Management", "NoSQL", 
            	    "What is the purpose of replication in NoSQL?", 
            	    "High availability", "Faster queries", 
            	    "Both a and b", "Neither a nor b", "Both a and b", 1));

            	questionRepository.save(new Question("Database Management", "NoSQL", 
            	    "Which query language is used by MongoDB?", 
            	    "MQL", "CQL", 
            	    "Gremlin", "RedisQL", "MQL", 1));

            	questionRepository.save(new Question("Database Management", "NoSQL", 
            	    "What is a collection in MongoDB?", 
            	    "Table equivalent", "Row equivalent", 
            	    "Column equivalent", "Index equivalent", "Table equivalent", 1));

            	questionRepository.save(new Question("Database Management", "NoSQL", 
            	    "Which is NOT a NoSQL database?", 
            	    "MongoDB", "PostgreSQL", 
            	    "Cassandra", "Redis", "PostgreSQL", 1));

            // Normalization Questions
            questionRepository.save(new Question("Database Management", "Normalization", 
                "What is the purpose of normalization?", 
                "Reduce redundancy", "Improve performance", 
                "Increase storage", "Simplify queries", "Reduce redundancy", 1));
            questionRepository.save(new Question("Database Management", "Normalization", 
                "Which normal form deals with partial dependencies?", 
                "1NF", "2NF", 
                "3NF", "BCNF", "2NF", 1));
            questionRepository.save(new Question("Database Management", "Normalization", 
                "What is a candidate key?", 
                "A primary key", "A super key with no redundant attributes", 
                "A foreign key", "An alternate key", "A super key with no redundant attributes", 1));
            questionRepository.save(new Question("Database Management", "Normalization", 
                "Which normal form deals with transitive dependencies?", 
                "1NF", "2NF", 
                "3NF", "BCNF", "3NF", 1));
            questionRepository.save(new Question("Database Management", "Normalization", 
                "What is denormalization?", 
                "Process of removing redundancy", "Process of adding redundancy", 
                "Process of creating views", "Process of indexing", "Process of adding redundancy", 1));
            questionRepository.save(new Question("Database Management", "Normalization", 
            	    "What is a functional dependency?", 
            	    "Relationship between attributes", "Foreign key relationship", 
            	    "Primary key constraint", "Index relationship", "Relationship between attributes", 1));

            	questionRepository.save(new Question("Database Management", "Normalization", 
            	    "Which normal form eliminates repeating groups?", 
            	    "1NF", "2NF", 
            	    "3NF", "BCNF", "1NF", 1));

            	questionRepository.save(new Question("Database Management", "Normalization", 
            	    "What is a superkey?", 
            	    "Minimal set identifying rows", "Set containing candidate key", 
            	    "Foreign key", "Primary key", "Set containing candidate key", 1));

            	questionRepository.save(new Question("Database Management", "Normalization", 
            	    "Which normal form deals with multivalued dependencies?", 
            	    "3NF", "BCNF", 
            	    "4NF", "5NF", "4NF", 1));

            	questionRepository.save(new Question("Database Management", "Normalization", 
            	    "What is the purpose of BCNF?", 
            	    "Eliminate partial dependencies", "Eliminate transitive dependencies", 
            	    "Stronger than 3NF", "All of the above", "All of the above", 1));

            	questionRepository.save(new Question("Database Management", "Normalization", 
            	    "What is a trivial functional dependency?", 
            	    "Dependency on superkey", "Dependency on candidate key", 
            	    "Dependency where right is subset of left", "Non-key dependency", "Dependency where right is subset of left", 1));

            	questionRepository.save(new Question("Database Management", "Normalization", 
            	    "Which normal form is considered the most practical?", 
            	    "1NF", "2NF", 
            	    "3NF", "BCNF", "3NF", 1));

            	questionRepository.save(new Question("Database Management", "Normalization", 
            	    "What is lossless decomposition?", 
            	    "No information loss", "No redundancy", 
            	    "Both a and b", "Neither a nor b", "No information loss", 1));

            	questionRepository.save(new Question("Database Management", "Normalization", 
            	    "What is a prime attribute?", 
            	    "Part of any candidate key", "Part of primary key only", 
            	    "Non-key attribute", "Foreign key", "Part of any candidate key", 1));

            	questionRepository.save(new Question("Database Management", "Normalization", 
            	    "Which normal form deals with join dependencies?", 
            	    "4NF", "5NF", 
            	    "BCNF", "6NF", "5NF", 1));

            	questionRepository.save(new Question("Database Management", "Normalization", 
            	    "What is the purpose of domain-key normal form?", 
            	    "Eliminate all anomalies", "Theoretical perfection", 
            	    "Both a and b", "Neither a nor b", "Theoretical perfection", 1));

            	questionRepository.save(new Question("Database Management", "Normalization", 
            	    "What is a multivalued dependency?", 
            	    "Dependency between sets of values", "Functional dependency", 
            	    "Transitive dependency", "Partial dependency", "Dependency between sets of values", 1));

            	questionRepository.save(new Question("Database Management", "Normalization", 
            	    "When is denormalization recommended?", 
            	    "For read-heavy applications", "For write-heavy applications", 
            	    "For OLTP systems", "Never", "For read-heavy applications", 1));

            	questionRepository.save(new Question("Database Management", "Normalization", 
            	    "What is a surrogate key?", 
            	    "Natural primary key", "Artificial primary key", 
            	    "Foreign key", "Composite key", "Artificial primary key", 1));

            	questionRepository.save(new Question("Database Management", "Normalization", 
            	    "What is the first step in normalization?", 
            	    "Identify all functional dependencies", "Identify primary key", 
            	    "Eliminate repeating groups", "Remove partial dependencies", "Identify all functional dependencies", 1));

            // Transactions Questions
            questionRepository.save(new Question("Database Management", "Transactions", 
                "Which property ensures transactions are all-or-nothing?", 
                "Atomicity", "Consistency", 
                "Isolation", "Durability", "Atomicity", 1));
            questionRepository.save(new Question("Database Management", "Transactions", 
                "What is a dirty read?", 
                "Reading committed data", "Reading uncommitted data", 
                "Reading deleted data", "Reading encrypted data", "Reading uncommitted data", 1));
            questionRepository.save(new Question("Database Management", "Transactions", 
                "Which isolation level prevents dirty reads?", 
                "Read Uncommitted", "Read Committed", 
                "Repeatable Read", "Serializable", "Read Committed", 1));
            questionRepository.save(new Question("Database Management", "Transactions", 
                "What is two-phase locking?", 
                "Growing and shrinking phases", "Reading and writing phases", 
                "Locking and unlocking phases", "Shared and exclusive phases", "Growing and shrinking phases", 1));
            questionRepository.save(new Question("Database Management", "Transactions", 
                "What is a deadlock in databases?", 
                "Two transactions waiting for each other", "Transaction waiting for a lock", 
                "Transaction that never ends", "Lock that cannot be released", "Two transactions waiting for each other", 1));
            questionRepository.save(new Question("Database Management", "Transactions", 
            	    "What is a phantom read?", 
            	    "Reading committed data", "New rows appearing in subsequent reads", 
            	    "Reading uncommitted data", "Reading deleted data", "New rows appearing in subsequent reads", 1));

            	questionRepository.save(new Question("Database Management", "Transactions", 
            	    "Which isolation level prevents non-repeatable reads?", 
            	    "Read Uncommitted", "Read Committed", 
            	    "Repeatable Read", "Serializable", "Repeatable Read", 1));

            	questionRepository.save(new Question("Database Management", "Transactions", 
            	    "What is a savepoint?", 
            	    "Transaction endpoint", "Intermediate point in transaction", 
            	    "Checkpoint", "Commit point", "Intermediate point in transaction", 1));

            	questionRepository.save(new Question("Database Management", "Transactions", 
            	    "What is optimistic concurrency control?", 
            	    "Assume conflicts are rare", "Use locks", 
            	    "Both a and b", "Neither a nor b", "Assume conflicts are rare", 1));

            	questionRepository.save(new Question("Database Management", "Transactions", 
            	    "Which statement starts a transaction?", 
            	    "BEGIN", "START", 
            	    "BEGIN TRANSACTION", "Both a and c", "Both a and c", 1));

            	questionRepository.save(new Question("Database Management", "Transactions", 
            	    "What is a non-repeatable read?", 
            	    "Different data in subsequent reads", "New rows appearing", 
            	    "Reading uncommitted data", "Reading deleted data", "Different data in subsequent reads", 1));

            	questionRepository.save(new Question("Database Management", "Transactions", 
            	    "What is the purpose of MVCC?", 
            	    "Concurrency control", "Transaction isolation", 
            	    "Both a and b", "Neither a nor b", "Both a and b", 1));

            	questionRepository.save(new Question("Database Management", "Transactions", 
            	    "Which isolation level provides strictest isolation?", 
            	    "Read Uncommitted", "Read Committed", 
            	    "Repeatable Read", "Serializable", "Serializable", 1));

            	questionRepository.save(new Question("Database Management", "Transactions", 
            	    "What is a shared lock?", 
            	    "Read lock", "Write lock", 
            	    "Exclusive lock", "Update lock", "Read lock", 1));

            	questionRepository.save(new Question("Database Management", "Transactions", 
            	    "What is the purpose of WAL (Write-Ahead Logging)?", 
            	    "Crash recovery", "Performance improvement", 
            	    "Both a and b", "Neither a nor b", "Crash recovery", 1));

            	questionRepository.save(new Question("Database Management", "Transactions", 
            	    "What is a deadlock victim?", 
            	    "Transaction chosen to abort", "Locked transaction", 
            	    "Both a and b", "Neither a nor b", "Transaction chosen to abort", 1));

            	questionRepository.save(new Question("Database Management", "Transactions", 
            	    "What is the purpose of a transaction log?", 
            	    "Recovery", "Auditing", 
            	    "Both a and b", "Neither a nor b", "Both a and b", 1));

            	questionRepository.save(new Question("Database Management", "Transactions", 
            	    "What is the two-phase commit protocol?", 
            	    "Distributed transaction protocol", "Local transaction protocol", 
            	    "Locking protocol", "Isolation protocol", "Distributed transaction protocol", 1));

            	questionRepository.save(new Question("Database Management", "Transactions", 
            	    "What is a long-running transaction?", 
            	    "Transaction holding locks too long", "Large transaction", 
            	    "Both a and b", "Neither a nor b", "Both a and b", 1));

            	questionRepository.save(new Question("Database Management", "Transactions", 
            	    "What is the purpose of SET TRANSACTION?", 
            	    "Configure transaction properties", "Start transaction", 
            	    "Commit transaction", "Rollback transaction", "Configure transaction properties", 1));

            // Indexing Questions
            questionRepository.save(new Question("Database Management", "Indexing", 
                "What is the purpose of database indexing?", 
                "Increase storage", "Improve query performance", 
                "Enforce constraints", "Reduce redundancy", "Improve query performance", 1));
            questionRepository.save(new Question("Database Management", "Indexing", 
                "Which data structure is commonly used for indexes?", 
                "Array", "Linked List", 
                "B-tree", "Graph", "B-tree", 1));
            questionRepository.save(new Question("Database Management", "Indexing", 
                "What is a clustered index?", 
                "Index that stores data records", "Index that points to data records", 
                "Index on multiple columns", "Unique index", "Index that stores data records", 1));
            questionRepository.save(new Question("Database Management", "Indexing", 
                "What is the downside of too many indexes?", 
                "Slower inserts", "More storage", 
                "Both a and b", "Neither a nor b", "Both a and b", 1));
            questionRepository.save(new Question("Database Management", "Indexing", 
                "Which index type is best for full-text search?", 
                "B-tree", "Hash", 
                "Bitmap", "Inverted", "Inverted", 1));
            questionRepository.save(new Question("Database Management", "Indexing", 
            	    "What is a composite index?", 
            	    "Index on multiple columns", "Duplicate index", 
            	    "Clustered index", "Unique index", "Index on multiple columns", 1));

            	questionRepository.save(new Question("Database Management", "Indexing", 
            	    "What is the purpose of a covering index?", 
            	    "Eliminate table access", "Improve sorting", 
            	    "Both a and b", "Neither a nor b", "Eliminate table access", 1));

            	questionRepository.save(new Question("Database Management", "Indexing", 
            	    "Which index type provides fastest equality lookups?", 
            	    "B-tree", "Hash", 
            	    "Bitmap", "Full-text", "Hash", 1));

            	questionRepository.save(new Question("Database Management", "Indexing", 
            	    "What is index selectivity?", 
            	    "Uniqueness of values", "Size of index", 
            	    "Both a and b", "Neither a nor b", "Uniqueness of values", 1));

            	questionRepository.save(new Question("Database Management", "Indexing", 
            	    "What is the purpose of EXPLAIN in SQL?", 
            	    "Show query execution plan", "Explain table structure", 
            	    "Both a and b", "Neither a nor b", "Show query execution plan", 1));

            	questionRepository.save(new Question("Database Management", "Indexing", 
            	    "What is an index scan?", 
            	    "Reading entire index", "Reading part of index", 
            	    "Table scan", "None of the above", "Reading entire index", 1));

            	questionRepository.save(new Question("Database Management", "Indexing", 
            	    "What is the purpose of index hinting?", 
            	    "Force index usage", "Prevent index usage", 
            	    "Both a and b", "Neither a nor b", "Both a and b", 1));

            	questionRepository.save(new Question("Database Management", "Indexing", 
            	    "What is index fragmentation?", 
            	    "Disorganized index pages", "Deleted index entries", 
            	    "Both a and b", "Neither a nor b", "Disorganized index pages", 1));

            	questionRepository.save(new Question("Database Management", "Indexing", 
            	    "What is a filtered index?", 
            	    "Index on subset of rows", "Partial index", 
            	    "Both a and b", "Neither a nor b", "Both a and b", 1));

            	questionRepository.save(new Question("Database Management", "Indexing", 
            	    "What is the purpose of REINDEX?", 
            	    "Rebuild corrupted index", "Improve performance", 
            	    "Both a and b", "Neither a nor b", "Both a and b", 1));

            	questionRepository.save(new Question("Database Management", "Indexing", 
            	    "What is index cardinality?", 
            	    "Number of unique values", "Size of index", 
            	    "Height of index tree", "None of the above", "Number of unique values", 1));

            	questionRepository.save(new Question("Database Management", "Indexing", 
            	    "What is the purpose of a full-text index?", 
            	    "Efficient text search", "Document search", 
            	    "Both a and b", "Neither a nor b", "Both a and b", 1));

            	questionRepository.save(new Question("Database Management", "Indexing", 
            	    "What is an index-organized table?", 
            	    "Table stored as index", "Clustered index", 
            	    "Both a and b", "Neither a nor b", "Table stored as index", 1));

            	questionRepository.save(new Question("Database Management", "Indexing", 
            	    "What is the purpose of index statistics?", 
            	    "Query optimization", "Performance monitoring", 
            	    "Both a and b", "Neither a nor b", "Both a and b", 1));

            	questionRepository.save(new Question("Database Management", "Indexing", 
            	    "What is the downside of index maintenance?", 
            	    "Overhead during DML", "Storage space", 
            	    "Both a and b", "Neither a nor b", "Both a and b", 1));
    }
  }
    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("subjects", subjectRepository.findAll());
        return "home";
    }

    @GetMapping("/subject/{name}")
    public String showTopics(@PathVariable String name, Model model) {
        Subject subject = subjectRepository.findByName(name);
        if (subject == null) {
            return "redirect:/";
        }
        model.addAttribute("subject", subject);
        model.addAttribute("topics", subject.getTopicsArray());
        return "topics";
    }
}