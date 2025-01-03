package io.github.mikaojk.game

internal fun playGeneralensDilemma() {

}

fun battle(coumptersSoliders: List<Soldier>, yourSoliders: List<Soldier>): BattelResult {

    println("coumptersSoliders to battle: ${coumptersSoliders.size}")
    println("yourSoliders to battle: ${yourSoliders.size}")

    return if (coumptersSoliders.size < yourSoliders.size) {
        BattelResult.YOUWIN
    } else if (coumptersSoliders.size > yourSoliders.size) {
        BattelResult.COUMPTERWINS
    } else {
        BattelResult.DRAW
    }
}

internal fun GameState.playerOneTokNewCard(soildersSendtToBattel: List<Soldier>): GameState? =

    deck.removedTopCard()
        ?.let { (remainingCards, removedCard) ->
            copy(
                playerOne = playerOne.cardAdded(removedCard),
                deck = remainingCards
            )
        }

    soildersSendtToBattel.forEach { soldierToBattel: Soldier ->
        playerOne.soilders.filter { soldier: Soldier ->
            soldier.number == soldierToBattel.number
        }
    }

internal fun List<Soldier>.removedSoilders(): Pair<List<Soldier>, Soldier>? = lastOrNull()
    ?.let { last -> dropLast(1) to last }


internal fun GameState.playeNextStep(): GameState? = when {
    playerOne.battelsWon >= 3 -> null
    playerTwo.battelsWon >= 3 -> null
    playerOne.soilders.isEmpty() -> null
    playerTwo.soilders.isEmpty() -> null
    else -> null
}

fun decideSoldiersToSendToBattel(soldiers: List<Soldier>): List<Soldier> {
    return soldiers.subList( (0..6).random(), (6..soldiers.size).random() - 1)
}

enum class BattelResult {
    YOUWIN, COUMPTERWINS, DRAW
}