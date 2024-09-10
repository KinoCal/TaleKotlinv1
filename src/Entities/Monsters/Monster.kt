package Entities.Monsters

import Entities.BaseEntities.BaseEnemy.Enemy
import Entities.BaseEntities.BaseEnemy.EnemyInterface

class Monster(
    override val name: String,
    override val type: String,
    override val hp: Int,
    override val level: Int
) : Enemy(), EnemyInterface {
}