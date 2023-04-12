package bool.plugin.adventures

abstract class KotlinExtension {
    var isNotJavaBean: Boolean = true

    var javaBean: Boolean = true

    fun isMethodNotJavaBean(): Boolean = true

    fun getMethodJavaBean(): Boolean = true

    var isNotJavaBeanNullable: Boolean? = true

    var javaBeanNullable: Boolean? = true

    fun isMethodNotJavaBeanNullable(): Boolean? = true

    fun getMethodJavaBeanNullable(): Boolean? = true
}
