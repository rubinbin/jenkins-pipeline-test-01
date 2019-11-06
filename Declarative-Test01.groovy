pipeline {
    agent any
    stages {
        stage('git') {
            steps {
            sh 'echo "git"'
            }
        }
        stage('build') {
            steps {
            sh 'echo "build"'
            }
        }
        stage('deploy') {
            steps {
            sh 'echo "deploy"'
            }
        }
        stage('test') {
            steps {
            sh 'echo "test"'
            }
        }
    }
}