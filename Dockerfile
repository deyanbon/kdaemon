FROM openjdk:17 AS kdaemon
LABEL authors="dbontch"

#RUN mkdir data

ADD target/kdaemon-1.0.0-SNAPSHOT.jar kdaemon.jar

ENTRYPOINT ["java", "-jar", "kdaemon.jar"]
EXPOSE 8088
