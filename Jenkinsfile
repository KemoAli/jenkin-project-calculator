#!/usr/bin/env groovy

pipeline  {
    agent any

    stages {
        stage('Initialize'){
            steps {
                sh ''' 
                echo 'PATH = ${PATH}'
                echo 'M2_HOME = ${M2_HOME}'
                '''
            }
        }
        stage('SCM Checkout') {
            steps {
                git  branch: 'develop', url: 'https://github.com/KemoAli/jenkin-project-calculator.git'
                echo 'Building..'
                echo "Running ${env.BUILD_ID} on ${env.JENKINS_URL}"
            }
        }
        stage('Build'){
            steps{
                sh 'mvn clean compile'
                echo 'Build was successful.........!'
            }
        }
        stage('Test') {
            steps {
                echo 'started Testing..'
                sh 'mvn test'
                echo 'Testing completed.....!'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}
