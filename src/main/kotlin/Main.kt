import chess.Factory.ClassicGameFactory
import chess.Factory.ClassicPieceFactory
import chess.Factory.SquaredBoardFactory
import chess.Game

fun main() =
   playClassicGame()
fun playClassicGame() {
    val classicGameFactory = ClassicGameFactory(SquaredBoardFactory(), ClassicPieceFactory())
    val game = classicGameFactory.create()
    val board = game.getBoard()
    println(board.toString())
}