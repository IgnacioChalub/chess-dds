package chess.board

import chess.piece.Piece

class OccupiedSquare(private val color: String, private val piece: Piece) : Tile {
    override fun hasPiece(): Boolean = true
    override fun getPiece(): Piece = getPiece()
    override fun toString(): String = " [${piece.toString()} $color] "
    override fun getColor() = color
}
