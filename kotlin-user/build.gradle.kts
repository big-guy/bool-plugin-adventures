plugins {
    id("bool.plugin.adventures.greeting-kotlin")
    id("bool.plugin.adventures.greeting-groovy")
    id("bool.plugin.adventures.greeting-java")
}

kotlin {
    // doesn't work
    // notJavaBean = false
    isNotJavaBean = false
    javaBean = false
    // doesn't work
    // methodNotJavaBean = false
    // doesn't work
    // isMethodNotJavaBean = false
    setMethodNotJavaBean(false)
    // doesn't work
    // methodJavaBean = false
    setMethodJavaBean(false)

    // doesn't work
    // notJavaBeanNullable = false
    isNotJavaBeanNullable = false
    javaBeanNullable = false
    // doesn't work
    // methodNotJavaBeanNullable = false
    setMethodNotJavaBeanNullable(false)
    // doesn't work
    // methodJavaBeanNullable = false
    setMethodJavaBeanNullable(false)
}

java {
    // doesn't work
    // notJavaBean = false
    isNotJavaBean = false
    javaBean = false
    // doesn't work
    // methodNotJavaBean = false
    isMethodNotJavaBean = false
    setMethodNotJavaBean(false)
    methodJavaBean = false
    setMethodJavaBean(false)
}

groovy {
    // doesn't work
    // notJavaBean = false
    isNotJavaBean = false
    javaBean = false
    // doesn't work
    // methodNotJavaBean = false
    isMethodNotJavaBean = false
    setMethodNotJavaBean(false)
    methodJavaBean = false
    setMethodJavaBean(false)
}
