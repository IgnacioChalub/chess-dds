package chess.factory

import chess.Game

interface GameFactory {
    fun create(): Game
}