#!/usr/bin/env groovy

def call(String registry, String imageVersion) {
    withCredentials([usernamePassword(credentialsId: 'docker-credentials-id', passwordVariable: 'PASSWORD', usernameVariable: 'USER')]) {
        sh "echo $PASSWORD | docker login -u $USER --password-stdin"
        sh "docker push $registry/backend:$imageVersion"
        sh "docker push $registry/frontend:$imageVersion"
    }
}