pipeline {
    agent {
        docker {
            image 'maven:3.9.9-eclipse-temurin-17'
            args '-v /root/.m2:/root/.m2'
        }
    }

    stages {

        stage('Checkout') {
            steps {
                echo 'Checking out Java application'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Package') {
            steps {
                sh 'mvn package -DskipTests'
            }
        }

        stage('Success') {
            steps {
                echo 'Java application built successfully!'
            }
        }
    }
}