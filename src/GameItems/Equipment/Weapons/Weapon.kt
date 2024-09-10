package GameItems.Equipment.Weapons

import GameItems.BaseItem.Item

class Weapon(
    override val name: String,
    override val type: String,
    override val price: Int,
    override val damageValue: Int
) : Item(), WeaponInterface {

}