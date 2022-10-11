package chess.board

import chess.piece.Piece

class OccupiedSquare(private val color: String, private val piece: Piece) : Tile {
    override fun hasPiece(): Boolean = true
    override fun getPiece(): Piece = piece
    override fun toString(): String = " [${piece.toString()} ${color[0]}] "
    override fun getColor() = color
}
