package chess.movementValidator

import chess.board.Board
import chess.board.Movement
import kotlin.math.abs

class DistanceMovementValidator(private val limit: Int) : MovementValidator {
    override fun validate(board: Board, movement: Movement): Boolean {
       return (abs(movement.getTo().getX()-movement.getFrom().getY()) + abs(movement.getTo().getY()-movement.getFrom().getY())) <= limit
    }
}