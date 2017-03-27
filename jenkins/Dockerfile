FROM jenkins
COPY plugins.txt /usr/share/jenkins/plugins.txt
RUN cat /usr/share/jenkins/plugins.txt |xargs /usr/local/bin/install-plugins.sh 
