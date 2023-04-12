package bool.plugin.adventures

@Suppress("UNUSED_PARAMETER")
abstract class KotlinExtension {
    var isNotJavaBean: Boolean = true

    var javaBean: Boolean = true

    fun isMethodNotJavaBean(): Boolean = true
    fun setMethodNotJavaBean(x: Boolean) = Unit

    fun getMethodJavaBean(): Boolean = true
    fun setMethodJavaBean(x: Boolean) = Unit

    var isNotJavaBeanNullable: Boolean? = true

    var javaBeanNullable: Boolean? = true

    fun isMethodNotJavaBeanNullable(): Boolean? = true
    fun setMethodNotJavaBeanNullable(x: Boolean) = Unit

    fun getMethodJavaBeanNullable(): Boolean? = true
    fun setMethodJavaBeanNullable(x: Boolean) = Unit
}
