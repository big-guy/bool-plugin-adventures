package bool.plugin.adventures

import groovy.transform.CompileStatic

@CompileStatic
abstract class GroovyExtension {
    Boolean isNotJavaBean = Boolean.TRUE

    Boolean javaBean = Boolean.TRUE

    Boolean isMethodNotJavaBean() { Boolean.TRUE }
    void setMethodNotJavaBean(Boolean x) { }

    Boolean getMethodJavaBean() { Boolean.TRUE }
    void setMethodJavaBean(Boolean x) { }
}