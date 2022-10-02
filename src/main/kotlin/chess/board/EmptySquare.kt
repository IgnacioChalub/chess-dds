package chess.board

import chess.piece.Piece

class EmptySquare : Tile {
    override fun hasPiece(): Boolean = false
    override fun getPiece(): Piece = throw Error()
}