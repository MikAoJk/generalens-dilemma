package io.github.mikaojk

import io.github.mikaojk.game.GameState
import io.github.mikaojk.game.Player
import io.github.mikaojk.game.Soldier


fun main() {
    println("Going to start game")

    val initialGameState = GameState(
        playerOne = Player(name= "Computer", soilders = (1..100).map { Soldier(it) }),
        playerTwo = Player(name = "Joakim", soilders = (1..100).map { Soldier(it) })
    )


    //val coumptersSoldiersToBattel = decideSoldiersToSendToBattel(initialGameState)
    /*
        coumptersSoldiersToBattel.forEach { soldierToBattel: Soldier ->
        coumptersSoliders.filter { soldier: Soldier ->
            soldierToBattel.number == soldier.number
        }
    }
    */

    // coumptersSoldiersToBattel.filter {  }

   // val battelResult = battle(coumptersSoldiersToBattel, yourSoliders)

    //println(battelResult)


}
