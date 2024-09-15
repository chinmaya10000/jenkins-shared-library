def call(String repoUrl, String branch = 'master') {
    checkout([$class: 'GitSCM',
        branches: [[name: branch]],
        userRemoteConfigs: [[url: repoUrl]]
    ])
}