package chess.Factory

import chess.piece.Piece

class ClassicPieceFactory {
    fun pawn(color: String): Piece {
        return Piece("PAWN", color, listOf())
    }
    fun bishop(color: String): Piece {
        return Piece("BISHOP", color, listOf())
    }
    fun knight(color: String): Piece {
        return Piece("KNIGHT", color, listOf())
    }
    fun rook(color: String): Piece {
        return Piece("ROOK", color, listOf())
    }
    fun queen(color: String): Piece {
        return Piece("QUEEN", color, listOf())
    }
    fun king(color: String): Piece {
        return Piece("KING", color, listOf())
    }
}