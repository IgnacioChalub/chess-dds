package chess.board


interface Board {
    fun getTile(position: Position): Tile
    fun putAt(position: Position, tile: Tile): Tile
    fun betweenLimits(position: Position): Boolean
    override fun toString(): String
}