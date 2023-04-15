package refactoring.composingmethods.introduceexplainingvariable

import java.lang.Double.min
import kotlin.math.max

class Price(private val itemPrice: Double, private val quantity: Int) {
    fun getPrice(): Double {
        val basePrice = quantity * itemPrice
        return basePrice - max(0, quantity - 500) * itemPrice * 0.05 + min(basePrice * 0.1, 100.0)
    }
}