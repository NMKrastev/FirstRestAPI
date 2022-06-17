pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                sh 'ls'
                sh './mvnw clean compile'
            }
        }
        stage ('Test') {
            steps {
                sh './mvnw test'
            }
        }
        stage ('Package') {
            steps {
                sh './mvnw package'
            }
        }
    }
}