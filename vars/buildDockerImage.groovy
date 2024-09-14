#!/usr/bin/env groovy

def call(String registry, String backendDir, String frontendDir, String imageVersion) {
    dir(backendDir) {
        sh "docker build -t $registry/backend:$imageVersion ."
    }
    dir(frontendDir) {
        sh "docker build -t $registry/frontend:$imageVersion ."
    }
}