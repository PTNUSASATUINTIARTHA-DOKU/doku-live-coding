FROM openjdk:11-jre-slim
#FROM openjdk:8-jre-alpine3.9

# copy the packaged jar file into our docker image
COPY target/doku-test-0.0.1-SNAPSHOT.jar /doku-test.jar

# set the startup command to execute the jar
CMD ["java", "-jar", "/doku-test.jar"]