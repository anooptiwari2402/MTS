FROM openjdk:17

COPY /target/matrix-interface.jar /matrix-interface.jar

EXPOSE 9000

ENTRYPOINT ["java", "-jar", "matrix-interface.jar"]