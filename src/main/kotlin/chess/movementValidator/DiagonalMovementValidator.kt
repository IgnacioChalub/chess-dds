package chess.movementValidator

import chess.board.Board
import chess.board.Movement
import kotlin.math.abs

class DiagonalMovementValidator : MovementValidator {
    override fun validate(board: Board, movement: Movement): Boolean {
        return abs(movement.getFrom().getX() - movement.getTo().getX()) == abs(movement.getFrom().getY() - movement.getTo().getY())
    }
}