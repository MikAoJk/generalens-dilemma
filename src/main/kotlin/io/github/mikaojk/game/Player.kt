package io.github.mikaojk.game

data class Player(val name: String, val soilders: List<Soldier> = emptyList(), val battelsWon: Int = 0) {

    //val battelsWonTotal: Int = battelsWon

    val numberOfSoilders: Int = soilders.size

}

data class Soldier(
    val number: Int
)