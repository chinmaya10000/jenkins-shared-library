#!/usr/bin/env groovy

def call(String backendDir, String frontendDir) {
    dir(backendDir) {
        sh 'npm install'
    }
    dir(frontendDir) {
        sh 'npm install'
    }
}
