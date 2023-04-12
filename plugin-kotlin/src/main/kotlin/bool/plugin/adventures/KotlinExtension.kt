package bool.plugin.adventures

abstract class KotlinExtension {
    var isNotJavaBean: Boolean = true

    var javaBean: Boolean = true

    fun isMethodNotJavaBean(): Boolean = true

    fun getMethodJavaBean(): Boolean = true
}
