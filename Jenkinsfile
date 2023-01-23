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
            sh 'docker build -f assignment2/maven/Dockerfile-maven . -t 6789012345/infracubator:version1'
        }
      }
  }
}