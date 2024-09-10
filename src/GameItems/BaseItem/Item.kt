package GameItems.BaseItem

abstract class Item(): ItemInterface {
    abstract override val name: String
    abstract override val type: String
    abstract override val price: Int

}