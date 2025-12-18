FROM maven:3.8.6 AS build
COPY . .
RUN mvn clean package

FROM openjdk:17
COPY --from=build target/app.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","app.jar"]
