#!/usr/bin/env groovy

def call(String backendImage, String frontendImage) {
    sh "trivy image $backendImage"
    sh "trivy image $frontendImage"
}