def call(String ec2Instance, String imageVersion, String dockerCredsId, String ec2KeyId) {
    withCredentials([usernamePassword(credentialsId: 'dockerCredsId', passwordVariable: 'DOCKER_USER', usernameVariable: 'DOCKER_PASS')]) {
        sh "scp -o StrictHostKeyChecking=no server-cmds.sh ${ec2Instance}:/home/ec2-user"
        sh "scp -o StrictHostKeyChecking=no docker-compose.yaml ${ec2Instance}:/home/ec2-user"

        def shellCmd = "bash ./server-cmds.sh ${imageVersion} ${DOCKER_USER} ${DOCKER_PASS}"
        sh "ssh -o StrictHostKeyChecking=no ${ec2Instance} '${shellCmd}'"
    }
}