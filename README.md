# kotlin-fundamentals
Learning Kotlin Fundamentals

### What is Kotlin?
- JVM Language
- Object oriented
- Functional:
    - Higher order functions
- Less ceremony than Java

### Better Java
- Less ceremony, code is generally simpler
- Exception handling
- Language features:
    - Support fon immutable types
    - String interpolation
    - Looping constructs
    - Expressions
    - Ranges
- You can just code, no need even for classes

### Inmutability
- `var` to declare a mutable variable
- `val` to declare an inmutable variable
- When we declare variables in a class, the compiler generates the getter / setter properties automatically

### String Templates
- Using a simple variable use `$variable`
- Using a compound variable use `${x.variable}`

### If as an expression
- If statement works as an expression returning it's value from the if / else statement so we can assing it 
to a variable like
```
    val message = if(q.answer == q.correctAnswer)
        "You were correct"
    else "Try again?
```

### Improve handling of null valuesç
- We cannot assing a null value to a variable if we don't explicitly say that this variable can either be null or contain a variable with ? `var name: String? = null`

### Switch statement doesn't exist, instead `when`
- Very powerfull
```
when (answer) {
    correctAnswer -> println("You were correct")
    else -> println("Try again?")
}
```   

### Try - catch as an expression
- Similar to if
```
    val number:Int? = try {
        Integer.parseInt(q.answer)
    } catch (e:NumberFormatException) {
        null
    }
```

### Looping constructs
- `While` and `do` works the same as Java
- `for` loops are different using `Ranges`, a very powerfull feature of Kotlin using `step, until, downTo, withIndex...`

### Support for exceptions
- In Java you either catch the exception or rethrow it. Kotlin uses essentially Unchecked exceptions so you don't neet to catch them.
If you want you can
```
try {
    reader.read()
} catch (e: IOException) {

} finally { ... }
```
