FROM java:8
VOLUME /tmp
ADD @project.build.finalName@.jar eureka-server.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/eureka-server.jar"]
EXPOSE 8761