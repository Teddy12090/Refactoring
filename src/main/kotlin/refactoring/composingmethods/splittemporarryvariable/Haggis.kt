package refactoring.composingmethods.splittemporarryvariable

import kotlin.math.min

class Haggis(private val primaryForce: Double, private val secondaryForce: Double, private val mass: Double, private val delay: Int) {
    fun getDistanceTravelled(time: Int): Double {
        val primaryAcc = primaryForce / mass
        val primaryTime = min(time, delay)
        var result = 0.5 * primaryAcc * primaryTime * primaryTime
        val secondaryTime = time - delay
        if (secondaryTime > 0) {
            val primaryVel = primaryAcc * delay
            val acc = (primaryForce + secondaryForce) / mass
            result += primaryVel * secondaryTime + 0.5 * acc * secondaryTime * secondaryTime
        }
        return result
    }
}