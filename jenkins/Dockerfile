FROM jenkins
COPY plugins.txt /usr/share/jenkins/plugins.txt
RUN cat /usr/share/jenkins/plugins.txt |xargs /usr/local/bin/install-plugins.sh
RUN echo 2.0 > /var/jenkins_home/jenkins.install.UpgradeWizard.state
ADD basic-security.groovy /var/jenkins_home/init.groovy.d/basic-security.groovy
ADD enable-master-slave-security.groovy /var/jenkins_home/init.groovy.d/enable-master-slave-security.groovy
ADD remove-executors-from-master.groovy /var/jenkins_home/init.groovy.d/remove-executors-from-master.groovy
