package chess.movementValidator

import chess.board.Board
import chess.board.Movement

class HorizontalMovementValidator : MovementValidator {
    override fun validate(board: Board, movement: Movement): Boolean {
       return movement.getFrom().getX() == movement.getTo().getX()
    }
}