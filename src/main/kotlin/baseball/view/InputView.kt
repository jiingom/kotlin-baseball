package baseball.view

import baseball.utils.InputValidator
import camp.nextstep.edu.missionutils.Console

class InputView {
    private val userInputValidator = InputValidator()
    fun inputPlayerNumbers(): List<Int> {
        print("숫자를 입력해주세요 : ")
        return userInputValidator.validatePlayerNumbers(Console.readLine())
    }
}