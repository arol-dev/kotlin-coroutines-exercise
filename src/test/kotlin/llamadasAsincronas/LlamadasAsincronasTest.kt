package dev.arol.llamadasAsincronas

import dev.arol.llamadasAsincronas.getRandomIntegers
import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe
import kotlinx.coroutines.*


class LlamadasAsincronasTest: DescribeSpec({
    describe("Llamadas asincronas") {
        it("Deberia retornar una lista de 10 enteros") {
            val randomIntegers = runBlocking {
                getRandomIntegers()
            }
            randomIntegers.size shouldBe  10
        }
    }
})