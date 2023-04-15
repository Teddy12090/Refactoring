package refactoring.composingmethods.inlinetemp

class Price(private val anOrder: Order) {

    fun basePriceOver1000(): Boolean {
        return anOrder.basePrice > 1000
    }
}

data class Order(val basePrice: Int)
