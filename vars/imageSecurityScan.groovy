#!/usr/bin/env groovy

def call(String imageName, String imageVersion, String outputFileName) {
    sh "trivy image --format table -o $outputFileName $imageName:$imageVersion"
}