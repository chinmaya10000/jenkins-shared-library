def call(String ec2Instance, String imageVersion, String dockerCredsId, String ec2KeyId) {
    withCredentials([usernamePassword(credentialsId: dockerCredsId, passwordVariable: 'DOCKER_USER', usernameVariable: 'DOCKER_PWD')]) {
        sshagent([ec2KeyId]) {
            // Copy the necessary files to the EC2 instance
            sh "scp -o StrictHostKeyChecking=no server-cmds.sh ${ec2Instance}:/home/ec2-user"
            sh "scp -o StrictHostKeyChecking=no docker-compose.yaml ${ec2Instance}:/home/ec2-user"

            // Run the deployment command on the EC2 instance
            def shellCmd = "bash ./server-cmds.sh ${imageVersion} ${DOCKER_USER} ${DOCKER_PWD}"
            sh "ssh -o StrictHostKeyChecking=no ${ec2Instance} '${shellCmd}'"
        }
    }
}