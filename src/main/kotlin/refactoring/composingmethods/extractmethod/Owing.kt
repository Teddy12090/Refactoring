package refactoring.composingmethods.extractmethod

import org.apache.commons.lang3.StringUtils

private const val TEXT_WIDTH = 80

class Owing {
    private val name: String = "Bob"

    private val orders = Orders()

    fun addOrder(order: Order) {
        orders.add(order)
    }

    fun printOwing() {
        val e = orders.iterator()
        var outstanding = 0.0

        printBanner()

        // calculate outstanding
        while (e.hasNext()) {
            val order = e.next()
            outstanding += order.price
        }

        // print details
        println("name: $name")
        println("amount: $outstanding")
    }

    private fun printDetails(outstanding: Double) {
        // print details
        println("name: $name")
        println("amount: $outstanding")
    }

    private fun printBanner() {
        // print banner
        println("********************************************************************************")
        println(StringUtils.center(" Customer Owes ", TEXT_WIDTH, '*'))
        println("********************************************************************************")
    }
}

data class Order(val price: Double)
class Orders {
    private val elements = ArrayList<Order>()

    fun add(order: Order) {
        elements.add(order)
    }

    fun iterator(): Iterator<Order> {
        return elements.iterator()
    }
}
