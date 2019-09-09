@Library(value="BV-JenkinsSharedLibrary", changelog=false) _
    appEnginePipeline {
        service="gaming-admin"
        artifactId="administration-gaming"
        appengine_token_file="appengine-token-config.json"
        token_file="gaming-token-config.json"
        appengine_web_token_file="appengine-web-token.xml"
        gamingAppFlag="true"
        artifactory_token_file="gaming-artifactory-token-config.json"
        downstream_job_name="Gaming-Admin-Database"
        SandboxTag="Sandbox"
        application="gaming"
}