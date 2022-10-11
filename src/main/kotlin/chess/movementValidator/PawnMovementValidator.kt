package chess.movementValidator

import chess.board.Board
import chess.board.Movement

class PawnMovementValidator(
    private val verticalMovementValidator: VerticalMovementValidator,
    private val distanceMovementValidator: DistanceMovementValidator,
    private val hasMoved: Boolean
) : MovementValidator {

    companion object Factory {
        fun create(): PawnMovementValidator {
            return PawnMovementValidator(
                VerticalMovementValidator(),
                DistanceMovementValidator(2),
                false
            )
        }
    }

    override fun validate(board: Board, movement: Movement): Boolean {
       return verticalMovementValidator.validate(board, movement) && distanceMovementValidator.validate(board, movement)
    }
}