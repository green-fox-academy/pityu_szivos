FROM openjdk:8-jdk-alpine
VOLUME /tmp
EXPOSE 8080
ADD /build/libs/demopizzadelivery-0.0.1-SNAPSHOT.jar app.jar
RUN sh -c 'touch demopizzadelivery-0.0.1-SNAPSHOT.jar'
ENTRYPOINT ["java", "-jar", "app.jar"]