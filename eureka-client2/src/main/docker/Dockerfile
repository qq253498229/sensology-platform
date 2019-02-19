FROM java:8
VOLUME /tmp
ADD eureka-client2-0.0.1-SNAPSHOT.jar eureka-client2.jar
RUN sh -c 'touch /eureka-client2.jar'
CMD exec java -Djava.security.egd=file:/dev/./urandom -jar /eureka-client2.jar
EXPOSE 7076