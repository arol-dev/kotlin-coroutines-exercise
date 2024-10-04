package dev.arol.contextos

import kotlinx.coroutines.*

fun calcularPrimosAsync(rango: IntRange): List<Int> {
    TODO("""
        Implementa una funcion que reciba un rango de enteros y retorne
        una lista con los numeros primos dentro de ese rango. Debes usar
        la funcion dev.arol.utils.esPrimo para determinar si un número
        es primo o no. La funcion debe ser una funcion suspendida.
    """)
}

fun calcularPrimosSeguro(rango:IntRange, tiempoLimite: Long): List<Int> {
    TODO("""
        Llama a la funcion calcularPrimosAsync con el método `withTimeout`.
        Si el tiempo de ejecución excede el tiempo límite, lanza una excepción
        con el mensaje "Tiempo de ejecución excedido".
    """)
}

fun main() {
    runBlocking {
        val rango = 1..1_000_000
        val tiempoLimite = 5000L
        val primos = calcularPrimosSeguro(rango, tiempoLimite)
        println(primos)
    }
}