package bool.plugin.adventures

abstract class GroovyExtension {
    Boolean isNotJavaBean = Boolean.TRUE

    Boolean javaBean = Boolean.TRUE

    Boolean isMethodNotJavaBean() { Boolean.TRUE }

    Boolean getMethodJavaBean() { Boolean.TRUE }
}