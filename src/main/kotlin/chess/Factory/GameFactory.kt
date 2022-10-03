package chess.Factory

import chess.Game

interface GameFactory {
    fun create(): Game
}