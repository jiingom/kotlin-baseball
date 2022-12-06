package baseball.view

class OutputView {
    fun printResult(strike: Int, ball: Int) {
        var resultString = ""
        if (strike == 0 && ball == 0) {
            resultString += "낫싱"
        }
        if (ball > 0) {
            resultString += ball
            resultString += "볼 "
        }
        if (strike > 0) {
            resultString += strike
            resultString += "스트라이크"
        }
        println(resultString)
    }

    fun printClearMessage() {
        println("3개의 숫자를 모두 맞히셨습니다! 게임 종료")
    }
}