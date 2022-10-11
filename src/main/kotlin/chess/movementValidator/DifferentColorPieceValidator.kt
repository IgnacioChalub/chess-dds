package chess.movementValidator

import chess.board.Board
import chess.board.Movement

class DifferentColorPieceValidator : MovementValidator {
    override fun validate(board: Board, movement: Movement): Boolean {
        if(!board.getTile(movement.getTo()).hasPiece()) return true
        return board.getTile(movement.getFrom()).getPiece().getColor() != board.getTile(movement.getTo()).getPiece().getColor()
    }
}