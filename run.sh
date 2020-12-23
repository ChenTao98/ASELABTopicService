#!/bin/bash
mvn clean package -DskipTests
docker build -t aselab:topic .
docker run -p 8082:8082 -d --name aselabtopicservice aselab:topic