package baseball.controller

import baseball.domain.NumberGenerator
import baseball.domain.Referee
import baseball.view.InputView

class GameController {
    fun run() {
        var flag = true
        while (flag) {
            val computerNumbers = NumberGenerator().createRandomNumbers()
            gameProgress(computerNumbers)
            flag = retryGame()
        }
    }

    private fun gameProgress(numbers: List<Int>) {
        var flag = false
        println(numbers)
        while (!flag) {
            val playerInput = InputView().inputPlayerNumbers()
            flag = Referee().compare(numbers, playerInput)
        }
    }

    private fun retryGame(): Boolean {
        return InputView().inputRetry()
    }
}