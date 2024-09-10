package GameItems.Equipment.Weapons

import GameItems.BaseItem.ItemInterface

interface WeaponInterface : ItemInterface {
    val damageValue: Int
}