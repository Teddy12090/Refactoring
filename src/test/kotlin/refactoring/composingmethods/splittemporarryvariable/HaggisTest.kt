package refactoring.composingmethods.splittemporarryvariable

import io.kotest.assertions.assertSoftly
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test

internal class HaggisTest {
    @Test
    fun getDistanceTravelled() {
        assertSoftly {
            Haggis(1.0, 1.0, 1.0, 1).getDistanceTravelled(1) shouldBe 0.5
            Haggis(1.0, 1.0, 1.0, 1).getDistanceTravelled(2) shouldBe 2.5
            Haggis(5.0, 3.0, 2.0, 1).getDistanceTravelled(2) shouldBe 5.75
        }
    }
}