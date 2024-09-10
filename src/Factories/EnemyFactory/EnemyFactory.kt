package Factories.EnemyFactory

import Entities.BaseEntities.BaseEnemy.Enemy

interface EnemyFactory {
    fun createEnemy(name:String):Enemy
}