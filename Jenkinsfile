pipeline {
    agent {
        node {
            label 'Win7'
        }
    }
    stages { 	
        stage('Execute script') {
            steps {
                bat 'mvn clean compile -Durl=http://rediff.com -Dbrowser=chrome -Dsuitename=testng test'
            }
        }            
    }
}