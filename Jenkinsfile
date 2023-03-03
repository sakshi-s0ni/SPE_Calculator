pipeline {
    agent any
    stages {
        stage('Git Pull') {
            steps {
                 git url: 'https://github.com/sakshi-s0ni/SPE_Calculator.git', branch: 'master',
                 credentialsId: 'git-cred'
            }
        }
        stage('Build Maven project') {
            steps {
                sh "mvn clean install"
            }
        }
        stage('Testing project') {
            steps {
                    sh "mvn test"
                }
        }
    }
}
