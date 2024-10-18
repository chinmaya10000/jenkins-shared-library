#!/usr/bin/env groovy

def qualityGateCheck() {
    timeout(time: 1, unit: "MINUTES") {
        waitForQualityGate abortPipeline: false
    }
}
