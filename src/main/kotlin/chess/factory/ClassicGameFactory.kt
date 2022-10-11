package chess.factory

import chess.Game
import chess.board.Movement
import chess.board.OccupiedSquare
import chess.board.Position
import chess.finishValidator.CheckMateValidator
import chess.finishValidator.FinishValidator
import chess.piece.Piece
import java.util.*

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
                board.putAt(Position(1,i), OccupiedSquare(board.getTile(Position(1,i)).getColor(), classicPieceFactory.pawn("WHITE")))
                board.putAt(Position(6,i), OccupiedSquare(board.getTile(Position(6,i)).getColor(), classicPieceFactory.pawn("BLACK")))
            }
            board.putAt(Position(0,0), OccupiedSquare(board.getTile(Position(0,0)).getColor(), classicPieceFactory.rook("WHITE")))
            board.putAt(Position(0,7),OccupiedSquare(board.getTile(Position(0,7)).getColor(),  classicPieceFactory.rook("WHITE")))
            board.putAt(Position(0,1),OccupiedSquare(board.getTile(Position(0,1)).getColor(),  classicPieceFactory.bishop("WHITE")))
            board.putAt(Position(0,6),OccupiedSquare(board.getTile(Position(0,6)).getColor(),  classicPieceFactory.bishop("WHITE")))
            board.putAt(Position(0,2),OccupiedSquare(board.getTile(Position(0,2)).getColor(),  classicPieceFactory.knight("WHITE")))
            board.putAt(Position(0,5),OccupiedSquare(board.getTile(Position(0,5)).getColor(),  classicPieceFactory.knight("WHITE")))
            board.putAt(Position(0,3),OccupiedSquare(board.getTile(Position(0,3)).getColor(),  classicPieceFactory.queen("WHITE")))
            board.putAt(Position(0,4),OccupiedSquare(board.getTile(Position(0,4)).getColor(),  classicPieceFactory.king("WHITE")))

            board.putAt(Position(7,0),OccupiedSquare(board.getTile(Position(7,0)).getColor(),  classicPieceFactory.rook("BLACk")))
            board.putAt(Position(7,7),OccupiedSquare(board.getTile(Position(7,7)).getColor(),  classicPieceFactory.rook("BLACK")))
            board.putAt(Position(7,1),OccupiedSquare(board.getTile(Position(7,1)).getColor(),  classicPieceFactory.bishop("BLACK")))
            board.putAt(Position(7,6),OccupiedSquare(board.getTile(Position(7,6)).getColor(),  classicPieceFactory.bishop("BLACK")))
            board.putAt(Position(7,2),OccupiedSquare(board.getTile(Position(7,2)).getColor(),  classicPieceFactory.knight("BLACK")))
            board.putAt(Position(7,5),OccupiedSquare(board.getTile(Position(7,5)).getColor(),  classicPieceFactory.knight("BLACK")))
            board.putAt(Position(7,3),OccupiedSquare(board.getTile(Position(7,3)).getColor(),  classicPieceFactory.queen("BLACK")))
            board.putAt(Position(7,4),OccupiedSquare(board.getTile(Position(7,4)).getColor(),  classicPieceFactory.king("BLACK")))

            return Game(
                board,
                ArrayList<Piece>(),
                finishValidators,
                "BLACK",
            )
    }

}