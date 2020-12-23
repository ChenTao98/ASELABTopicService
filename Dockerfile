FROM java:8
COPY "./target/topic-0.0.1-SNAPSHOT.jar" "/topic-0.0.1-SNAPSHOT.jar"
EXPOSE 8082
CMD ["java", "-jar","topic-0.0.1-SNAPSHOT.jar","--spring.profiles.active=product"]