package baseball.domain

import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat

internal class JudgementTest {
    @Test
    fun `맞춘 개수를 반환한다`() {
        assertThat(Judgement().correctCount(listOf(1,2,3), listOf(3,1,2))).isEqualTo(3)
    }

    @Test
    fun `특정 자리에 특정 숫자가 있는지 확인한다(스트라이크)`() {
        assertThat(Judgement().hasPlace(listOf(1,2,3), 0, 1)).isTrue
    }
}