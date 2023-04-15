package refactoring.composingmethods.inlinemethod

import io.kotest.assertions.assertSoftly
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test

internal class RatingTest {
    @Test
    fun testGetRating() {
        assertSoftly {
            Rating(5).getRating() shouldBe 1
            Rating(6).getRating() shouldBe 2
        }
    }
}