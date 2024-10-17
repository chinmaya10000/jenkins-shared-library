#!/usr/bin/env groovy

def call(String imageName, String imageVersion) {
    withCredentials([usernamePassword(credentialsId: 'docker-credentials-id', passwordVariable: 'PASSWORD', usernameVariable: 'USER')]) {
        sh "echo $PASSWORD | docker login -u $USER --password-stdin"
        sh "docker push $imageName:$imageVersion"
    }
}