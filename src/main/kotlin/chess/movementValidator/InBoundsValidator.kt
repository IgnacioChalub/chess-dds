package chess.movementValidator

import chess.board.Board
import chess.board.Movement

class InBoundsValidator : MovementValidator {
    override fun validate(board: Board, movement: Movement): Boolean {
       return board.betweenLimits(movement.getFrom()) && board.betweenLimits(movement.getTo())
    }
}