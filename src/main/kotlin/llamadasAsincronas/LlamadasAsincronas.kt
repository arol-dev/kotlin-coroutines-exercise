package dev.arol.llamadasAsincronas

import kotlinx.coroutines.*

suspend fun apiCallRandomInt(): Int {
    TODO("""
        Implementa una funcion que llame a utils.fakeHttpRequest()
        y retorne el resultado. Ten en cuenta que debemos cambiar
        la firma de la funcion para que sea una funcion suspendida.
    """)
}

suspend fun getRandomIntegers(): List<Int> = coroutineScope {
    TODO("""
        Implementa una funcion que llame a apiCallRandomInt()
        10 veces y retorne una lista con los resultados. Ten en cuenta
        que debes usar coroutines para hacer las llamadas de manera
        asincrona.
    """)
}

fun main() {
    runBlocking {
        val randomIntegers = getRandomIntegers()
        println(randomIntegers)
    }
}