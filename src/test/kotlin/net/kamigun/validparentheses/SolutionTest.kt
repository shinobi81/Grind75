package net.kamigun.validparentheses

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource

class SolutionTest {
    private val underTest = Solution()

    @ParameterizedTest
    @MethodSource("data")
    fun `isValid should return correct result`(s: String, expected: Boolean) {
        val actual = underTest.isValid(s)
        assertEquals(expected, actual)
    }

    companion object {
        @JvmStatic
        fun data() = listOf(
            Arguments.of("()", true),
            Arguments.of("()[]{}", true),
            Arguments.of("(]", false),
            Arguments.of("(){}}{", false)
        )
    }
}