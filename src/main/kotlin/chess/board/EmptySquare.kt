package chess.board

import chess.piece.Piece

class EmptySquare(private val color: String) : Tile {
    override fun hasPiece(): Boolean = false
    override fun getPiece(): Piece = throw Error()
    override fun toString(): String = " [Empty $color] "
    override fun getColor() = color
}