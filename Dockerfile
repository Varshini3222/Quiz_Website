FROM eclipse-temurin:17-jdk-jammy
WORKDIR /app
COPY .mvn/ .mvn
COPY mvnw pom.xml ./
RUN ./mvnw dependency:go-offline
COPY src ./src
RUN ./mvnw clean package -DskipTests
CMD ["java", "-jar", "target/*.jar", "--server.port=${PORT}"]
# Add this to Dockerfile for debugging:
RUN ls -la target/  # Verify JAR exists after build