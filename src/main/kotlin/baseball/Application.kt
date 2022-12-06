package baseball

import baseball.controller.GameController

fun main() {
    println("숫자 야구 게임을 시작합니다.")
    val game = GameController()
    game.run()
}