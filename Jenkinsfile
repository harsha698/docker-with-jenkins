pipeline {
	agent any  
    stages {
      stage('Checkout') {
        steps {
            checkout scm
        }
      }
      stage('Docker Build') {
        steps {
            sh 'docker build -f infracubator-docker-jenkins/assignment2/maven/Dockerfile-maven . -t harsha698/infracubator:version1'
        }
      }
  }
}