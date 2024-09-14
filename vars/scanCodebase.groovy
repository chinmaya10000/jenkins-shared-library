#!/usr/bin/env groovy

def call() {
    sh 'trivy fs .'
}