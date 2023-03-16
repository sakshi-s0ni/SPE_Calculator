pipeline {
    agent any
    environment{
        DOCKERHUB_CREDENTIALS = credentials('Docker-cred')
    }
    stages {
        stage('Git Pull') {
            steps {
                 git url: 'https://github.com/sakshi-s0ni/SPE_Calculator.git', branch: 'master',
                 credentialsId: 'git-cred'
            }
        }
        stage('Maven Build') {
            steps {
                sh "mvn clean install"
            }
        }
        stage('Testing project') {
            steps {
                    sh "mvn test"
                }
        }
        stage('Build Docker Image'){
            steps {
                sh 'docker build -t sakshisoni6/spe_calculator .'
            }
        }
        stage('Docker Login'){
            steps {
                sh 'echo $DOCKERHUB_CREDENTIALS_PSW | docker login -u $DOCKERHUB_CREDENTIALS_USR --password-stdin'
            }
        }
        stage('Push Image'){
            steps {
                sh 'docker push sakshisoni6/spe_calculator'
            }
        }
        stage('Ansible Deploy'){
            steps{
                ansiblePlaybook colorized: true, disableHostKeyChecking: true, installation: 'Ansible', playbook:'p3.yml'
            }
        }
    }
    post{
        always{
            sh 'docker logout'
        }
    }
}
