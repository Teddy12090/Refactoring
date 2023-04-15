package refactoring.composingmethods.replacetempwithquery

class Price(private val quantity: Int, private val itemPrice: Double) {
    fun getPrice(): Double {
        val basePrice = getBasePrice()
        val discountFactor = if (getBasePrice() > 1000) 0.95 else 0.98
        return getBasePrice() * discountFactor
    }

    private fun getBasePrice(): Double {
        return quantity * itemPrice
    }
}