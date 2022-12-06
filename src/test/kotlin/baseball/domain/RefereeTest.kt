package baseball.domain

import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat

internal class RefereeTest {
    @Test
    fun `스트라이크가 3개일 시 게임 클리어`() {
        val referee = Referee()
        assertThat(referee.compare(listOf(1,2,3), listOf(1,2,3))).isTrue
    }

    @Test
    fun `스트라이크가 3개가 아닐 시 게임 클리어 실패`() {
        val referee = Referee()
        assertThat(referee.compare(listOf(1,2,3), listOf(3,2,1))).isFalse
    }
}