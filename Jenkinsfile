pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                echo 'Source code checked out from GitHub'
            }
        }

        stage('Build') {
            steps {
                sh '''
                    docker run --rm \
                    -v jenkins_home:/var/jenkins_home \
                    -w "$WORKSPACE" \
                    maven:3.9.9-eclipse-temurin-17 \
                    mvn -B clean compile
                '''
            }
        }

        stage('Test') {
            steps {
                sh '''
                    docker run --rm \
                    -v jenkins_home:/var/jenkins_home \
                    -w "$WORKSPACE" \
                    maven:3.9.9-eclipse-temurin-17 \
                    mvn -B test
                '''
            }
        }

        stage('Package') {
            steps {
                sh '''
                    docker run --rm \
                    -v jenkins_home:/var/jenkins_home \
                    -w "$WORKSPACE" \
                    maven:3.9.9-eclipse-temurin-17 \
                    mvn -B package -DskipTests
                '''
            }
        }

        stage('Success') {
            steps {
                echo 'Java application built successfully!'
            }
        }
    }
}