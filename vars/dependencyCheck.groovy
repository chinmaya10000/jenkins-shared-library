#!/usr/bin/env groovy

def call(String additionalArguments, String odcInstallation) {
    dependencyCheck additionalArguments: additionalArguments, odcInstallation: odcInstallation
}