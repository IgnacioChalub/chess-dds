import chess.factory.ClassicGameFactory
import chess.factory.ClassicPieceFactory
import chess.factory.SquaredBoardFactory

fun main() =
   playClassicGame()

fun playClassicGame() {
    val classicGameFactory = ClassicGameFactory(SquaredBoardFactory(), ClassicPieceFactory())
    val game = classicGameFactory.create()
    val board = game.getBoard()
    println(board.toString())
}