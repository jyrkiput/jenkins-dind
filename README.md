# jenkins-dind

Demoing Jenkins usage.

```
    pipeline {
        agent { docker "gradle" }

        stages {
            stage('build') {
                steps {
                    git 'https://github.com/jyrkiput/jenkins-demo.git'
                    sh 'gradle --no-daemon clean test'
                    junit '**/build/**/*.xml'
                }
            }
        }
    }
```
