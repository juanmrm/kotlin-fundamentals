# Functions
- Don't need to be part of a class
- Are introduced with the `fun` keyword
- Can have default parameters
- Can have named parameters
- Can 'extend' existing types

### Declaration
```
    fun connect(addr: URI): Boolean {
    ...
    }
    
```
Void return type doesn't exist.

### Function Expressions
```
    fun max(a: Int, b: Int): Int = if (a > b) a else b
```

### Calling from Java

How are top level functions compiled ?. Kotlin uses the name of the file to generate a class for java, and add methods as static methods.

To call from java we invoke method from the generated class FilenameKT.methodX.

Also we can change the name of the class that Kotlin will generate using `@file:JvmName("DisplayFunctions")`

### Default Parameters

In Kotlin we can define default values for the parameters of a function, but not in Java so to make in work we need to add
the following anotation to tell the compiler to generate overloaded methods `JvmOverloads`

### Named Parameters

Instead of trusting that we're passing the parameters following the proper order, we can define named parameters.
This way is less prone to errors, because order doesn't matter.

Java doesn't support this functionality.

### Extension Functions
- Can 'add' functions to classes not owned by you
- Kotlin generates static functions
- Cut down on use of static Java utility classes
- Makes code easier to read
- Use the idea of the receiver pattern

### Infix Functions
- Member or extension functions
- Have a single parameter
- Marked with `infix` keyword
- Use the function with the syntax of an operator, don't need to use `.` nor brackets

### Overloading operators
- Using infix functions for certain operator like (+,-,=...) you can put `operator` keyword in the definition of the function and then use the operator function version
- Don't overused this, it can lead to a very complex code, but it can be very interesting for DSL

### Tail Recursive Functions
Kotlin as a functional language, prevents run out of stack space.
- Use `tailrec` keyword
- Have correct form. Not all functions can be tail recursive
- Kotlin optimises away the recursion (turns the recursion function into a loop internally)
 



 



