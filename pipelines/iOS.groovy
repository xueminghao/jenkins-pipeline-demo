pipeline {
    agent {
        label('master')
    }

    stages {
        stage('test') {
            steps {
                script {
                    log.info("Hello Info")
                    log.error("hello error")
                }
            }
        }
    }
}