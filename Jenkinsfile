pipeline {
    agent any
    tools {
        maven 'maven'
    }

    stages {
        stage('Build JAR File') {
            steps {
                checkout([$class: 'GitSCM', branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/Maxahup/Proyecto1_Mingeso.git']]])
                sh 'mvn clean install -DskipTests'
            }
        }
        /*
        stage('Test') {
            steps {

            }
        }
        */
        stage('Build Docker Image') {
            steps {
                sh 'docker build -t maxahumada/mroyecto1_mingeso .'     //docker debe estar corriendo
            }
        }
        stage('Push Docker Image') {
            steps {
                withCredentials([string(credentialsId: 'dockerhub-password', variable: 'dckpass')]) {
                // some block
                    sh 'docker login -u maxahumada -p ${dckpass}'
                }
                sh 'docker push maxahumada/mroyecto1_mingeso'
            }
        }
    }
    post {
        always {
            sh 'docker logout'
        }
    }
}