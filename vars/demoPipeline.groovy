#!groovy

/**
 * pipelineParams 
 *  - agentLabel=Can override agent label
 *  - masterBranch: Can override the master branch name
 *  - integrationBranch: Can override the integration branch name
 *  - ucdUrl: Con override the urbancode url
 *  - ucdToken: Can override the urbancode token 
 *  - isLibrary: If is a library doesn't deploy
 *  - componentName UrbanCode component Name
 *  - groupId: GroupId for the component Name
 *  - applicationProject: UrbanCode application project
 *  
 *  
 */
 pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                sh '''
                    echo "Multiline shell steps works too"
                    ls -lah
                '''    
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}