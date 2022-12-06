package baseball.view

import baseball.utils.InputValidator
import camp.nextstep.edu.missionutils.Console

class InputView {
    private val userInputValidator = InputValidator()
    fun inputPlayerNumbers(): List<String> {
        return userInputValidator.isCorrectPlayerNumbers(Console.readLine())
    }
}