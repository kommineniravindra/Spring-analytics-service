# Use official OpenJDK image
FROM eclipse-temurin:17-jdk

# Set working directory
WORKDIR /app

# Copy Maven wrapper files and project
COPY . .

# Grant execute permission to mvnw
RUN chmod +x mvnw

# Build the app using Maven Wrapper
RUN ./mvnw clean install -DskipTests

# Expose port
EXPOSE 8084

# Run the app using exact JAR name
CMD ["java", "-jar", "target/analytics-service-0.0.1-SNAPSHOT.jar"]
