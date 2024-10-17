#!/usr/bin/env groovy

def call(int timeoutHours = 1, boolean abortPipeline = false) {
    timeout(time: timeoutHours, unit: 'HOURS') {
        waitForQualityGate abortPipeline: abortPipeline
    }
}