package Factories.ItemFactory

import GameItems.BaseItem.Item

interface ItemFactory {

    fun createItem(item: String): Item
}