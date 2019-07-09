@file:JvmName("DisplayFunctions")

package `fun`

fun main() {
    log("Hello World")
    log(max(5, 7).toString())
    log(logLevel = 3, message = "Other message")

    val text = "With     multiple \t whitespace"
    println(replaceMultipleWhiteSpace(text))
    println(text.replaceMultipleWhiteSpaceEx())
}

@JvmOverloads
fun log(message: String, logLevel: Int = 1) {
    println("$logLevel: $message")
}

fun max(a: Int, b: Int): Int = if (a > b) a else b

// In Java you'll put this
fun replaceMultipleWhiteSpace(value: String): String {
    val regex = Regex("\\s+")
    return regex.replace(value, " ")
}

fun String.replaceMultipleWhiteSpaceEx(): String {
    val regex = Regex("\\s+")
    return regex.replace(this, " ") // `this` is the value received
}