package chess.piece

import chess.board.Board
import chess.board.EmptySquare
import chess.board.Movement
import chess.board.OccupiedSquare
import chess.movementValidator.MovementValidator

class Piece(
    private val name: String,
    private val color: String,
    private val validators: List<MovementValidator>
) {

    fun move(board: Board, movement: Movement): List<Piece> {
        for(validator in validators) {
            if(!validator.validate(board, movement)) {
              throw Error("invalid move")
            }
        }
        val oldFromTile = board.getTile(movement.getFrom())
        val oldToTile = board.getTile(movement.getTo()) 
        board.putAt(movement.getTo(), OccupiedSquare(oldToTile.getColor(), this))
        board.putAt(movement.getFrom(), EmptySquare(oldFromTile.getColor()))
        if(oldToTile.hasPiece()) return listOf(oldToTile.getPiece())
        return listOf()
    }

    fun getColor(): String = color

    override fun toString(): String = "${color[0]}/$name"

}