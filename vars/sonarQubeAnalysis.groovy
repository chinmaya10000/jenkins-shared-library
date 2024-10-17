#!/usr/bin/env groovy

def call(String sonarServer, String projectKey, String projectName) {
    withSonarQubeEnv(sonarServer) {
        sh 'mvn sonar:sonar -Dsonar.projectKey=$projectKey -Dsonar.projectName=$projectName'
    }
}
