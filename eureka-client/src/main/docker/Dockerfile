FROM java:8
VOLUME /tmp
ADD eureka-client-0.0.1-SNAPSHOT.jar eureka-client.jar
RUN sh -c 'touch /eureka-client.jar'
CMD exec java -Djava.security.egd=file:/dev/./urandom -jar /eureka-client.jar
EXPOSE 7074