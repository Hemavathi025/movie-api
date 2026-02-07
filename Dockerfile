FROM eclipse-temurin:17-jdk

WORKDIR /app

COPY . .

# 🔥 IMPORTANT LINE (this fixes the error)
RUN chmod +x mvnw

RUN ./mvnw clean package -DskipTests

EXPOSE 8080

CMD ["java", "-jar", "target/movieapi-0.0.1-SNAPSHOT.jar"]
