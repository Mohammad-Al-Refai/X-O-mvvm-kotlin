open class ViewModel {
    var player_turn = PlayerTurn.X
    var Winner = PlayerTurn.NONE
    var playing_count = 0
    var MAX_PLAYING_COUNT = 9
    var board: MutableList<MutableList<BoardValues>> =
        mutableListOf(
            mutableListOf(BoardValues.N, BoardValues.N, BoardValues.N),
            mutableListOf(BoardValues.N, BoardValues.N, BoardValues.N),
            mutableListOf(BoardValues.N, BoardValues.N, BoardValues.N)
        )

    fun setBoard(x: Int, y: Int, value: BoardValues) {
        val logic = Logic()
        if (board[x][y] == BoardValues.N) {
            board[x][y] = value
            if (logic.check(this) == PlayerTurn.X) {
                Winner = PlayerTurn.X
            } else if (logic.check(this) == PlayerTurn.O) {
                Winner = PlayerTurn.O
            }
            changePlayerTurn()
        } else {
            println("it's full try again !")
        }

    }

    fun changePlayerTurn() {
        playing_count++
        if (playing_count == MAX_PLAYING_COUNT && Winner == PlayerTurn.NONE) {
            Winner = PlayerTurn.EQUAL
        } else {

            if (player_turn == PlayerTurn.X) {
                player_turn = PlayerTurn.O
            } else
                if (player_turn == PlayerTurn.O) {
                    player_turn = PlayerTurn.X
                }

            println("playing count $playing_count")
        }
    }

}

enum class PlayerTurn {
    X, O, NONE, EQUAL
}

enum class BoardValues {
    X, O, N
}