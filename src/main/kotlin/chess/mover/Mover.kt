

package chess.Mover
import chess.movementValidator.MovementValidator
import chess.board.Movement
import chess.board.Board
import chess.piece.Piece

interface Mover{
    val validators: List<MovementValidator>
    fun move(board: Board, movement: Movement)
}