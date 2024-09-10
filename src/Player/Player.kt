package Player

import GameItems.BaseItem.Item
import GameItems.BaseItem.ItemEmpty

object Player {

    var non = 1
    val hp = 10
    val currentHp = hp
    var maxHp = hp
    var level = 1
    var currentXp = 0
    var maxXp = xpGainFormula()
    var strength = 1
    var attack = 1
    var dexterity = 1
    var intelligence = 1

    val inventory: MutableList<Item> = MutableList(10) { ItemEmpty() }

    fun showPlayerInventory() {
        for (item in inventory) {
            println(item.name)
        }
    }

    fun xpGainFormula():Int{
        var xpGain = (level * 2 ) * 33
        return xpGain
    }

    fun increaseXp(amount: Int){
        currentXp += amount
    }

    fun levelUp() {
        level += 1
        hp += 10
        maxHp = hp
        currentHp = currentHp
        maxXp = xpGainFormula()
    }


    fun takeDamage(amount: Int) {
        currentHp = (currentHp - amount).coerceAtLeast(0)
        if (currentHp == 0) {
            handleDeath()
        }
    }

    fun heal(amount: Int) {
        currentHp = (currentHp + amount).coerceAtMost(maxHp)
    }

    fun increaseMaxHp(amount: Int){
        maxHp += amount
    }

    private fun handleDeath() {
        println("Player.Player has died!")
        // Additional death handling logic
    }
}
