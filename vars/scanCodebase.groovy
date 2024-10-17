#!/usr/bin/env groovy

def call() {
    sh 'trivy fs --format table -o fs.json .'
}