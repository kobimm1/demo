pipeline {
    agent {
        checkout([$class: 'GitSCM', branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/kobimm1/demo.git']]])
        docker { image 'python' }
    }
    stages {
        stage('Test') {
            steps {
                sh 'python demo.py'
            }
        }
    }
}
