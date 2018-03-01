def call(String pkgname = '', String version = '', String environment = '') {
    sh "About to deploy ${pkgname} version ${version} to ${environment}..."
    sh "sleep 5"
}
