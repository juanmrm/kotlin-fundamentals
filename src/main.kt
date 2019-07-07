import java.util.*

fun main(args: Array<String>) {
    println("Hello World!")
    val q = Question()
    q.answer = "Four"
   // q.question = 'Another question'

    q.display()

    println("The answer to the question ${q.question} is ${q.answer}")

    val message = if(q.answer == q.correctAnswer)
        "You were correct"
    else "Try again?"

    println(message)

    q.printResult()

    val number:Int? = try {
        Integer.parseInt(q.answer)
    } catch (e:NumberFormatException) {
        null
    }

    println("Number is $number")

    ranges()
}

class Question {
    var answer: String? = null // To assign a null value we have to put ? in the definition of a variable
    val correctAnswer = "42"
    val question: String = "What is the answer to life, the universe of everything?"

    fun display() {
        println("You said $answer")
    }

    fun printResult() {
        when (answer) {
            correctAnswer -> println("You were correct")
            else -> println("Try again?")
        }
    }
}

fun ranges() {
    println("Inclusive Range - Counting from 1 to 10 is steps of 2")
    for(i in 1..10 step 2) {
        println(i)
    }

    println("Inclusive Range - Countdown from 10 to 1")
    for(i in 10 downTo 1) {
        println(i)
    }

    println("Open Range - from 1 to 10, but not including 10")
    for(i in 1 until 10) {
        println(i)
    }

    val numbers = listOf(1,2,3,4,5)
    for (i in numbers) {
        println(i)
    }

    val ages = TreeMap<String, Int>()
    ages["Kevin"] = 55
    ages["Sam"] = 24
    ages["Alex"] = 24
    ages["Harry"] = 26

    for((name, age) in ages) {
        println("$name is $age")
    }

    for((index, el) in numbers.withIndex()) {
        println("$el at $index")
    }
}