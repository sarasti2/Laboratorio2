FROM openjdk:11
EXPOSE 8080
ADD target/laboratorio2-0.0.1-SNAPSHOT.jar laboratorio2-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/laboratorio2-0.0.1-SNAPSHOT.jar"]