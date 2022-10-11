package chess.board

class Movement (private val from: Position, private val to: Position){
    fun getFrom(): Position = from
    fun getTo(): Position = to
    fun getXMovement(): Int = to.getX() - from.getX()
    fun getYMovement(): Int = to.getY() - from.getY()
}