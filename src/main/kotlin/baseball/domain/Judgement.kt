package baseball.domain

class Judgement {
    fun correctCount(computer: List<Int>, player: List<Int>): Int {
        var result = 0
        for (i in computer.indices) {
            if (computer.contains(player[i])) {
                result++
            }
        }
        return result
    }

    fun hasPlace(computer: List<Int>, placeIndex: Int, number: Int): Boolean {
        return computer[placeIndex] == number
    }
}