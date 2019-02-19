FROM java:8
VOLUME /tmp
ADD eureka-client1-0.0.1-SNAPSHOT.jar eureka-client1.jar
RUN sh -c 'touch /eureka-client1.jar'
CMD exec java -Djava.security.egd=file:/dev/./urandom -jar /eureka-client1.jar
EXPOSE 7075