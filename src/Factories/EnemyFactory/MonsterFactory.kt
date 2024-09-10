package Factories.EnemyFactory

import Entities.BaseEntities.BaseEnemy.Enemy
import Entities.Monsters.Monster

object MonsterFactory : EnemyFactory{
    override fun createEnemy(name: String): Enemy {
        return when(name){
            "Rat" -> Monster("Rat","Normal", 5, 1)

            else -> {throw IllegalArgumentException("Unknown item type: $name")}
        }
    }
}