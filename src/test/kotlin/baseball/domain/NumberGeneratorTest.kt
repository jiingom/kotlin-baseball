package baseball.domain

import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat

internal class NumberGeneratorTest {
    @Test
    fun `1~9 사이의 서로 다른 임의의 수를 3개 생성한다`() {
        val computerNumbers = NumberGenerator().createRandomNumbers()
        assertThat(computerNumbers.size == 3)
    }

    @Test
    fun `중복된 숫자를 가질 시 오류가 발생한다`() {
        val computerNumbers = NumberGenerator().createRandomNumbers()
        assertThat(computerNumbers).doesNotHaveDuplicates()
    }
}