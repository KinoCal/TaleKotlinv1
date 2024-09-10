import Factories.EnemyFactory.MonsterFactory
import Factories.ItemFactory.WeaponFactory
import GameItems.Equipment.Weapons.Weapon
import Player.Player

fun main() {

    println(Player.level)
    println("${Player.currentHp}/${Player.maxHp}")
    println("${Player.currentXp}/${Player.maxXp}")

    Player.levelUp()

    println()
    println()

    println(Player.level)
    println("${Player.currentHp}/${Player.maxHp}")
    println("${Player.currentXp}/${Player.maxXp}")

    var rat = MonsterFactory.createEnemy("Rat")

    var dagger = WeaponFactory.createItem("Dagger") as Weapon

    println()
    println()

    println(rat.level)
    println(rat.hp)

    println()
    println()

    println(dagger.name)
    println(dagger.price)
    println(dagger.damageValue)

    Player.inventory[0] = dagger
    println()
    println()

    println(Player.showPlayerInventory())



}