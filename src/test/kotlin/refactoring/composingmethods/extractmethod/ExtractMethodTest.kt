@file:Suppress("SameParameterValue")

package refactoring.composingmethods.extractmethod

import io.kotest.extensions.system.captureStandardOut
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

internal class ExtractMethodTest {

    private lateinit var owing: Owing

    @BeforeEach
    fun setup() {
        owing = Owing()
    }

    @Test
    fun printOwing() {
        givenOrders(10.5, 200.2)
        amountAmountShouldBe(210.7)
    }

    private fun amountAmountShouldBe(amount: Double) {
        val output = captureStandardOut {
            owing.printOwing()
        }

        output shouldBe "********************************************************************************\n" +
                "******************************** Customer Owes *********************************\n" +
                "********************************************************************************\n" +
                "name: Bob\n" +
                "amount: $amount\n"

    }

    private fun givenOrders(vararg prices: Double) {
        for (price in prices) {
            owing.addOrder(Order(price))
        }
    }
}
