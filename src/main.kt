import com.rsk.Person

fun main() {
    println("Hello World!")

    val person = Person("Kevin")

    println("name is ${person.name}")

    person.name = "Steve"

    println("name is ${person.name}")

    // person = Person() // Val is for inmutable, so we cannot re assign (using var you can)

    person.display()

    person.displayWithLambda(::printName)
}

fun printName(name: String) {
    println(name)
}