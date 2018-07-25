FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY ./heroes-app-boot/target/heroes-app-boot-1.0-SNAPSHOT.jar ./heroes-app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/heroes-app.jar"]