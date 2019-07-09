package `fun`

import java.math.BigInteger

fun main() {
    // Stack Overflow!!!
    // println(fibNotailRec(n = 10000, a = BigInteger("1"), b = BigInteger("0")))

    // No Stack Overflow
    println(fibtailRec(n = 10000, a = BigInteger("1"), b = BigInteger("0")))
}

// 1, 1, 2, 3, 5, 8, 13

fun fibNotailRec(n: Int, a: BigInteger, b: BigInteger): BigInteger {
    return if (n == 0) b else fibNotailRec(n-1, a + b, a)
}

tailrec fun fibtailRec(n: Int, a: BigInteger, b: BigInteger): BigInteger {
    return if (n == 0) b else fibtailRec(n-1, a + b, a)
}
