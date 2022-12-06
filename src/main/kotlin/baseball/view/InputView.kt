package baseball.view

import baseball.utils.InputValidator
import camp.nextstep.edu.missionutils.Console

class InputView {
    private val userInputValidator = InputValidator()
    fun inputPlayerNumbers(): List<Int> {
        print("숫자를 입력해주세요 : ")
        return userInputValidator.validatePlayerNumbers(Console.readLine())
    }

    fun inputRetry(): Boolean {
        println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.")
        return userInputValidator.validateRetryNumber(Console.readLine())
    }
}