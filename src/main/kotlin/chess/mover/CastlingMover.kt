package chess.CastlingMover

import chess.Mover.Mover
import chess.movementValidator.MovementValidator
import chess.board.Board
import chess.board.Movement

class CastlingMover(
    override val validators: List<MovementValidator>
) : Mover {

    override fun move(board: Board, movement: Movement) { 

    }

}