package com.rsk

class Person (var name: String) {
    fun display() {
        println("Display: $name")
    }

    fun displayWithLambda(func: (s:String) -> Unit) { // Pass a function as parameter
        func(name)
    }
}