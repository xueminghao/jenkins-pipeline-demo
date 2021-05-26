pipeline {
    agent {
        label('master')
    }

    stages {
        stage('test') {
            steps {
                echo "Hello World"
            }
        }
    }
}