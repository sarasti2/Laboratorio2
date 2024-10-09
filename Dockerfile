FROM openjdk:11
EXPOSE 8080
ADD target/Laboratorio2-0.0.1-SNAPSHOT.jar Laboratorio2-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/Laboratorio2-0.0.1-SNAPSHOT.jar"]