def call(String registry, String backendFile, String frontendFile, String imageVersion) {
    sh "sed -i 's|image: .*backend.*|image: $registry/backend:$imageVersion|g' $backendFile"
    sh "sed -i 's|image: .*frontend.*|image: $registry/frontend:$imageVersion|g' $frontendFile"
}