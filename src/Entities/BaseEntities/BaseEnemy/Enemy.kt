package Entities.BaseEntities.BaseEnemy

abstract class Enemy():EnemyInterface {
    abstract override val name: String
    abstract override val type: String
    abstract override val hp: Int
    abstract override val level: Int


}