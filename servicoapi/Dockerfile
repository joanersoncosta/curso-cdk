FROM openjdk:17

ARG JAR_FILE=./target/*.jar

EXPOSE 8080

COPY ${JAR_FILE} service_api.jar

ENTRYPOINT ["java", "-jar", "service_api.jar"]