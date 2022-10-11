package chess.movementValidator

import chess.board.Board
import chess.board.Movement
import chess.piece.Piece

interface MovementValidator {
    fun validate(board: Board, movement: Movement): Boolean;
}