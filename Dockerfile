FROM alpine
RUN apk --update add openjdk8-jre
COPY target/dockertest-0.0.1-SNAPSHOT.jar ~/dockertest/
WORKDIR ~/dockertest
CMD ["java", "-jar", "dockertest-0.0.1-SNAPSHOT.jar"]

