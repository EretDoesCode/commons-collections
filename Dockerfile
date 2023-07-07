FROM openjdk:20
ADD target/commons-collections4-M-SNAPSHOT.jar commons-collections4-M-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar","commons-collections4-M-SNAPSHOT.jar"]
EXPOSE 8080

