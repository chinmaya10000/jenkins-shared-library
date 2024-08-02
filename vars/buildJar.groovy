#!/usr/bin/env groovy

def call() {
    echo 'Building the app...'
    sh './gradlew clean build'
}
