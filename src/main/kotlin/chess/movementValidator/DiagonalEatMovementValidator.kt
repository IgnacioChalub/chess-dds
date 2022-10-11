package chess.movementValidator

import chess.board.Board
import chess.board.Movement

class DiagonalEatMovementValidator(
    private val diagonalMovementValidator: DiagonalMovementValidator,
    private val distanceMovementValidator: DistanceMovementValidator,
    private val differentColorPieceValidator: DifferentColorPieceValidator
) : MovementValidator {
    override fun validate(board: Board, movement: Movement): Boolean {
        return differentColorPieceValidator.validate(board, movement)
                && diagonalMovementValidator.validate(board, movement)
                && distanceMovementValidator.validate(board, movement)
                && board.getTile(movement.getTo()).hasPiece()
    }
}