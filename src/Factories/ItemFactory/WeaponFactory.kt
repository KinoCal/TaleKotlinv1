package Factories.ItemFactory

import GameItems.BaseItem.Item
import GameItems.Equipment.Weapons.Weapon

object WeaponFactory : ItemFactory {
    override fun createItem(itemName: String): Item {

        return when(itemName){
            "Dagger" -> Weapon(
            name = "Dagger",
            type = "Weapon",
            price = 2,
            damageValue = 1
            )

            else -> {throw IllegalArgumentException("Unknown item type: $itemName")}
        }
    }


}