package ir.miare.interview.feature

interface MyMessagesContract {
    // Q9: Can we create a MVP (or MVVM, etc) skeleton for our MyScore feature?
}


/**
 * This is supposed to be in data layer, but for simplicity I just placed it here
 */
// Q11: Can you turn these into DBFLow models?
class Player(val id: Int, val name: String)
class Score(val player: Player, val title: String, val target: Int?, val accomplished: Int?, val done: Boolean?)
