class View : ViewModel() {
    fun render() {
        println(
            """ 
    0    1    2                  
0 [ ${board[0][0]} ][ ${board[0][1]} ][ ${board[0][2]} ]
1 [ ${board[1][0]} ][ ${board[1][1]} ][ ${board[1][2]} ]
2 [ ${board[2][0]} ][ ${board[2][1]} ][ ${board[2][2]} ]

        """.trimIndent()
        )
    }
    fun Input(){
      try {
          println("$player_turn turn!")
          print("Enter offset: ")
          val input= readln()
          val point=input.split(" ")
          when(player_turn){
              PlayerTurn.X -> setBoard(point[0].toInt(),point[1].toInt(),BoardValues.X)
              PlayerTurn.O -> setBoard(point[0].toInt(),point[1].toInt(),BoardValues.O)
          }
      }catch (error:Exception){
         println("offset is invalid")
      }

    }
}