package refactoring.composingmethods.inlinetemp

import io.kotest.assertions.assertSoftly
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test

internal class PriceTest {
    @Test
    fun testBasePriceOver1000() {
        assertSoftly {
            Price(Order(1000)).basePriceOver1000() shouldBe false
            Price(Order(1001)).basePriceOver1000() shouldBe true
        }
    }
}