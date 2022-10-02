package chess.movementValidator

import chess.board.Board
import chess.board.Movement

interface MovementValidator {
    fun validate(board: Board, movement: Movement): Boolean;
}