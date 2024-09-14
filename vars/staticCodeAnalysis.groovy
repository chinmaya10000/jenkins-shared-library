def call(String backendDir, String frontendDir) {
    dir(backendDir) {sh 'npx eslint .'}
    dir(frontendDir) {sh 'npx eslint .'}
}
