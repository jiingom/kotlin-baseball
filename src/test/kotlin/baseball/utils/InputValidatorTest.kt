package baseball.utils

import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource

internal class InputValidatorTest {
    @ValueSource(strings = ["abc", "12a"])
    @ParameterizedTest
    fun `1~9사이의 숫자가 아닌 경우 예외가 발생한다`(input: String) {
        assertThrows<IllegalArgumentException> { InputValidator().validatePlayerNumbers(input) }
    }

    @ValueSource(strings = ["1", "12", "1234"])
    @ParameterizedTest
    fun `3자리의 수가 아닌 경우 예외가 발생한다`(input: String) {
        assertThrows<IllegalArgumentException> { InputValidator().validatePlayerNumbers(input) }
    }
}