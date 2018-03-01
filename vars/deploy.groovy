def deploy(package, version, environment) {
    sh "About to deploy ${package} version ${version} to ${environment}..."
    sh "sleep 5"
}
