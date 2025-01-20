package io.github.mikaojk.player

data class Player(
    val name: String,
    var soilders: Int,
    var wins: Int
)

fun getWinner(playerOne: Player, playerTwo: Player): Player? {
    val winner: Player? = when {
        bothPlayerHaveSameNumberOfWins(playerOne, playerTwo) -> null
        else -> listOf(playerOne, playerTwo)
            .maxBy(Player::wins)
    }
    return winner
}

fun getLoser(playerOne: Player, playerTwo: Player): Player {
    return listOf(playerOne, playerTwo)
        .minBy(Player::wins)
}

fun bothPlayerHaveSameNumberOfWins(playerOne: Player, playerTwo: Player): Boolean {
    return (playerOne.wins == playerTwo.wins)
}