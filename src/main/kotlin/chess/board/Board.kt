package chess.board


interface Board {
    fun getTile(position: Position): Tile
    override fun toString(): String
}