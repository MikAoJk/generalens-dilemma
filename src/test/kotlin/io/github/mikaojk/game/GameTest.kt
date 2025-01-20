package io.github.mikaojk.game

import io.github.mikaojk.player.Player
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class GameTest {

    @Test
    internal fun `Player one should have 0 wins`() {
        val playerOne = Player(name = "Computer", soilders = 0, wins = 0)
        val playerTwo = Player(name = "Joakim", soilders = 100, wins = 0)
        playGame(playerOne, playerTwo, 5)

        assertEquals(0, playerOne.wins)
    }
}