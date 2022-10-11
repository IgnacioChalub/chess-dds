import chess.board.Board
import chess.board.Movement
import chess.movementValidator.MovementValidator

class NotSameTileValidator : MovementValidator {
    override fun validate(board: Board, movement: Movement): Boolean {
       return !movement.getFrom().equals(movement.getTo())
    }
}