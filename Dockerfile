FROM eclipse-temurin:17-jdk-jammy
WORKDIR /app

# Copy build files
COPY .mvn .mvn
COPY mvnw pom.xml ./

# Download dependencies
RUN ./mvnw dependency:go-offline

# Copy source code
COPY src src

# Build the app
RUN ./mvnw clean package -DskipTests

# Windows-friendly debug command
RUN ls -la target/ || dir target

# Run with the correct JAR name (from your build output)
CMD ["java", "-jar", "target/quiz.jar", "--server.port=${PORT}"]