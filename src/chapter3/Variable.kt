package chapter3

fun main(args: Array<String>) {
    var variableA = 10
    val constantA = 20
    variableA = 30
    // constantA = 40 // in Kotlin, we can make variable var, val
                      // var variable is a normal variable, so we can read/set data.
                      // but val variable is a readonly variable, so we cannot set data like final variable in Java.
    // And in Kotlin we can omit type declaration.
}