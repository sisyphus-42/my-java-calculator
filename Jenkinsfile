pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                // Pull from the GitHub repo
                checkout scm
            }
        }
        stage('Compile') {
            steps {
                // Compile Calculator.java
                sh 'javac Calculator.java'
            }
        }
        stage('Run') {
            steps {
                // Execute the main() to verify output
                sh 'java Calculator'
            }
        }
    }

    post {
        always {
            // Archive console output or any artifacts if needed
            archiveArtifacts artifacts: 'Calculator.class', fingerprint: true
        }
    }
}
