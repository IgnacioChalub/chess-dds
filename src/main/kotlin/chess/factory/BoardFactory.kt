package chess.factory

import chess.board.Board

interface BoardFactory {
    fun create(): Board
}