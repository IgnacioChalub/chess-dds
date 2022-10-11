package chess.movementValidator
package chess.movementValidator

import chess.board.Board
import chess.board.Movement
import chess.observables.PieceListener

class HasMovedValidator : MovementValidator, PieceListener {

    private var hasMoved: Boolean = false;
    
    override fun validate(board: Board, movement: Movement): Boolean {
        TODO("Not yet implemented")
    }

    override fun hasMoved() {
        hasMoved = true
    }

}