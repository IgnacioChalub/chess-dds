package chess

import chess.board.Board
import chess.board.Movement
import chess.finishValidator.FinishValidator
import chess.piece.Piece
import java.util.*

class Game (
    private val board: Board,
    private var eatenPieces: List<Piece>,
    private val finishValidators: List<FinishValidator>,
    private var lastColorMovement: String 
){

    fun getBoard(): Board {
        return board;
    }

    fun move(movement: Movement)  {
        if(board.getTile(movement.getFrom()).getPiece().getColor() == lastColorMovement) throw Error("Not your turn")

        val pieceToMove = board.getTile(movement.getFrom()).getPiece()
        val pieces = pieceToMove.move(board, movement)
        eatenPieces = eatenPieces.plus(pieces)
//        checkWinner()
    }

    private fun checkWinner(): String {
      TODO()
    }

    override fun toString(): String {
        var eatenPiecesString = "EATEN PICES: " 
        for (piece in eatenPieces) {
            eatenPiecesString += (piece.toString() + ", ")
        } 
        return board.toString() + "\n" + eatenPiecesString + "\n" 
    }
}