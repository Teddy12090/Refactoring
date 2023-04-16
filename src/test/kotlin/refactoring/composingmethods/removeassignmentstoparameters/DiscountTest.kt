package refactoring.composingmethods.removeassignmentstoparameters

import io.kotest.assertions.assertSoftly
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test
import removeassignmentstoparameters.Discount

internal class DiscountTest {
    @Test
    fun discount() {
        val discount = Discount()
        assertSoftly {
            discount.discount(50, 100, 10000) shouldBe 50
            discount.discount(51, 100, 10000) shouldBe 49
            discount.discount(50, 101, 10000) shouldBe 49
            discount.discount(50, 100, 10001) shouldBe 46
        }
    }
}