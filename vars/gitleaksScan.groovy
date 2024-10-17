#!/usr/bin/env groovy

def call(String sourceDir = '.', String reportFile = 'gitleaks-report.json') {
    script {
        try {
            // Run Gitleaks scan
            sh "gitleaks detect --source=${sourceDir} -v --report-path=${reportFile}"
            echo "Gitleaks scan completed successfully"
        } catch (Exception e) {
            echo "Gitleaks scan failed: ${e.message}"
            error("Gitleaks scanning stage failed")
        }
    }
}