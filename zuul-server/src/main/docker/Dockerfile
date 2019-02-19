FROM java:8
VOLUME /tmp
ADD zuul-server-0.0.1-SNAPSHOT.jar zuul-server.jar
RUN sh -c 'touch /zuul-server.jar'
CMD exec java -Djava.security.egd=file:/dev/./urandom -jar /zuul-server.jar
EXPOSE 17777