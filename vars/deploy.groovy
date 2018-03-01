def call(String pkgname = '', String version = '', String environment = '') {
    print "About to deploy ${pkgname} version ${version} to ${environment}..."
    sh "sleep 5"
}
