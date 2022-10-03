package chess.board

import chess.piece.Piece

interface Tile {
    fun hasPiece(): Boolean
    fun getPiece(): Piece
    fun getColor(): String
    override fun toString(): String
}