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
        stage ('Package') {
            steps {
                sh './mvnw install'
            }
        }
        stage ('Package') {
            steps {
                sh './mvnw deploy'
            }
        }
    }
}