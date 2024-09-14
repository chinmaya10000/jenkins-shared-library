def call(String backendDir, String frontendDir) {
    dir(backendDir) {sh 'npm test'}
    dir(frontendDir) {sh 'npm test'}
}