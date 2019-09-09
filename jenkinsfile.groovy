@Library(value="BV-JenkinsSharedLibrary", changelog=false) _
    appEnginePipeline {
        service="service-admin"
        artifactId="administration-service"
        token_file="businessview-token-config.json"
        artifactory_token_file="businessview-artifactory-token-config.json"
        SandboxTag="Sandbox"
        ConfigChangeFlag="true"
        application="bv"
}
