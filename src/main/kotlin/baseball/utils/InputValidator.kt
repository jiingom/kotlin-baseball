package baseball.utils

class InputValidator {
    fun isCorrectPlayerNumbers(inputPlayerNumber: String): List<String> {
        val inputPlayerNums = inputPlayerNumber.split("")
        isValidRange(inputPlayerNums)
        isCorrectPlayerNumbers(inputPlayerNums)
        return inputPlayerNums
    }

    private fun isNumber(s: String?): Boolean {
        return if (s.isNullOrEmpty()) false else s.all { Character.isDigit(it) }
    }

    private fun isValidRange(inputPlayerNumbers: List<String>): Boolean {
        if (inputPlayerNumbers.size != 3) {
            throw IllegalArgumentException("[ERROR]")
        }
        return true
    }

    private fun isCorrectPlayerNumbers(inputPlayerNumbers: List<String>) {
        for (number in inputPlayerNumbers) {
            if (!isNumber(number)) {
                throw IllegalArgumentException("[ERROR]")
            }
        }
    }
}