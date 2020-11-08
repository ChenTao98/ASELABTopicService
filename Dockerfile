FROM java:8
COPY "./target/topic-0.0.1-SNAPSHOT.jar" "/topic-0.0.1-SNAPSHOT.jar"
EXPOSE 21002
CMD ["java", "-jar","topic-0.0.1-SNAPSHOT.jar","--spring.profiles.active=product"]