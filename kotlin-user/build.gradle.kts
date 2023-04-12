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
    // assert(methodNotJavaBean)
    assert(isMethodNotJavaBean())
    // doesn't work
    // assert(methodJavaBean)
    assert(getMethodJavaBean())
}

java {
    // doesn't work
    // notJavaBean = false
    isNotJavaBean = false
    javaBean = false
    // doesn't work
    // assert(methodNotJavaBean)
    assert(isMethodNotJavaBean())
    assert(methodJavaBean)
    assert(getMethodJavaBean())
}

groovy {
    // doesn't work
    // notJavaBean = false
    isNotJavaBean = false
    javaBean = false
    // doesn't work
    // assert(methodNotJavaBean)
    assert(isMethodNotJavaBean())
    assert(methodJavaBean)
    assert(getMethodJavaBean())
}