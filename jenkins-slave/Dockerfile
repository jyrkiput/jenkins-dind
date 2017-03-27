FROM docker
# ENV DOCKER_HOST="unix:///var/run/docker/docker.sock"
RUN apk update && apk add git openjdk8
ADD https://repo.jenkins-ci.org/releases/org/jenkins-ci/plugins/swarm-client/2.2/swarm-client-2.2-jar-with-dependencies.jar /swarm-client.jar
ENTRYPOINT ["java", "-jar", "/swarm-client.jar"]
