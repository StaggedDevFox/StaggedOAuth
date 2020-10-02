FROM openjdk:8
ADD target/auth-0.0.1-SNAPSHOT.jar auth-0.0.1-SNAPSHOT.jar
EXPOSE 8085
ENTRYPOINT ["java", "-jar","auth-0.0.1-SNAPSHOT.jar"]