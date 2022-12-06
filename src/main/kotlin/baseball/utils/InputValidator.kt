package baseball.utils

class InputValidator {
    fun validatePlayerNumbers(inputPlayerNumber: String): List<Int> {
        val numbers = mutableListOf<Int>()
        for (i in inputPlayerNumber) {
            if (isNumber(i.toString()) && i.toString() != "0") {
                numbers.add(Character.getNumericValue(i))
            }
        }
        isValidRange(numbers)
        return numbers
    }

    fun validateRetryNumber(inputCommand: String): Boolean {
        val command = inputCommand.toInt()
        if (command == 1) {
            return true
        }
        if (command == 2) {
            return false
        }
        throw IllegalArgumentException("[ERROR]: 1과 2 중 하나의 숫자만 입력받을 수 있습니다.")
    }

    private fun isNumber(s: String): Boolean {
        return if (s.isNullOrEmpty()) false else s.all { Character.isDigit(it) }
    }

    private fun isValidRange(inputPlayerNumbers: List<Int>): Boolean {
        if (inputPlayerNumbers.size != 3) {
            throw IllegalArgumentException("[ERROR]: 1~9 사이의 3자리 숫자만 입력받을 수 있습니다.")
        }
        return true
    }
}