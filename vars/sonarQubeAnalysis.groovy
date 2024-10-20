#!/usr/bin/env groovy

def call(String sonarServer, String projectKey, String projectName) {
    withSonarQubeEnv(sonarServer) {
        sh "$SCANNER_HOME/bin/sonar-scanner -Dsonar.projectKey=$projectKey -Dsonar.projectName=$projectName -Dsonar.java.binaries=target"
    }
}
