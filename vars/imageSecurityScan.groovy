#!/usr/bin/env groovy

def call(String imageName, String imageVersion) {
    sh "trivy image --format table -o image.json $imageName:$imageVersion"
}