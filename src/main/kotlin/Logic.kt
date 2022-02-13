class Logic {
//    0 [ ${board[0][0]} ][ ${board[0][1]} ][ ${board[0][2]} ]
//    1 [ ${board[1][0]} ][ ${board[1][1]} ][ ${board[1][2]} ]
//    2 [ ${board[2][0]} ][ ${board[2][1]} ][ ${board[2][2]} ]

    fun check(viewModel: ViewModel): PlayerTurn {
        val board = viewModel.board
        // X
        if (board[0][0] == BoardValues.X && board[0][1] == BoardValues.X && board[0][2] == BoardValues.X) return PlayerTurn.X
        if (board[1][0] == BoardValues.X && board[1][1] == BoardValues.X && board[1][2] == BoardValues.X) return PlayerTurn.X
        if (board[2][0] == BoardValues.X && board[2][1] == BoardValues.X && board[2][2] == BoardValues.X) return PlayerTurn.X
        if (board[0][0] == BoardValues.X && board[1][1] == BoardValues.X && board[2][2] == BoardValues.X) return PlayerTurn.X
        if (board[0][2] == BoardValues.X && board[1][1] == BoardValues.X && board[2][0] == BoardValues.X) return PlayerTurn.X
        // O
        if (board[0][0] == BoardValues.O && board[0][1] == BoardValues.O && board[0][2] == BoardValues.O) return PlayerTurn.O
        if (board[1][0] == BoardValues.O && board[1][1] == BoardValues.O && board[1][2] == BoardValues.O) return PlayerTurn.O
        if (board[2][0] == BoardValues.O && board[2][1] == BoardValues.O && board[2][2] == BoardValues.O) return PlayerTurn.O
        if (board[0][0] == BoardValues.O && board[1][1] == BoardValues.O && board[2][2] == BoardValues.O) return PlayerTurn.O
        if (board[0][2] == BoardValues.O && board[1][1] == BoardValues.O && board[2][0] == BoardValues.O) return PlayerTurn.O
        return PlayerTurn.NONE
    }
}