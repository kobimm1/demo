pipeline {
    agent {
        docker { image 'python' }
    }
    stages {
        stage('init'){
            steps {
               checkout([$class: 'GitSCM', branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/kobimm1/demo.git']]])
            }
        }
        stage('Test') {
            steps {
                sh 'python demo.py'
            }
        }
    }
}
