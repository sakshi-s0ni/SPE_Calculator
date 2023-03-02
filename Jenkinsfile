stage("Git Pull"){
    steps{
        git url: "https://github.com/sakshi-s0ni/SPE_Calculator.git", branch: "master",
        credentialsId: "githubCredentialslogin"
    }
}
stage("Maven Build"){
    steps{
        sh "mvn clean install"
    }
}