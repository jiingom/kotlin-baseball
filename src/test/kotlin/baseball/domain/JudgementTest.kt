package baseball.domain

import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat

internal class JudgementTest {
    @Test
    fun `맞춘 개수를 반환한다`() {
        assertThat(Judgement().correctCount(listOf(1,2,3), listOf(3,1,2))).isEqualTo(3)
    }
}