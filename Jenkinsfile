pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                sh './mvn clean'
                sh './mvn validate'
                sh './mvn compile'
            }
        }
    }
}