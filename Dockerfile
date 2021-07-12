FROM openjdk:8
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} my-tools.jar
ENTRYPOINT ["java","-jar","/my-tools.jar"]
