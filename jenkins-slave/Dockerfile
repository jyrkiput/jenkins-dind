FROM docker
RUN apk update && apk add git openjdk8
ADD https://repo.jenkins-ci.org/releases/org/jenkins-ci/plugins/swarm-client/3.3/swarm-client-3.3.jar /swarm-client.jar
ENTRYPOINT ["java", "-jar", "/swarm-client.jar"]
