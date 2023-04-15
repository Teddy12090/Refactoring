package refactoring.composingmethods.replacetempwithquery

import io.kotest.assertions.assertSoftly
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test

internal class PriceTest {
    @Test
    fun getPrice() {
        assertSoftly {
            Price(1, 1000.0).getPrice() shouldBe 980
            Price(10, 110.0).getPrice() shouldBe 1045
        }
    }
}