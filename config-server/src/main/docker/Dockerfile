FROM java:8
VOLUME /tmp
ADD config-server-0.0.1-SNAPSHOT.jar config-server.jar
RUN sh -c 'touch /config-server.jar'
CMD exec java -Djava.security.egd=file:/dev/./urandom -jar /config-server.jar
EXPOSE 18888