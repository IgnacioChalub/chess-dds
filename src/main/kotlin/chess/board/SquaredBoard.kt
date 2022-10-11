package chess.board

class SquaredBoard(private val board: Array<Array<Tile>>) : Board {

    override fun getTile(position: Position): Tile = board[position.getX()][position.getY()]

    private fun setTile(position: Position, tile: Tile) {
        board[position.getX()][position.getY()] = tile
    }

    override fun putAt(position: Position, tile: Tile): Tile {
        val oldTile = board[position.getX()][position.getY()]
        board[position.getX()][position.getY()] = tile
        return oldTile
    }

    override fun betweenLimits(position: Position): Boolean {
        return position.getX() >= 0 && position.getY() >= 0 && position.getX() <= board.size && position.getY() <= board[0].size
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