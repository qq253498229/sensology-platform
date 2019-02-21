FROM openjdk:8-jdk-alpine
COPY target/config-server-0.0.1-SNAPSHOT.jar /app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-Dspring.profiles.active=dev","-jar","/app.jar"]