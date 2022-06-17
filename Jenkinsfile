pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                sh './mvnw clean'
                sh './mvnw validate'
                sh './mvnw compile'
            }
        }
    }
}