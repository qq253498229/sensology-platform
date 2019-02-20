FROM fabric8/java-alpine-openjdk8-jre
VOLUME /tmp
ADD eureka-server-0.0.1-SNAPSHOT.jar eureka-server.jar
RUN sh -c 'touch /eureka-server.jar'
CMD exec java -Djava.security.egd=file:/dev/./urandom -jar /eureka-server.jar
EXPOSE 8761