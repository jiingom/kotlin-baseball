package baseball.domain

import baseball.view.OutputView

class Referee {
    private val judgement = Judgement()
    fun compare(computer: List<Int>, player: List<Int>): Boolean {
        val correctCount = judgement.correctCount(computer, player)
        var strike = calculateStrike(computer, player)
        var ball = correctCount - strike
        OutputView().printResult(strike, ball)
        return isGameClear(strike)
    }

    private fun calculateStrike(computer: List<Int>, player: List<Int>): Int {
        var strike = 0
        for (i in player.indices) {
            if (judgement.hasPlace(computer, i, player[i])) {
                strike++
            }
        }
        return strike
    }

    private fun isGameClear(strike: Int): Boolean {
        if (strike == 3) {
            OutputView().printClearMessage()
            return true
        }
        return false
    }
}