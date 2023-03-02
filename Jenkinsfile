stage("Git Pull"){
    step{
        git url: "https://github.com/sakshi-s0ni/SPE_Calculator.git", branch: "master",
        credentialsId: "git-cred"
    }
}
stage("Maven Build"){
    step{
        sh "mvn clean install"
    }
}