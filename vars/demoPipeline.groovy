#!groovy

/**
 * pipelineParams 
 *  - masterBranch: Can override the master branch name   
 *  
 */

def call(body) {

    body()

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
    post { 
      always { 
        cleanWs()
      }
    }
}