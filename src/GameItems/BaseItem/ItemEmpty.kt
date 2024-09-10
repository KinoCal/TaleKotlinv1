package GameItems.BaseItem

class ItemEmpty(
    override val name: String = "empty",
    override val type: String = "empty",
    override val price: Int = 0
) : Item(), ItemInterface {
}