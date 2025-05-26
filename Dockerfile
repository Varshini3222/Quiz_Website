FROM eclipse-temurin:17-jdk-jammy
WORKDIR /app

# Copy only the files needed for dependency resolution
COPY .mvn .mvn
COPY mvnw pom.xml ./
RUN ./mvnw dependency:go-offline

# Copy source code and build
COPY src src
RUN ./mvnw clean package -DskipTests

# Explicitly name the JAR file (critical fix)
RUN ls -la target/  # Debug: Verify JAR exists
CMD ["java", "-jar", "target/quiz.jar", "--server.port=${PORT}"]