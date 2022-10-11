package chess.movementValidator

import chess.board.Board
import chess.board.Movement
import chess.piece.Piece

class VerticalMovementValidator() : MovementValidator {
    override fun validate(board: Board, movement: Movement): Boolean {
        return movement.getFrom().getY() == movement.getTo().getY()
    }
}