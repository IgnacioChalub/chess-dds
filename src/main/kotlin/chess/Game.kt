package chess

import chess.board.Board
import chess.board.Movement
import chess.board.Position
import chess.board.SquaredBoard
import chess.finishValidator.CheckMateValidator
import chess.finishValidator.FinishValidator
import chess.piece.Piece
import java.util.Stack

class Game (
    private val board: Board,
    private val eatenPieces: List<Piece>,
    private val movements: Stack<Movement>,
    private val finishValidators: List<FinishValidator>
){

    fun getBoard(): Board {
        return board;
    }
    fun move(movement: Movement)  {

    }

   private fun checkWinner(): String {
      TODO()
   }


}