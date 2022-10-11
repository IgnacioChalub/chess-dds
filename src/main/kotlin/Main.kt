import chess.board.Movement
import chess.board.Position
import chess.factory.ClassicGameFactory
import chess.factory.ClassicPieceFactory
import chess.factory.SquaredBoardFactory

fun main() =
   playClassicGame()

fun playClassicGame() {
    val classicGameFactory = ClassicGameFactory(SquaredBoardFactory(), ClassicPieceFactory())
    val game = classicGameFactory.create()
    println(game.toString())
    game.move(Movement(Position(1,1), Position(6,1)))
    println(game.toString())
}