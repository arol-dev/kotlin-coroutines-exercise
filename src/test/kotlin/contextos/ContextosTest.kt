package contextos

import dev.arol.contextos.calcularPrimosAsync
import dev.arol.contextos.calcularPrimosSeguro
import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe

class ContextosTest: DescribeSpec({
    describe("Contextos") {
        it("Deberia retornar una lista de primos") {
            val primos = calcularPrimosAsync(1..10)
            primos.size shouldBe 4
            primos shouldBe listOf(2, 3, 5, 7)
        }

        it("Deberia retornar una lista de primos con un tiempo limite") {
            val primos = calcularPrimosSeguro(1..1_000_000, 5000L)
            primos.size shouldBe 78498
        }

        it("Deberia retornar una excepción por tiempo de ejecución excedido") {
            try {
                calcularPrimosSeguro(1..1_000_000, 1L)
            } catch (e: RuntimeException) {
                e.message shouldBe "Tiempo de ejecución excedido"
            }
        }
    }
})