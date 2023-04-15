package refactoring.composingmethods.inlinemethod

class Rating(private val numberOfLateDeliveries: Int) {
    fun getRating(): Int {
        return if (numberOfLateDeliveries > 5) 2 else 1
    }

    private fun moreThanFiveLateDeliveries(): Boolean {
        return numberOfLateDeliveries > 5
    }

}