package chess.factory

import chess.piece.Piece
import chess.movementValidator.InBoundsValidator
import chess.movementValidator.DiagonalMovementValidator
import chess.movementValidator.HorizontalMovementValidator
import chess.movementValidator.VerticalMovementValidator
import chess.movementValidator.DistanceMovementValidator
import chess.movementValidator.HasMovedValidator
import chess.movementValidator.EatsValidator
import chess.mover.ClassicMover
import NotSameTileValidator

class ClassicPieceFactory {
    fun pawn(color: String): Piece {
        return Piece("PAWN", color, listOf(
            ClassicMover(
                listOf(
                    NotSameTileValidator(),
                    InBoundsValidator(),
                    VerticalMovementValidator(),
                    DistanceMovementValidator(1)
                )
            ),
            ClassicMover(
                listOf(
                    NotSameTileValidator(),
                    InBoundsValidator(),
                    VerticalMovementValidator(),
                    DistanceMovementValidator(2),
                    HasMovedValidator() 
                )
            ),
            ClassicMover(
                listOf(
                    NotSameTileValidator(),
                    InBoundsValidator(),
                    VerticalMovementValidator(),
                    DistanceMovementValidator(1),
                    EatsValidator()
                )
            ),
        ))
    }
    fun bishop(color: String): Piece {
        return Piece("BISHOP", color, listOf(
            NotSameTileValidator(),
            InBoundsValidator(),
            DiagonalMovementValidator()
        ))
    }
    fun knight(color: String): Piece {
        return Piece("KNIGHT", color, listOf(
            NotSameTileValidator(),
            InBoundsValidator(),

        ))
    }
    fun rook(color: String): Piece {
        return Piece("ROOK", color, listOf(
            NotSameTileValidator(),
            InBoundsValidator(),
            HorizontalMovementValidator(),
            VerticalMovementValidator(), 
        ))
    }
    fun queen(color: String): Piece {
        return Piece("QUEEN", color, listOf(
            NotSameTileValidator(),
            InBoundsValidator(),
            HorizontalMovementValidator(),
            VerticalMovementValidator(),
            DiagonalMovementValidator()
        ))
    }
    fun king(color: String): Piece {
        return Piece("KING", color, listOf(
            NotSameTileValidator(),
            NotSameTileValidator(),
            InBoundsValidator(),
            HorizontalMovementValidator(),
            VerticalMovementValidator(),
            DiagonalMovementValidator(),
            DistanceMovementValidator(1)
        ))
    }
}