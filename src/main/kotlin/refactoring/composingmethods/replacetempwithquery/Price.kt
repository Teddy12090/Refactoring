package refactoring.composingmethods.replacetempwithquery

class Price(private val quantity: Int, private val itemPrice: Double) {
    fun getPrice(): Double {
        val discountFactor = getDiscountFactor()
        return getBasePrice() * getDiscountFactor()
    }

    private fun getDiscountFactor(): Double {
        return if (getBasePrice() > 1000) 0.95 else 0.98
    }

    private fun getBasePrice(): Double {
        return quantity * itemPrice
    }
}