pipeline {
    agent any

    tools {
        // Install the Maven version configured as "maven" and add it to the path.
        maven 'maven'
    }
    stages {
        stage('Build Maven') {
            steps {
                checkout scmGit(branches: [[name: '*/master']], extensions: [], gitTool: 'git', userRemoteConfigs: [[url: 'https://github.com/anishazam/springboot-jenkin']])
                
                // Use 'bat' instead of 'sh' for Windows
                bat 'mvn clean install'
            }
        }
        stage('Build Docker Image') {
            steps {
                // Ensure Dockerfile is in the correct directory (usually the root of the project)
                // The '.' refers to the current directory as the build context
                bat 'docker build -t anishazam/springboot-jenkin .'
            }
        }
		stage('push image docker'){
			steps{
				script{
					withCredentials([string(credentialsId: 'jenkin-docker', variable: 'docker-push')]) {
						bat 'docker login -u anishazam -p Test123@@'
					}
					bat 'docker push anishazam/springboot-jenkin'
				}
			
			}
		
		}
    }
}
