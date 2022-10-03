package chess.board

import chess.movementValidator.MovementValidator
import chess.piece.Piece
import java.lang.Error
import java.util.Arrays

class SquaredBoard(private val board: Array<Array<Tile>>) : Board {

    override fun getTile(position: Position): Tile {
        TODO("Not yet implemented")
    }

    fun putAt(position: Position, piece: Piece) {
        val tile = board[position.getX()][position.getY()]
        if(tile.hasPiece()) throw Error()
        board[position.getX()][position.getY()] = OccupiedSquare(tile.getColor(), piece)
    }

    override fun toString(): String {
        var string = ""
        for (i in 7 downTo 0) {
            for (j in 0..7) {
                string += board[i][j].toString()
            }
            string += "\n"
        }
        return string
    }

}