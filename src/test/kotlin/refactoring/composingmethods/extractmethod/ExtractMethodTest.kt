@file:Suppress("SameParameterValue")

package refactoring.composingmethods.extractmethod

import io.kotest.extensions.system.captureStandardOut
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

internal class ExtractMethodTest {

    private var previousAmount: Double = 0.0
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

    @Test
    fun printOwingWithPreviousAmount() {
        givenOrders(10.5, 200.2)
        givenPreviousAmount(10.0)
        amountAmountShouldBe(10.0 * 1.2 + 210.7)
    }

    private fun givenPreviousAmount(previousAmount: Double) {
        this.previousAmount = previousAmount
    }

    private fun amountAmountShouldBe(amount: Double) {
        val output = captureStandardOut {
            owing.printOwing(previousAmount)
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
