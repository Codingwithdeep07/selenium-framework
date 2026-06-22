pipeline {
    agent any

    stages {

        stage('Checkout') {
            steps {
                git 'https://github.com/Codingwithdeep07/selenium-framework.git'
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean test'
            }
        }
    }

    post {

        always {
            archiveArtifacts artifacts: 'reports/**'
        }
    }
}