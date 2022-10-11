package chess.observables

interface Observable {
    val listeners: List<Listener>
    fun notifyAll()
}