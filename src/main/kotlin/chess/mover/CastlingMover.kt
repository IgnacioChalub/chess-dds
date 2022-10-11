package chess.mover

import chess.movementValidator.MovementValidator
import chess.board.Board
import chess.board.Movement
import chess.piece.Piece

class CastlingMover(
    override val validators: List<MovementValidator>
) : Mover {

    override fun move(board: Board, movement: Movement): List<Piece> { 
        TODO()
    }

    override fun validMovement(board: Board, movement: Movement): Boolean {
        return validators.all {it.validate(board, movement)}
    }

}