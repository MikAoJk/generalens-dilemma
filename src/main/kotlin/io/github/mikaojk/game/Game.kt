package io.github.mikaojk.game

import io.github.mikaojk.player.Player
import io.github.mikaojk.player.getLoser
import io.github.mikaojk.player.getWinner

fun playGame(playerOne: Player, playerTwo: Player, battlefields: Int) {

    for (i in 0 until battlefields) {
        println("Round number: ${i + 1}")

        val playerOneSoildersSendToBattlefield = soldiersToBattlefield(playerOne.soilders)
        val playerTwoSoildersSendToBattlefield = soldiersToBattlefield(playerTwo.soilders)

        if (playerOneSoildersSendToBattlefield > playerTwoSoildersSendToBattlefield) {
            println("${playerOne.name} wins")
            playerOne.wins++
        } else if (playerTwoSoildersSendToBattlefield > playerOneSoildersSendToBattlefield) {
            println("${playerTwo.name} wins")
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


fun printGameResult(playerOne: Player, playerTwo: Player) {
    val winner = getWinner(playerOne, playerTwo)
    println("Game is ended")
    if (winner == null) {
        println("The game ended in a draw")
        println("PlayerOne is:  ${playerOne.name} with number of wins: ${playerOne.wins}")
        println("PlayerTwo is:  ${playerTwo.name} with number of wins: ${playerTwo.wins}")
    } else {
        val loser = getLoser(playerOne, playerTwo)
        println("Winner is:  ${winner.name} with number of wins: ${winner.wins}")
        println("Loser is:  ${loser.name} with number of wins: ${loser.wins}")
    }
}

fun soldiersToBattlefield(numberOfAvibaleSoldiers: Int): Int {
    return (0..numberOfAvibaleSoldiers).random()
}