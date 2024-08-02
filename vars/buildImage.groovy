def call() {
    echo 'Building and push Image..'
    withCredentials([usernamePassword(credentialsId: 'docker-hub-repo', passwordVariable: 'PASS', usernameVariable: 'USER')]) {
        sh "docker build -t chinmayapradhan/java-mysql-app ."
        sh "echo $PASS | docker login -u $USER --password-stdin"
        sh "docker push chinmayapradhan/java-mysql-app"
    }
}
