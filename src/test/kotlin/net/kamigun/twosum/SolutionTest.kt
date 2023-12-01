package net.kamigun.twosum

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource

class SolutionTest {
    private val underTest = Solution()

    @ParameterizedTest
    @MethodSource("data")
    fun `twoSum should return correct result`(nums: IntArray, target: Int, expected: IntArray) {
        val actual = underTest.twoSum(nums, target)
        assertArrayEquals(expected, actual)
    }

    companion object {
        @JvmStatic
        fun data() = listOf(
            Arguments.of(intArrayOf(2, 7, 11, 15), 9, intArrayOf(0, 1)),
            Arguments.of(intArrayOf(3, 2, 4), 6, intArrayOf(1, 2)),
            Arguments.of(intArrayOf(3, 3), 6, intArrayOf(0, 1)),
            Arguments.of(intArrayOf(-1, -2, -3, -4, -5), -8, intArrayOf(2, 4)),
        )
    }
}