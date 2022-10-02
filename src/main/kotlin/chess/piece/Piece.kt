package chess.piece

import chess.board.Board
import chess.board.Movement
import chess.movementValidator.MovementValidator

class Piece(
    private val name: String,
    private val color: String,
    private val validators: List<MovementValidator>
) {

    fun move(board: Board, movement: Movement): List<Piece> {
       TODO()
    }

}