package chess.Factory

import chess.Game
import chess.board.Movement
import chess.board.Position
import chess.finishValidator.CheckMateValidator
import chess.finishValidator.FinishValidator
import chess.piece.Piece
import java.util.*
import kotlin.collections.ArrayList

class ClassicGameFactory(
    private val squaredBoardFactory: SquaredBoardFactory,
    private val classicPieceFactory: ClassicPieceFactory
) {

    fun create(): Game {
            val finishValidators = listOf<FinishValidator>(
                CheckMateValidator()
            )
            val board = squaredBoardFactory.create()
            for (i in 0..7) {
                board.putAt(Position(1,i), classicPieceFactory.pawn("WHITE"))
                board.putAt(Position(6,i), classicPieceFactory.pawn("BLACK"))
            }
            board.putAt(Position(0,0), classicPieceFactory.rook("WHITE"))
            board.putAt(Position(0,7), classicPieceFactory.rook("WHITE"))
            board.putAt(Position(0,1), classicPieceFactory.bishop("WHITE"))
            board.putAt(Position(0,6), classicPieceFactory.bishop("WHITE"))
            board.putAt(Position(0,2), classicPieceFactory.knight("WHITE"))
            board.putAt(Position(0,5), classicPieceFactory.knight("WHITE"))
            board.putAt(Position(0,3), classicPieceFactory.queen("WHITE"))
            board.putAt(Position(0,4), classicPieceFactory.king("WHITE"))

            board.putAt(Position(7,0), classicPieceFactory.rook("BLACk"))
            board.putAt(Position(7,7), classicPieceFactory.rook("BLACK"))
            board.putAt(Position(7,1), classicPieceFactory.bishop("BLACK"))
            board.putAt(Position(7,6), classicPieceFactory.bishop("BLACK"))
            board.putAt(Position(7,2), classicPieceFactory.knight("BLACK"))
            board.putAt(Position(7,5), classicPieceFactory.knight("BLACK"))
            board.putAt(Position(7,3), classicPieceFactory.queen("BLACK"))
            board.putAt(Position(7,4), classicPieceFactory.king("BLACK"))

            return Game(
                board,
                ArrayList<Piece>(),
                Stack<Movement>(),
                finishValidators
            )
    }

}