package refactoring.composingmethods.replacetempwithquery

class Price(private val quantity: Int, private val itemPrice: Double) {
    fun getPrice(): Double {
        val basePrice = quantity * itemPrice
        val discountFactor = if (basePrice > 1000) 0.95 else 0.98
        return basePrice * discountFactor
    }
}