FROM adoptopenjdk/openjdk11
EXPOSE 8040
ADD target/*.jar app.jar
ENTRYPOINT ["sh", "-c", "java -jar /app.jar"]
