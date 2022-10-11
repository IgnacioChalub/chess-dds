package chess.mover

import chess.movementValidator.MovementValidator
import chess.board.Board
import chess.board.Movement
import chess.board.OccupiedSquare
import chess.board.EmptySquare
import chess.piece.Piece

class ClassicMover(
    override val validators: List<MovementValidator>
) : Mover {

    override fun move(board: Board, movement: Movement): List<Piece> { 
        val oldFromTile = board.getTile(movement.getFrom())
        val oldToTile = board.getTile(movement.getTo()) 
        board.putAt(movement.getTo(), OccupiedSquare(oldToTile.getColor(), oldFromTile.getPiece()))
        board.putAt(movement.getFrom(), EmptySquare(oldFromTile.getColor()))
        if(oldToTile.hasPiece()) return listOf(oldToTile.getPiece())
        return listOf()
    }

    override fun validMovement(board: Board, movement: Movement): Boolean {
        return validators.all {it.validate(board, movement)}
    }
    
}