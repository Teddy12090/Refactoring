package refactoring.composingmethods.introduceexplainingvariable

import io.kotest.assertions.assertSoftly
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test

internal class PriceTest {
    @Test
    fun getPrice() {
        assertSoftly {
            Price(600.0, 10).getPrice() shouldBe 6100
            Price(100.0, 10).getPrice() shouldBe 1100
        }
    }
}