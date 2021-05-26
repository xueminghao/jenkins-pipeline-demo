
pipeline {
    agent {
        label('master')
    }

    stages {
        stage('test') {
            steps {
                buildStep name: "iOS", repo: "git@gitlab.yuceyi.com:client/ios_2c.git"
            }
        }
    }
}