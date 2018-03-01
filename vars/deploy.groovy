def deploy(pkgname, version, environment) {
    sh "About to deploy ${pkgname} version ${version} to ${environment}..."
    sh "sleep 5"
}
