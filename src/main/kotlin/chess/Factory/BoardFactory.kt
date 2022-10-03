package chess.Factory

import chess.board.Board

interface BoardFactory {
    fun create(): Board
}