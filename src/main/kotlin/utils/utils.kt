package dev.arol.utils

import kotlinx.coroutines.delay
import kotlin.math.sqrt
import kotlin.random.Random.Default.nextInt

suspend fun fakeHttpRequest(): Int {
    delay(1000L)
    return nextInt()
}

fun esPrimo(numero: Int): Boolean {
    if(numero < 2) return false
    (2 until sqrt(numero.toDouble()).toInt() +1).forEach {
        if (numero % it == 0) return false
    }
    return true
}