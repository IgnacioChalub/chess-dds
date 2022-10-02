package chess.board

import chess.piece.Piece

class OccupiedSquare(private val piece: Piece) : Tile {
    override fun hasPiece(): Boolean = true
    override fun getPiece(): Piece = getPiece()
}
