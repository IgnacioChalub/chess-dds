package chess.piece

import chess.board.Board
import chess.board.EmptySquare
import chess.board.Movement
import chess.board.OccupiedSquare
import chess.movementValidator.MovementValidator
import chess.mover.Mover

class Piece(
    private val name: String,
    private val color: String,
    private val movers: List<Mover>
) {

    fun move(board: Board, movement: Movement): List<Piece> {
        for(mover in movers) {
          if(mover.validMovement(board, movement)) {
            return mover.move(board, movement) 
          }
        }
        throw Error("Invalid move")
    }

    fun getColor(): String = color

    override fun toString(): String = "${color[0]}/$name"

}