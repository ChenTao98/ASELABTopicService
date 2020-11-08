#!/bin/bash
mvn clean package -DskipTests
docker build -t aselab:topic .
docker run -p 21002:21002 -d --name aselabtopicservice aselab:topic