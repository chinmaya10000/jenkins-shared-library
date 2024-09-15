#!/usr/bin/env groovy

def call(String GitUrl, String GitBranch){
  git url: "${GitUrl}", branch: "${GitBranch}"
}