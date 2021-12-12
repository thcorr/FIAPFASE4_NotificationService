FROM openjdk:8-jdk-alpine
ADD /target/notificationService-0.0.1-SNAPSHOT.jar notificationservice.jar
EXPOSE 7088
ENTRYPOINT ["java","-jar","/notificationservice.jar"]
