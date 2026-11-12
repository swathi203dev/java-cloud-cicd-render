pipeline {
    agent any

    environment {
        IMAGE_NAME = 'swathireddy203/swathi-java-cloud-app'
    }

    stages {

        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build and Test with Maven') {
            steps {
                sh 'docker build --platform linux/amd64 -t ${IMAGE_NAME}:${BUILD_NUMBER} -t ${IMAGE_NAME}:latest .'
            }
        }

        stage('Publish to Docker Hub') {
            steps {
                withCredentials([
                    usernamePassword(
                        credentialsId: 'dockerhub-credentials',
                        usernameVariable: 'DOCKER_USER',
                        passwordVariable: 'DOCKER_TOKEN'
                    )
                ]) {
                    sh '''
                        echo "$DOCKER_TOKEN" | docker login -u "$DOCKER_USER" --password-stdin
                        docker push ${IMAGE_NAME}:${BUILD_NUMBER}
                        docker push ${IMAGE_NAME}:latest
                        docker logout
                    '''
                }
            }
        }

        stage('Deploy to Render') {
            steps {
                withCredentials([
                    string(
                        credentialsId: 'render-deploy-hook',
                        variable: 'RENDER_HOOK'
                    )
                ]) {
                    sh 'curl -fsS -X POST "$RENDER_HOOK"'
                }
            }
        }
    }

    post {
        success {
            echo 'SUCCESS: Application published and Render deployment triggered!'
        }

        failure {
            echo 'FAILED: Check the Jenkins Console Output.'
        }
    }
}
