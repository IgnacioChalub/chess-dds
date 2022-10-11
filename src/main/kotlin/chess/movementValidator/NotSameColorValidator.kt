import chess.board.Board
import chess.board.Movement
import chess.movementValidator.MovementValidator

class NotSameColorValidator : MovementValidator {
    override fun validate(board: Board, movement: Movement): Boolean {
        val toTile = board.getTile(movement.getTo())
        val fromTile = board.getTile(movement.getFrom())
        return !toTile.hasPiece() || !toTile.getPiece().getColor().equals(fromTile.getPiece().getColor())
    }
}