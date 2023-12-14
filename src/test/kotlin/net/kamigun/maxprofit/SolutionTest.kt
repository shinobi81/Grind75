package net.kamigun.maxprofit

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource

class SolutionTest {
    private val underTest = Solution()

    @ParameterizedTest
    @MethodSource("data")
    fun maxProfit(prices: IntArray, expected: Int) {
        val actual = underTest.maxProfit(prices)

        assertEquals(expected, actual)
    }

    companion object {
        @JvmStatic
        fun data() = listOf(
            Arguments.of(intArrayOf(7, 1, 5, 3, 6, 4), 5),
            Arguments.of(intArrayOf(7, 6, 4, 3, 1), 0)
        )
    }
}
