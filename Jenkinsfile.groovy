pipeline {
    agent any

    environment {
        DIRECTORY_PATH = '"C:\Users\hp\OneDrive - Deakin University\DEAKIN-T1(25)\IT\Task_6.1P\jenkins-pipeline-project\Jenkinsfile.groovy"'
        TESTING_ENVIRONMENT = 'Testing_Env'
        PRODUCTION_ENVIRONMENT = 'Siddhi_Dabhade' 
    }

    stages {
        stage('Build') {
            steps {
                echo "Fetch the source code from the directory path specified by the environment variable: ${DIRECTORY_PATH}"
                echo "Compile the code and generate any necessary artefacts"
            }
        }

        stage('Test') {
            steps {
                echo "Unit tests"
                echo "Integration tests"
            }
        }

        stage('Code Quality Check') {
            steps {
                echo "Check the quality of the code"
            }
        }

        stage('Deploy') {
            steps {
                echo "Deploy the application to a testing environment specified by the environment variable: ${TESTING_ENVIRONMENT}"
            }
        }

        stage('Approval') {
            steps {
                echo "Waiting for approval..."
                sleep 10
            }
        }

        stage('Deploy to Production') {
            steps {
                echo "Deploying the application to the production environment: ${PRODUCTION_ENVIRONMENT}"
            }
        }
    }
}
