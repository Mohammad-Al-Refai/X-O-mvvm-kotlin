fun main() {
    val view = View()
    while (view.Winner == PlayerTurn.NONE) {
        view.render()
        view.Input()
    }

    if (view.Winner == PlayerTurn.EQUAL) {
        println("---------------------------------------------")
        view.render()
        println("No one wins")
    } else {
        println("---------------------------------------------")
        view.render()
        println("${view.Winner} is win")
    }
}
