package io.github.mikaojk


fun main() {

    val battlefields = 5

    val playerOne = Player(name = "Computer", soilders = 100, wins = 0)
    val playerTwo = Player(name = "Joakim", soilders = 100, wins = 0)

    for (i in 0 until battlefields) {
        println("Round number: $i")

        val playerOneSoildersSendToBattlefield = decideSoldiersToSendToBattel(playerOne.soilders)
        val playerTwoSoildersSendToBattlefield = decideSoldiersToSendToBattel(playerTwo.soilders)

        if (playerOneSoildersSendToBattlefield > playerTwoSoildersSendToBattlefield) {
            println("${playerOne.name} winner")
            playerOne.wins++
        } else if (playerTwoSoildersSendToBattlefield > playerOneSoildersSendToBattlefield) {
            println("${playerTwo.name} winner")
            playerTwo.wins++
        } else {
            println("Draw")
        }
        playerOne.soilders = (playerOne.soilders - playerOneSoildersSendToBattlefield)
        playerTwo.soilders = (playerTwo.soilders - playerTwoSoildersSendToBattlefield)
        println("\n")

    }
    printGameResult(playerOne, playerTwo)
}

fun getWinner(playerOne: Player, playerTwo: Player): Player? {
    val winner: Player? = when {
        bothPlayerHaveSameNumberOfWins(playerOne, playerTwo) -> null
        else -> listOf(playerOne, playerTwo)
            .maxBy(Player::wins)
    }
    return winner
}

fun bothPlayerHaveSameNumberOfWins(playerOne: Player, playerTwo: Player): Boolean {
    return (playerOne.wins == playerTwo.wins)
}

fun getLoser(playerOne: Player, playerTwo: Player): Player {
    return listOf(playerOne, playerTwo)
        .minBy(Player::wins)
}

fun printGameResult(playerOne: Player, playerTwo: Player) {
    val winner = getWinner(playerOne, playerTwo)
    println("Game is ended")
    if (winner == null) {
        println("The game ended in a draw")
    } else {
        val loser = getLoser(playerOne, playerTwo)
        println("Winner is:  ${winner.name} with number of wins: ${winner.wins}")
        println("Loser is:  ${loser.name} with number of wins: ${loser.wins}")
    }
}

fun decideSoldiersToSendToBattel(numberOfAvibaleSoldiers: Int): Int {
    return (0..numberOfAvibaleSoldiers).random()
}

data class Player(
    val name: String,
    var soilders: Int,
    var wins: Int
)
